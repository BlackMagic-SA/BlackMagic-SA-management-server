package com.sms.blackmagic.service;

import com.sms.blackmagic.model.Company;
import com.sms.blackmagic.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    // 기관 정보 생성
    public Company createCompany(Company company) {
        Company newCompany = Company.builder()
                .companyName(company.getCompanyName())
                .build();

        companyRepository.save(newCompany);
        return newCompany;
    }

    // 기관 정보 수정


    // 기관 정보 삭제


    // 기관 상세 조회
    public Company getCompanyDetail(Integer companyId) {
        Company company = companyRepository.findByCompanyId(companyId);
        return company;
    }

}
