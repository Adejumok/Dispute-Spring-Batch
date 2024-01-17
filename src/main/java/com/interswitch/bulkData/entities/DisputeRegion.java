package com.interswitch.bulkData.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dispute_info")
@Data
public class DisputeRegion {
    private int disputeId;
    private String disputeName;
    private String periodType;
    private String countryCode;
}
