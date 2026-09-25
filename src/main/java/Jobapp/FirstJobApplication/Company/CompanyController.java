package Jobapp.FirstJobApplication.Company;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CompanyController {
    public CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService=companyService;
    }
    @GetMapping("/companies")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }
    @GetMapping("/companies/{id}")
    public Company getById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }
    @PutMapping("/companies/{id}")
    public String updateCompany(@PathVariable Long id, @RequestBody Company updatedCompany) {
        if(companyService.updateCompany(id, updatedCompany)){
            return "Company Updated successfully";
        }
        return "Failed to update company";
    }
  @PostMapping("/companies")
    public String createCompany(@RequestBody Company company) {
        companyService.createCompany(company);
        return "Company created successfully";
    }
    @DeleteMapping("/companies/{id}")
    public String deleteById(Long id){
        boolean isDeleted=companyService.deleteCompany(id);
        if(isDeleted) {
            return "Company Deleted Successfully";
        }else{
            return "Not Found";
        }

    }
}
