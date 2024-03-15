package com.emt.TradeFinance.LC.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "beneficiary_tbl")
public class Beneficiary {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long beneficiaryId;
    private Long primaryBeneficiaryCif;
    private String primaryBeneficiaryName;
    private Long primaryBeneficiaryAcc;
    private String secondaryBeneficiaryName;
    private Long secondaryBeneficiaryAcc;
    private BigInteger transferableAmount;
    private String bankName;
    private String beneficiaryEmail;
    private Long beneficiaryAddress;
    private String beneficiaryCity;
    private  String state;
    private String beneficiaryPostalCode;
    private String beneficiaryCountry;
    private BigInteger lcValue;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private BigDecimal unverifiedLcValue;

    //one applicant can have one Lc application
    @OneToOne(targetEntity = Applicant.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "applicant_beneficiary",referencedColumnName = "applicant_id")

    private Applicant applicant;




}
