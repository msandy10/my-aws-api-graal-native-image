package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrganisationRowMapper implements RowMapper<Organisation> {

	@Override
	public Organisation mapRow(ResultSet row, int rowNum) throws SQLException {
		Organisation org = new Organisation();
		org.setOrgId(row.getInt("ORGID"));
		org.setOrgName(row.getString("NAME"));
		return org;
	}

}
