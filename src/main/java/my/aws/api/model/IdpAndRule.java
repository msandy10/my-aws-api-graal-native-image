package my.aws.api.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class IdpAndRule {

  private String idpId;
  private String idpFid;
  private String ruleId;
  private String ruleName;
  private String ruleType;
  private String ruleValue;

  public String getIdpId() {
    return idpId;
  }

  public void setIdpId(String idpId) {
    this.idpId = idpId;
  }

  public String getIdpFid() {
    return idpFid;
  }

  public void setIdpFid(String idpFid) {
    this.idpFid = idpFid;
  }

  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public String getRuleType() {
    return ruleType;
  }

  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }

  public String getRuleValue() {
    return ruleValue;
  }

  public void setRuleValue(String ruleValue) {
    this.ruleValue = ruleValue;
  }

}
