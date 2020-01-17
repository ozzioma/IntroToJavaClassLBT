public class Casting
{
    public static void main(String[] args)
    {
        NNPCSalaryLevel nnpcSalaryLevel=new NNPCSalaryLevel();
        nnpcSalaryLevel.setSalary(1000);
        nnpcSalaryLevel.setBonus(200);
        nnpcSalaryLevel.setGrade("Level 15");

        ArmySalaryLevel armySalaryLevel=new ArmySalaryLevel();
        armySalaryLevel.setSalary(4000);
        armySalaryLevel.setDeductions(500);
        armySalaryLevel.setOverTime(300);
        armySalaryLevel.setGrade("Level 16");

        SalaryLevel salaryLevel=new SalaryLevel(3000,"345");
        salaryLevel.setSalary(6000);
        salaryLevel.setGrade("Level 12");

         processSalary(nnpcSalaryLevel);
         processSalary(armySalaryLevel);
         processSalary(salaryLevel);

        processSalary2(nnpcSalaryLevel);
        processSalary2(armySalaryLevel);
        processSalary2(salaryLevel);

        //processArmySalary(salaryLevel);
         //processArmySalary(nnpcSalaryLevel);

         //TaxBracket taxBracket=new TaxBracket();
         //processSalary(taxBracket);
    }

    public static void processSalary(SalaryLevel level)
    {
        double netSalary=0;
        if(level instanceof ArmySalaryLevel)
        {
            System.out.println("Level is Army salary level");

            ArmySalaryLevel armySalaryLevel=(ArmySalaryLevel) level;
            System.out.println("Army salary grade overtime is->"+armySalaryLevel.getOverTime());
        }
        else if(level instanceof  NNPCSalaryLevel)
        {

            System.out.println("Level is NNPC salary level");

        }
        else
        {
            System.out.println("Level is default salary level");
        }


    }

    public static void processSalary2(SalaryLevelInterface level)
    {
        double netSalary=0;

        //SalaryLevelInterface levelInterface=new SalaryLevelInterface();

        ArmySalaryLevel army=new ArmySalaryLevel();
        SalaryLevel army2=new ArmySalaryLevel();
        SalaryLevelInterface army3=new ArmySalaryLevel();

        System.out.println("Calculated salary is->"+level.calculateSalary());

        if(level instanceof ArmySalaryLevel)
        {
            System.out.println("Level is Army salary level");

            ArmySalaryLevel armySalaryLevel=(ArmySalaryLevel) level;
            System.out.println("Army salary grade overtime is->"+armySalaryLevel.getOverTime());
        }
        else if(level instanceof  NNPCSalaryLevel)
        {

            System.out.println("Level is NNPC salary level");

        }
        else
        {
            System.out.println("Level is default salary level");
        }
    }

    public static void processArmySalary(ArmySalaryLevel level)
    {

    }

}
