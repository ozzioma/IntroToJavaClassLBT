package org.javaclass2020;

public class SalaryGrade
{
    private double salary;

    private double deduction;
    private double overtime;
    private String description;

    private String grade;

    public double getDeduction()
    {
        return deduction;
    }

    public void setDeduction(double deduction)
    {
        this.deduction = deduction;
    }

    public double getOvertime()
    {
        return overtime;
    }

    public void setOvertime(double overtime)
    {
        this.overtime = overtime;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
