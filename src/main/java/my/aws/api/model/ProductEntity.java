package my.aws.api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.micronaut.core.annotation.Introspected;

@Introspected
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEntity {
	private int id;// Primary key for Product
	private String name;
	private String dbName;
	private String url; // Connection url

	private String username;
	private String credentials;
	
	private Organisation org;// Foreign Key from Organization
	private License license;
	
	private String clientId;// clientId for basis

	private String defaultStartTime;
	private String defaultTimeInterval;
	
	public ProductEntity() {
		super();
	}

	public ProductEntity(int id, String name, String dbName, String url, String username, String credentials,String clientId, Organisation org,
			License license, Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.dbName = dbName;
		this.url = url;
		this.org = org;
		this.license = license;
		this.username = username;
		this.credentials = credentials;
		this.clientId = clientId;
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

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Organisation getOrg() {
		return org;
	}

	public void setOrg(Organisation org) {
		this.org = org;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDefaultStartTime() {
		return defaultStartTime;
	}

	public void setDefaultStartTime(String defaultStartTime) {
		this.defaultStartTime = defaultStartTime;
	}

	public String getDefaultTimeInterval() {
		return defaultTimeInterval;
	}

	public void setDefaultTimeInterval(String defaultTimeInterval) {
		this.defaultTimeInterval = defaultTimeInterval;
	}	
	
}
