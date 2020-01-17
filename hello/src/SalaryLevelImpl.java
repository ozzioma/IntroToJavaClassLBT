public class SalaryLevelImpl implements SalaryLevelInterface, Payroll
{
    private String grade;
    private double salary;

//    public SalaryLevel()
//    {
//
//    }

    public SalaryLevelImpl(double _salary,String _grade)
    {
        setSalary(_salary);
        setGrade(_grade);

//        this.salary=_salary;
//        this.grade=_grade;

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

    //polymorphism
    @Override
    public double calculateSalary()
    {
        return salary*2;
    }

    @Override
    public boolean isProcessed() {
        return false;
    }
//
//    //polymorphism, same method,same name, difft params
    public double calculateSalary(double multiplier)
    {
        return salary*multiplier;
    }


}
