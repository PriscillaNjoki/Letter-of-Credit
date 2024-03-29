package com.emt.TradeFinance.LC.entities;

import javax.persistence.*;

import com.emt.TradeFinance.LC.Enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "accounts_tbl")
public class Accounts {
    //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String accountName;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private String schemeCode;
    @Id
    private Long accountNumber;
    private BigDecimal Balance;
    private BigDecimal interestRate;
    private BigDecimal tolerance;
    private Boolean accountStatus;
    private String currency;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date closeDate;
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name = "accounts_tbl",
//            joinColumns = @JoinColumn(name = "charge_id"),
//            inverseJoinColumns = @JoinColumn(name = "accountId"))
//    private List<Charges> charges;
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "ACCOUNT_ID",referencedColumnName = "applicantId")
//    private Applicant applicant;
}
