package com.emt.TradeFinance.LC.entities;

import com.emt.TradeFinance.LC.Enums.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class LcRequest {
    private Long LcRequest_id;
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
    private BigDecimal usance;
    private BigInteger amount;
    private Boolean transferable;
    private ShipmentTerms shipmentTerms;
    private Long negotiationPeriod;
    private String commodityCode;
    private String chargesBy;
    private DocumentName documentName;
    private  Integer numberOfCopies;
    private  Boolean signed;
    private String description;
    private Integer goodsQuantity;
    private BigInteger value;
    private Long countyOfOrigin;
    private String termsOfShipment;
    @Enumerated(EnumType.STRING)
    @Column(name = "partial_shipment", nullable = false)
    private PartialShipment partialShipment;
    @Enumerated(EnumType.STRING)
    @Column(name = "trans_shipment", nullable = false)
    private Transshipment transShipment;
   @ManyToOne
   @JoinColumn(name = "LcRequest_id")
   private Applicant applicant;

}
