package com.interswitch.bulkData.config;

import com.interswitch.bulkData.entities.Dispute;
import com.interswitch.bulkData.entities.DisputeRegion;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Dispute, DisputeRegion> {

    @Override
    public DisputeRegion process(Dispute item) {

        DisputeRegion disputeRegion = new DisputeRegion();

        disputeRegion.setDisputeId(item.getDisputeId());
        disputeRegion.setDisputeName(item.getDisputeName());
        disputeRegion.setPeriodType(item.getPeriodType());
        disputeRegion.setCountryCode(item.getCountryCode());

        return disputeRegion;
    }

}
