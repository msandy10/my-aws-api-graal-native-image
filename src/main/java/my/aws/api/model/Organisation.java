package my.aws.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.micronaut.core.annotation.Introspected;

@JsonIgnoreProperties(ignoreUnknown = true)
@Introspected
public class Organisation {

	private int orgId;
	private String orgName;
	private String clientId;


	public Organisation() {
		super();
	}

	public Organisation(int orgId, String orgName) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
	}
	
	public Organisation(int orgId, String orgName,String clientId) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.clientId = clientId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	

}
