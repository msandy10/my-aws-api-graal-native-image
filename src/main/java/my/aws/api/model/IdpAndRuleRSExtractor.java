package my.aws.api.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class IdpAndRuleRSExtractor implements ResultSetExtractor<IdpAndRule> {

  @Override
  public IdpAndRule extractData(ResultSet rs) throws SQLException, DataAccessException {
    if(rs.next()) {
      IdpAndRule idpRule = new IdpAndRule();
      idpRule.setIdpId(rs.getString("ID"));
      idpRule.setIdpFid(rs.getString("FIDP"));
      idpRule.setRuleId(rs.getString("RULEID"));
      idpRule.setRuleName(rs.getString("NAME"));
      idpRule.setRuleType(rs.getString("TYPE"));
      idpRule.setRuleValue(rs.getString("VALUE"));
      return idpRule;
    } 
      return new IdpAndRule();
  }
}
