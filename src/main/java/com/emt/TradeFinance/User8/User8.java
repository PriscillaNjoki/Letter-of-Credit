package com.emt.TradeFinance.User8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "users8")
public class User8 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;
    private String EmailAddress;
    private String gender;
    private String deleteFlag;
    private Date dateCreated;
    @Column(name = "status")
    private boolean isActive = true;


}
