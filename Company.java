public class Company {

    private String companyId;
    private String name;

    public Company(String companyId, String name) {
        this.companyId = companyId;
        this.name = name;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }
}