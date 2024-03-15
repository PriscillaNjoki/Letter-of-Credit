//package com.emt.TradeFinance.LC.sevices;
//
//import com.emt.TradeFinance.LC.entities.LetterOfCredit;
//import com.emt.TradeFinance.LC.repositories.LetterOfCreditRepository;
//import com.emt.TradeFinance.utils.Response.ApiResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.math.BigInteger;
//import java.util.List;
//import java.util.Optional;
//import java.util.Random;
//
//@Service
//public class LetterOfCreditService {
//    @Autowired
//    private LetterOfCreditRepository letterOfCreditRepository;
//
//////        public LetterOfCredit saveLc(String applicantName, String form, String beneficiaryName, BigInteger amount, String issuingBank, String advisingBank, BigInteger Cif, Long applicantAccountNumber, String swiftMessage) {
//////        LetterOfCredit letterOfCredit = new LetterOfCredit();
//////        letterOfCredit.setForm(form);
//////        letterOfCredit.setApplicantName(applicantName);
//////        letterOfCredit.setBeneficiaryName(beneficiaryName);
//////        letterOfCredit.setAmount(amount);
//////        letterOfCredit.setIssuingBank(issuingBank);
//////
//////        // Generate unique letter of credit number
//////        String letterOfCreditNumber = generateLetterOfCreditNumber();
//////        letterOfCredit.setLetterOfCreditNumber(letterOfCreditNumber);
//////
//////       letterOfCreditRepository.save(letterOfCredit);
//////            return letterOfCredit;
//////        }
////
//////    private String generateLetterOfCreditNumber() {
//////        Random random = new Random();
//////        int randomNumber = random.nextInt(1000000); // Generate a random 6-digit number
//////        String lcNumber = "LC-" + randomNumber;
//////        return lcNumber;
//////
//////    }
//////    public ResponseEntity<Object> saveLetterOfCredit(LetterOfCredit letterOfCredit) {
//////        ApiResponse response = new ApiResponse();
//////        try {
//////            LetterOfCredit savedLC = letterOfCreditRepository.save(letterOfCredit);
//////
//////            response.setMessage("Created");
//////            response.setStatusCode(HttpStatus.CREATED.value());
//////            response.setEntity(savedLC);
//////
//////            return new ResponseEntity<>(response, HttpStatus.OK);
//////        } catch (Exception e) {
//////            response.setMessage("Error occurred: " + e.getMessage());
//////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
//////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//////        }
//////    }
////
////
////
////
////    //FIND USER BY FULL NAME
////    public ResponseEntity<Object> fetchLetterOfCreditByLetterOfCreditNumber(String letterOfCreditNumber) {
////        ApiResponse response = new ApiResponse();
////
////        try {
////            Optional<LetterOfCredit> letterOfCreditOptional = letterOfCreditRepository.findByLetterOfCreditNumber(letterOfCreditNumber);
////
////            if (letterOfCreditOptional.isPresent()) {
////                LetterOfCredit letterOfCredit = letterOfCreditOptional.get();
////                response.setMessage("User3 retrieved successfully");
////                response.setStatusCode(HttpStatus.OK.value());
////                response.setEntity(letterOfCredit);
////                return new ResponseEntity<>(response, HttpStatus.OK);
////            } else {
////                response.setMessage("LC not found for the given LCNumber: " + letterOfCreditNumber);
////                response.setStatusCode(HttpStatus.NOT_FOUND.value());
////                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
////            }
////        } catch (Exception e) {
////            response.setMessage("Error occurred while processing request");
////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
////
////    //DELETING USER BY ID
////    public ResponseEntity<Object> deleteLc(Long id) {
////        ApiResponse response = new ApiResponse();
////        try {
////            Optional<LetterOfCredit> optionalLetterOfCredit = letterOfCreditRepository.findById(id);
////
////            if (optionalLetterOfCredit.isPresent()) {
////                LetterOfCredit letterOfCredit = optionalLetterOfCredit.get();
////
////                letterOfCreditRepository.delete(letterOfCredit);
////
////                response.setMessage("LCdeleted successfully");
////                response.setStatusCode(HttpStatus.OK.value());
////
////                return new ResponseEntity<>(response, HttpStatus.OK);
////            } else {
////                response.setMessage("LCnot found for id: " + id);
////                response.setStatusCode(HttpStatus.NOT_FOUND.value());
////                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
////            }
////        } catch (Exception e) {
////            response.setMessage("Error occurred: " + e.getMessage());
////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
////
////    //GETTING USER BY ID
////    public ResponseEntity<Object> getLCById(Long id) {
////        ApiResponse response = new ApiResponse();
////        try {
////            Optional<LetterOfCredit> optionalLetterOfCredit = letterOfCreditRepository.findById(id);
////
////            if (optionalLetterOfCredit.isPresent()) {
////                LetterOfCredit letterOfCredit = optionalLetterOfCredit.get();
////                response.setMessage("LC retrieved successfully");
////                response.setStatusCode(HttpStatus.OK.value());
////                response.setEntity(letterOfCredit);
////                return new ResponseEntity<>(response, HttpStatus.OK);
////            } else {
////                response.setMessage("LC not found for id: " + id);
////                response.setStatusCode(HttpStatus.NOT_FOUND.value());
////                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
////            }
////        } catch (Exception e) {
////            response.setMessage("Error occurred: " + e.getMessage());
////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
////
////    //UPDATING USER
////    public ResponseEntity<Object> updateLc(Long id, LetterOfCredit letterOfCreditDetails) {
////        ApiResponse response = new ApiResponse();
////        try {
////            Optional<LetterOfCredit> optionalLetterOfCredit = letterOfCreditRepository.findById(id);
////
////            if (optionalLetterOfCredit.isPresent()) {
////                LetterOfCredit letterOfCredit = optionalLetterOfCredit.get();
////
////                // UpdateletterOfCredit details based onletterOfCreditDetails
//////                if (letterOfCreditDetails.getApplicant() != null) {
//////                    letterOfCredit.setApplicant(letterOfCreditDetails.getApplicant());
//////                }
////                if (letterOfCreditDetails.getLetterOfCreditNumber() != null) {
////                    letterOfCredit.setLetterOfCreditNumber(letterOfCreditDetails.getLetterOfCreditNumber());
////                }
////                if (letterOfCreditDetails.getAmount() != null) {
////                    letterOfCredit.setAmount(letterOfCreditDetails.getAmount());
////                }
////
////
////                LetterOfCredit updatedLetterOfCredit = letterOfCreditRepository.save(letterOfCredit);
////
////                response.setMessage("LC updated successfully");
////                response.setStatusCode(HttpStatus.OK.value());
////                response.setEntity(updatedLetterOfCredit);
////
////                return new ResponseEntity<>(response, HttpStatus.OK);
////            } else {
////                response.setMessage("LCnot found for id: " + id);
////                response.setStatusCode(HttpStatus.NOT_FOUND.value());
////                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
////            }
////        } catch (Exception e) {
////            response.setMessage("Error occurred: " + e.getMessage());
////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
//////FETCHING ALL USERS
////
////    public ResponseEntity<Object> fetchLcs() {
////        ApiResponse response = new ApiResponse();
////        try {
////            List<LetterOfCredit> letterOfCredit = letterOfCreditRepository.findAll();
////
////            response.setMessage("Found");
////            response.setStatusCode(HttpStatus.FOUND.value());
////            response.setEntity(letterOfCredit);
////
////            return new ResponseEntity<>(response, HttpStatus.OK);
////        } catch (Exception e) {
////            response.setMessage("Error occurred: " + e.getMessage());
////            response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
////            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
////
////    public Object saveLc(LetterOfCredit letterOfCredit) {
////        // Generate unique letter of credit number (optional, can be done before saving)
////        String letterOfCreditNumber = generateLetterOfCreditNumber();
////        letterOfCredit.setLetterOfCreditNumber(letterOfCreditNumber);
////
////        // Save LetterOfCredit using repository
////        return letterOfCreditRepository.save(letterOfCredit);
////    }
////
////    private String generateLetterOfCreditNumber() {
//        Random random = new Random();
//        int randomNumber = random.nextInt(1000000); // Generate a random 6-digit number
//        String lcNumber = "LC-" + randomNumber;
//        return lcNumber;
//    }
////    }
////
////
//////public LetterOfCredit issueLetterOfCredit(LetterOfCredit letterOfCredit) {
////////        LetterOfCredit letterOfCredit = new LetterOfCredit();
////////        letterOfCredit.setForm(form);
////////        letterOfCredit.setApplicantName(applicantName);
////////        letterOfCredit.setBeneficiaryName(beneficiaryName);
////////        letterOfCredit.setAmount(amount);
////////        letterOfCredit.setIssuingBank(issuingBank);
//////
//////        // Generate unique letter of credit number
//////        String letterOfCreditNumber = generateLetterOfCreditNumber();
//////        letterOfCredit.setLetterOfCreditNumber(letterOfCreditNumber);
//////
//////        return letterOfCreditRepository.save(letterOfCredit);
//////    }

