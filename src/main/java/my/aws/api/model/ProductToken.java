package my.aws.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class ProductToken {

	@JsonProperty(value = "token_type")
	private String token_type;
	@JsonProperty(value = "expires_in_secs")
	private int expires_in_secs;
	@JsonProperty(value = "access_token")
	private String access_token;
	@JsonProperty(value = "error")
	private String error;

	public ProductToken(String tokenType,int expireInSeconds,String accessToken,String error) {
		this.token_type = tokenType;
		this.expires_in_secs = expireInSeconds;
		this.access_token = accessToken;
		this.error = error;
	}
	
	public String getToken_type() {
		return token_type;
	}	
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public int getExpires_in_secs() {
		return expires_in_secs;
	}
	public void setExpires_in_secs(int expires_in_secs) {
		this.expires_in_secs = expires_in_secs;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
}
