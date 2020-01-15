public abstract class BaseTaxBracket
{
    private String region;

    public double calculateStampTax(double amount)
    {
        return amount*0.05;
    }

    public abstract double calculateVAT();

}
