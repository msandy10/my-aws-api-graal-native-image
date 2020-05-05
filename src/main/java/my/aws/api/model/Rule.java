package my.aws.api.model;

import java.sql.Timestamp;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Rule {

	private int id;// Unique Identifier for Rules
	private String name;
	private String type;
	private String value;	
	private int orgId; // Foreign Key
	private Timestamp lastModifiedDate;

	public Rule() {
		super();
	}

	public Rule(int id, String name, String type, String value, int orgId) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.value = value;
		this.orgId = orgId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public Timestamp getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	
}
