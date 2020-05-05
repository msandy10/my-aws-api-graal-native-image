package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LicenseRowMapper implements RowMapper<License> {

	@Override
	public License mapRow(ResultSet row, int rowNum) throws SQLException {
		License license = new License();
		license.setLicenseKey(row.getString("LICENSEKEY"));
		license.setStartDate(row.getDate("STARTDATE"));
		license.setEndDate(row.getDate("ENDDATE"));
		return license;
	}

}
