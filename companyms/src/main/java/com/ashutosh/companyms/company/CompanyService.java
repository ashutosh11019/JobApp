package com.ashutosh.companyms.company;

import com.ashutosh.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void createCompanies(Company company);
    Company getCompanyById(Long id);
    boolean deleteCompanyById(Long id);
    boolean updateCompany(Long id, Company updatedCompany);
    public void updateCompanyRating(ReviewMessage reviewMessage);
}
