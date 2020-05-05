package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RulesRowMapper implements RowMapper<Rule> {

	@Override
	public Rule mapRow(ResultSet row, int rowNum) throws SQLException {
		Rule rule = new Rule();
		rule.setId(row.getInt("ID"));
		rule.setType(row.getString("TYPE"));
		rule.setName(row.getString("NAME"));
		rule.setValue(row.getString("VALUE"));
		rule.setOrgId(row.getInt("ORGID"));
		rule.setLastModifiedDate(row.getTimestamp("LASTMODIFIEDDATE"));
		return rule;
	}

}
