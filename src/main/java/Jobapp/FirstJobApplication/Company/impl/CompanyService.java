package Jobapp.FirstJobApplication.Company.impl;

import Jobapp.FirstJobApplication.Company.Company;
import Jobapp.FirstJobApplication.Company.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService implements Jobapp.FirstJobApplication.Company.CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);

    }

    @Override
    public boolean updateCompany(Long id, Company updatedCompany) {
        Optional<Company> optionalCompany=companyRepository.findById(id);

        if(optionalCompany.isPresent()){
            Company company=optionalCompany.get();
            company.setName(updatedCompany.getName());
            company.setDescription(updatedCompany.getDescription());
            company.setJobs(updatedCompany.getJobs());
            companyRepository.save(company);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteCompany(Long id) {
        return false;
    }
}
