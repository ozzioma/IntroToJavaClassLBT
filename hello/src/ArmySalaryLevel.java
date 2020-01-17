public class ArmySalaryLevel extends SalaryLevel {

    private double deductions;
    private double overTime;
    public static final double DEDUCTION_LIMIT =5000;

    public ArmySalaryLevel()
    {
        super(1000,"123");
        //setOverTime(123);
        this.getSalary();
    }

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
    throws InvalidDeductionException
    {
        //first of all, do parameter validation

        if(totalDeductions > DEDUCTION_LIMIT)
        {
            throw new InvalidDeductionException(
                    "Deduction limit exceeded"
                    ,totalDeductions);
        }

        this.setOverTime(totalOvertime);
        setDeductions(totalDeductions);

        double baseSalary=getSalary()*3;

        double divider=baseSalary/43545.6565;
        double netSalary=(baseSalary+totalOvertime)-totalDeductions;
        return netSalary/divider;
    }

    public double calculateSalary2(double totalDeductions,
                                  double totalOvertime)
    {
        if(totalDeductions > DEDUCTION_LIMIT)
        {
            throw new InvalidDeductionRuntimeException(
                    "Deduction limit exceeded"
                    ,totalDeductions);
        }

        this.setOverTime(totalOvertime);
        setDeductions(totalDeductions);

        double baseSalary=getSalary()*3;

        double divider=baseSalary/43545.6565;
        double netSalary=(baseSalary+totalOvertime)-totalDeductions;
        return netSalary/divider;
    }
}
