

public class LGA {
    public LGA() {

        this.lgaCode = null;
    }

    private String lgaCode;

    public void setLGACode(String lga_Code) throws Exception {
        if (lga_Code == null)
            throw new Exception("LGA code cannot be null");
        this.lgaCode = lga_Code;

    }

    public String getLgaCode() {
        return lgaCode;
    }

    private String lgaName;

    public void setLGAName(String name) {
        this.lgaName = name;
    }

    public String getLgaName() {
        return lgaName;
    }

}