package com.emt.TradeFinance.LC.sevices;

import com.emt.TradeFinance.LC.entities.LetterOfCredit;
import com.emt.TradeFinance.LC.repositories.LetterOfCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class LetterOfCreditService {

    @Autowired
    private LetterOfCreditRepository letterOfCreditRepository;

    public ResponseEntity<List<LetterOfCredit>> getAllLetterOfCredits() {
        List<LetterOfCredit> letterOfCredits = letterOfCreditRepository.findAll();
        return new ResponseEntity<>(letterOfCredits, HttpStatus.OK);
    }

    public ResponseEntity<LetterOfCredit> getLetterOfCreditById(Long id) {
        Optional<LetterOfCredit> letterOfCredit = letterOfCreditRepository.findById(id);
        return letterOfCredit.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<LetterOfCredit> createLetterOfCredit(LetterOfCredit letterOfCredit) {
        String letterOfCreditNumber = generateLetterOfCreditNumber();
        letterOfCredit.setLetterOfCreditNumber(letterOfCreditNumber);

        LetterOfCredit createdLetterOfCredit = letterOfCreditRepository.save(letterOfCredit);
        return new ResponseEntity<>(createdLetterOfCredit, HttpStatus.CREATED);
    }



    public ResponseEntity<LetterOfCredit> updateLetterOfCredit(Long id, LetterOfCredit updatedLetterOfCredit) {
        if (letterOfCreditRepository.existsById(id)) {
            updatedLetterOfCredit.setLetterOfCreditId(id);
            LetterOfCredit savedLetterOfCredit = letterOfCreditRepository.save(updatedLetterOfCredit);
            return new ResponseEntity<>(savedLetterOfCredit, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Void> deleteLetterOfCredit(Long id) {
        if (letterOfCreditRepository.existsById(id)) {
            letterOfCreditRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    private String generateLetterOfCreditNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(1000000); // Generate a random 6-digit number
        String letterOfCreditNumber = "LC-" + randomNumber;
        return letterOfCreditNumber;

    }
    public String generateMT700(Long letterOfCreditId) {
        LetterOfCredit lc = letterOfCreditRepository.findById(letterOfCreditId).orElse(null);
        if (lc == null) {
            return "Letter of Credit not found";
        }

        return MT700Generator.generateMT700(lc);
    }
}
