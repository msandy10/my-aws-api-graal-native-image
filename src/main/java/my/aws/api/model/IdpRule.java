package my.aws.api.model;

import java.sql.Timestamp;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class IdpRule {
  private String id;
  private String name;
  private String type;
  private String value;
  private String idpId;
  private Timestamp lastModifiedDate;

  public IdpRule() {
    super();
  }

  public IdpRule(String id, String name, String type, String value, String idpId) {
    super();
    this.id = id;
    this.name = name;
    this.type = type;
    this.value = value;
    this.idpId = idpId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getIdpId() {
    return idpId;
  }

  public void setIdpId(String idpId) {
    this.idpId = idpId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
  public Timestamp getLastModifiedDate() {
		return lastModifiedDate;
}

  public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
}

}
