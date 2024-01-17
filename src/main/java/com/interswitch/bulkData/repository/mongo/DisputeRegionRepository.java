package com.interswitch.bulkData.repository.mongo;

import com.interswitch.bulkData.entities.DisputeRegion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisputeRegionRepository extends MongoRepository<DisputeRegion, Integer> {
}
