package com.emt.TradeFinance.LC.sevices;

import com.emt.TradeFinance.LC.entities.LetterOfCredit;
public class MT700Generator {
    public static String generateMT700(LetterOfCredit lc) {
        StringBuilder mt700 = new StringBuilder();

        mt700.append(":27:").append(lc.getLetterOfCreditNumber()).append("\n");
        mt700.append(":40A:").append(lc.getForm()).append("\n");
        mt700.append(":20:").append(lc.getLetterOfCreditId()).append("\n");
        mt700.append(":23B:").append(lc.getApplicableRules()).append("\n");
        mt700.append(":31C:").append(lc.getIssueDate()).append("\n");
        mt700.append(":31D:").append(lc.getExpiryDate()).append("\n");
        mt700.append(":50:").append(lc.getApplicantName()).append("\n");
        mt700.append(":59:").append(lc.getBeneficiaryName()).append("\n");
        mt700.append(":41A:").append(lc.getIssuingBank()).append("\n");
        mt700.append(":44C:").append(lc.getPortOfLoading()).append("\n");
        mt700.append(":44E:").append(lc.getPortOfDischarge()).append("\n");
        mt700.append(":42C:").append(lc.getShipmentDate()).append("\n");
        mt700.append(":42A:").append(lc.getShipmentTerms()).append("\n");
        mt700.append(":42P:").append(lc.getPartialShipment()).append("\n");
        mt700.append(":42T:").append(lc.getTransShipment().toString()).append("\n");
        mt700.append(":43P:").append(lc.getCountyOfOrigin()).append("\n");
        mt700.append(":44A:").append(lc.getUsance()).append("\n");
        mt700.append(":44B:").append(lc.getAmount()).append("\n");
        mt700.append(":45A:").append(lc.getCommodityCode()).append("\n");
        mt700.append(":46A:").append(lc.getChargesBy()).append("\n");
        mt700.append(":47A:").append(lc.getNegotiationPeriod()).append("\n");
        mt700.append(":71B:").append(lc.getDocumentName()).append("\n");
        mt700.append(":48:").append(lc.getDescription()).append("\n");
        mt700.append(":49:").append(lc.getGoodsQuantity()).append("\n");
        mt700.append(":32B:").append(lc.getValue()).append("\n");

        return mt700.toString();
    }
}