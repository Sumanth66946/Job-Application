package Jobapp.FirstJobApplication.Company.impl;

import Jobapp.FirstJobApplication.Company.Company;
import Jobapp.FirstJobApplication.Company.CompanyRepository;

import java.util.List;

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

    }

    @Override
    public boolean updateCompany(Long id, Company updatedCompany) {
        return false;
    }

    @Override
    public boolean deleteCompany(Long id) {
        return false;
    }
}
