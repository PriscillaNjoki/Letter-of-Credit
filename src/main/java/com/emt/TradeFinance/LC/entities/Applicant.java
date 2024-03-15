package com.emt.TradeFinance.LC.entities;

//import com.emt.TradeFinance.utils.shared.BaseApplicant;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "applicant_tbl")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicant_id")
    private Long applicantId;
    private Long applicantCif;
    private Long accountNumber;
    private String name;
    private String applicantAddress;
    private String applicantCity;
    private Long applicantPostalCode;
    private String applicantCountry;
    private String issuingBankName;
    private String issuingBankBranch;
    private String issuingBankCountry;
    private String issuingBankBic;
    private String issuingBankRef;
    private String advisingBankName;
    private String advisingBankBranch;
    private String advisingBankCountry;
    private String advisingBankBic;
    private String advisingBankRef;
    private String reimbursingBankName;
    private String reimbursingBankBranch;
    private String reimbursingBankCountry;
    private String reimbursingBankBic;
    private String reimbursingBankRef;
    private String adviseThroughBankName;
    private String adviseThroughBankBranch;
    private String adviseThroughBankCountry;
    private String adviseThroughBankBic;
    private String adviseThroughBankRef;

    @OneToMany(mappedBy = "applicant")
private List<Charges> charges;
}





