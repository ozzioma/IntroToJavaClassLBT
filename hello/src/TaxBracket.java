public class TaxBracket extends BaseTaxBracket
{
    private String grade; //10
    private String taxPercent; //
    private double taxAmount;
    private double afterTaxAmount;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(String taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getAfterTaxAmount() {
        return afterTaxAmount;
    }

    public void setAfterTaxAmount(double afterTaxAmount) {
        this.afterTaxAmount = afterTaxAmount;
    }

    @Override
    public double calculateVAT() {
        return 200;
    }
}
