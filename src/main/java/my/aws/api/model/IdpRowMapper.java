package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class IdpRowMapper implements RowMapper<Idp> {

	@Override
	public Idp mapRow(ResultSet row, int rowNum) throws SQLException {
		Idp idp = new Idp();
		idp.setId(row.getString("ID"));
		idp.setFidp(row.getString("FIDP"));
		return idp;
	}

}
