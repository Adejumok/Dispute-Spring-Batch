package com.interswitch.bulkData.config;

import com.interswitch.bulkData.entities.DisputeRegion;
import com.interswitch.bulkData.repository.mongo.DisputeRegionRepository;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer implements ItemWriter<DisputeRegion>{

    @Autowired
    private DisputeRegionRepository disputeRegionRepository;

    @Override
    public void write(Chunk<? extends DisputeRegion> chunk) {

        for (DisputeRegion disputeRegion : chunk) {
            System.out.println("Writer: \nWriting data: " + disputeRegion.getDisputeId()+" : "+disputeRegion.getDisputeName()+" : "+disputeRegion.getCountryCode()
                    +" : "+disputeRegion.getPeriodType());
            disputeRegionRepository.save(disputeRegion);
        }
    }
}
