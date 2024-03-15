package com.emt.TradeFinance.LC.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "issued_lcs_tbl")
public class IssuedLcs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issued_lcs_id")
    private Long issuedLcId;
    private Long transactionNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String currencyCode;
    private BigInteger amount;
    private String country;
    private String issuingBankBic;
    private String advisingBankBic;
    //one applicant can have one lc issued
@OneToOne
@JoinColumn(name="applicant_id")
private Applicant applicant;
}






