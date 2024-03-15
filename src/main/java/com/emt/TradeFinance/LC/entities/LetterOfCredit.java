package com.emt.TradeFinance.LC.entities;

import com.emt.TradeFinance.LC.Enums.*;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "lc_tbl")
public class LetterOfCredit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "letter_of_credit_id")
    private Long letterOfCreditId;
    private String letterOfCreditNumber;
    private String applicantName;
    private String beneficiaryName;
    private  String form;
    private ApplicableRules applicableRules;
    private Boolean isExpired;
    private String issuingBank;
    private Date shipmentDate;
    private String portOfDischarge;
    private String portOfLoading;
    private Date issueDate;
    private Date expiryDate;
    private String type;
    private String subType;
    @Enumerated(EnumType.STRING)
    private InlandForeign inlandForeign;
    private BigDecimal usance;
    private BigInteger amount;
    private Boolean transferable;
    private ShipmentTerms shipmentTerms;
    private Long negotiationPeriod;
    private String commodityCode;
    private String chargesBy;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date creationDate;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updateDate;


//    @ManyToOne(fetch = FetchType.LAZY,optional = false)
//    @JoinColumn(name = "applicant_id")
//    private Applicant applicant;
//@ManyToOne(fetch = FetchType.LAZY)
//@JoinColumn(name = "beneficiary_id") // Reference the correct column name
//private Beneficiary beneficiary;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "applicant_id") // Reference the correct column name
//    private Applicant applicant;
    private DocumentName documentName;
    private  Integer numberOfCopies;
    private  Boolean signed;
    private String description;
    private Integer goodsQuantity;
    private BigInteger value;
    private Long countyOfOrigin;
    private String termsOfShipment;
    @Enumerated(EnumType.STRING)
    @Column(name = "partial_shipment")
    private PartialShipment partialShipment;
    @Enumerated(EnumType.STRING)
    @Column(name = "trans_shipment")
    private Transshipment transShipment;

    //one applicant can have one Lc application
@OneToOne(targetEntity = Applicant.class,cascade = CascadeType.ALL)
  @JoinColumn(name = "applicant_LetterOfCredit",referencedColumnName = "applicant_id")

  private Applicant applicant;
}





