package com.interswitch.bulkData.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.interswitch.bulkData.entities.Dispute;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class Reader extends JdbcCursorItemReader<Dispute> implements ItemReader<Dispute> {

    public Reader(@Autowired DataSource primaryDataSource) {
        setDataSource(primaryDataSource);
        setSql("SELECT * FROM dispute_info");
        setFetchSize(100);
        setRowMapper(new DisputeRowMapper());
    }

    public class DisputeRowMapper implements RowMapper<Dispute> {
        @Override
        public Dispute mapRow(ResultSet rs, int rowNum) throws SQLException {
            Dispute dispute  = new Dispute();
            //reading data from ResultSet and write to dispute object
            dispute.setDisputeId(rs.getInt("dispute_id"));
            dispute.setDisputeName(rs.getString("dispute_name"));
            dispute.setPeriodType(rs.getString("period_type"));
            dispute.setCountryCode(rs.getString("country_code"));

            return dispute;
        }
    }
}
