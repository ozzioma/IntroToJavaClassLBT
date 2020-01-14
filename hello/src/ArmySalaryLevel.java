public class ArmySalaryLevel extends SalaryLevel {

    private double deductions;
    private double overTime;

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    //annotation
    //inheritance + method overriding
    @Override
    public double calculateSalary()
    {
        return this.getSalary()*3;
        //return super.calculateSalary();
    }

    //inheritance + method overriding
    @Override
    public double calculateSalary(double multiplier) {
        return super.calculateSalary(multiplier);
    }

    //polymorphism not inheritance
    public double calculateSalary(double totalDeductions,
                                  double totalOvertime)
    {
        this.setOverTime(totalOvertime);
        setDeductions(totalDeductions);

        double baseSalary=getSalary()*3;

        double netSalary=(baseSalary+totalOvertime)-totalDeductions;
        return netSalary;
    }
}
