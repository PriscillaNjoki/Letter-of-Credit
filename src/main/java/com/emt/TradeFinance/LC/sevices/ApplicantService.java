package com.emt.TradeFinance.LC.sevices;

import com.emt.TradeFinance.LC.entities.Applicant;
import com.emt.TradeFinance.LC.repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public Applicant getApplicantById(Long id) {
        return applicantRepository.findById(id).orElse(null);
    }

    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public void deleteApplicant(Long id) {
        applicantRepository.deleteById(id);
    }
}