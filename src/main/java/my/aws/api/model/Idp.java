package my.aws.api.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Idp {
	private String id; 
	private String fidp;

	public Idp() {
		super();
	}

	public Idp(String id, String fidp) {
		super();
		this.id = id;
		this.fidp = fidp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFidp() {
		return fidp;
	}

	public void setFidp(String fidp) {
		this.fidp = fidp;
	}
}
