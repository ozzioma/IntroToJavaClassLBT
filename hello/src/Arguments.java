public class Arguments {

    public static void main(String[] args)
    {
        calculateDeductions("Mr. Ajayi",
                1000, 2000, 3000, 4000);
    }

    //varargs..variable arguments
    public static double calculateDeductions(String staffName,
                                             double... deductions)
    {
        //initialization
        double total = 0;
        //double total;

        for (double deduction : deductions)
        {
            total += deduction;
            //total=total+deduction;
        }
        System.out.println("total deductions for " +
                staffName + " is->" + total);
        return total;
    }



}
