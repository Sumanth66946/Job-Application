package Jobapp.FirstJobApplication.Company;

import java.util.*;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void createCompany(Company company);
    boolean updateCompany(Long id, Company updatedCompany);
    boolean deleteCompany(Long id);


}
