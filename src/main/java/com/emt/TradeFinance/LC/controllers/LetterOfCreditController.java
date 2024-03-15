package com.emt.TradeFinance.LC.controllers;

import com.emt.TradeFinance.LC.entities.LetterOfCredit;
import com.emt.TradeFinance.LC.sevices.LetterOfCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/LC")
public class LetterOfCreditController {

    @Autowired
    private LetterOfCreditService letterOfCreditService;

    @GetMapping("/mt700/{id}")
    public String generateMT700(@PathVariable Long id) {
        return letterOfCreditService.generateMT700(id);
    }

    @GetMapping
    public ResponseEntity<List<LetterOfCredit>> getAllLetterOfCredits() {
        return letterOfCreditService.getAllLetterOfCredits();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LetterOfCredit> getLetterOfCreditById(@PathVariable Long id) {
        return letterOfCreditService.getLetterOfCreditById(id);
    }

    @PostMapping
    public ResponseEntity<LetterOfCredit> createLetterOfCredit(@RequestBody LetterOfCredit letterOfCredit) {
        return letterOfCreditService.createLetterOfCredit(letterOfCredit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LetterOfCredit> updateLetterOfCredit(@PathVariable Long id, @RequestBody LetterOfCredit updatedLetterOfCredit) {
        return letterOfCreditService.updateLetterOfCredit(id, updatedLetterOfCredit);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLetterOfCredit(@PathVariable Long id) {
        return letterOfCreditService.deleteLetterOfCredit(id);
    }
}