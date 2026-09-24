package Jobapp.FirstJobApplication.Company;

public class CompanyController {
    public CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService=companyService;
    }


}
