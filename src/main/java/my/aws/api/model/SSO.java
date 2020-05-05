package my.aws.api.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SSO {
	private String id;

	public SSO(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}

