package com.interswitch.bulkData.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="dispute_info")
public class Dispute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int disputeId;
    private String disputeName;
    private String periodType;
    private String countryCode;


}
