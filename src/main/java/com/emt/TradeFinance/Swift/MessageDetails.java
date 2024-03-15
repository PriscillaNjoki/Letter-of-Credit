package com.emt.TradeFinance.Swift;

//import com.emt.TradeFinance.Entities.LcBeneficiaryDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "swift_tbl")
public class MessageDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "message_id", nullable = false)
    private Long messageId;
    @Column(name = "message_type", nullable = false)
    private String messageType;
//    @JoinColumn(name = "beneficiary_id", nullable = false)
//    private LcBeneficiaryDetails beneficiaryDetails;
    @Column(name = "message_date", nullable = false)
    private LocalDate messageDate;
    @Column(name = "mode_of_transmission", nullable = false)
    private String mode;
    @Column(name = "message_content", nullable = false)
    private String messageContent;

}
