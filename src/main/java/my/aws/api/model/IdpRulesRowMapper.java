package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class IdpRulesRowMapper implements RowMapper<IdpRule> {

	@Override
	public IdpRule mapRow(ResultSet row, int rowNum) throws SQLException {
		IdpRule idpRule = new IdpRule();
		idpRule.setId(row.getString("ID"));
		idpRule.setName(row.getString("NAME"));
		idpRule.setType(row.getString("TYPE"));
		idpRule.setValue(row.getString("VALUE"));
		idpRule.setIdpId(row.getString("IDPID"));
		idpRule.setLastModifiedDate(row.getTimestamp("LASTMODIFIEDDATE"));
		return idpRule;
	}

}
