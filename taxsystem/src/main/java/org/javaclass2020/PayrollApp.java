package org.javaclass2020;

import java.sql.*;
//package org.jclass2020.gra;

public class PayrollApp
{

    public static void main(String[] args)
    {
        testConnect();
        testSelect();
    }

    private static Connection connection;

    static void testConnect()
    {
        try
        {
            String name = "Chief Ozzy";
            //String name2='Chief Ozzy';

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://157.245.65.64/javaclass2", "ozzy", "#Abcqr123");

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    static void testSelect()
    {
        try
        {

            String selectSql = "SELECT * FROM demo";
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);

            //boolean hasData=false;

            while (resultSet.next())
            {
                System.out.println(resultSet.getString("name"));

               // hasData=resultSet.next();
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }


    }
}
