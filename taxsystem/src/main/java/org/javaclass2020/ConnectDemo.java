package org.javaclass2020;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectDemo
{

    public static void main(String[] args)
    {
        openConnection();
        //insertRows();

        runSelect2();
    }

    static String url = "jdbc:mysql://157.245.65.64:3306/javaclass2";
    //jdbc:{name of db}://{address of db server}:port/{name of db}
    static Connection connection;
    static String userName = "ozzy";
    static String password = "#Abcqr123";

    static String selectSQL = "select grade,salary from salarygrades2";
    static String insertSQL = "insert into salarygrades (grade, salary,description) values ('G6',280000,'ballalala')";

    public static void openConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, userName, password);

        } catch (SQLException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void runSelect()
    {
        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectSQL);

            while (rows.next())
            {
                String grade = rows.getString("grade");
                double salary = rows.getDouble("salary");
                System.out.println("salary for grade " + grade + " is= " + salary);
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void runSelect2()
    {
        List<SalaryGrade> grades = getGrades();
        for (SalaryGrade grade : grades)
        {
            System.out.println("salary for grade " + grade.getGrade()
                    + " is= " + grade.getSalary());
        }
    }


    public static List<SalaryGrade> getGrades()
    {
        List<SalaryGrade> grades = new ArrayList<SalaryGrade>();

        try
        {
            Statement jdbcStatement = connection.createStatement();
            ResultSet rows = jdbcStatement.executeQuery(selectSQL);

            while (rows.next())
            {
                String grade = rows.getString("grade");
                double salary = rows.getDouble("salary");
                //System.out.println("salary for grade " + grade + " is= " + salary);

                SalaryGrade salaryGrade = new SalaryGrade();
                salaryGrade.setGrade(grade);
                salaryGrade.setSalary(salary);

                grades.add(salaryGrade);
            }


        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return grades;

    }

    private static void insertRows()
    {

        try
        {
            //1. Get a statement object from the connection
            Statement insertStatement = connection.createStatement();
            int rowsAffected = insertStatement.executeUpdate(insertSQL);

            System.out.println("rows affected->" + rowsAffected);
            runSelect();

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
