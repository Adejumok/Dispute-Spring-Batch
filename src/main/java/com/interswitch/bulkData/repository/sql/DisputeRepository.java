package com.interswitch.bulkData.repository.sql;

import com.interswitch.bulkData.entities.Dispute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisputeRepository extends JpaRepository<Dispute, Integer> {
}
