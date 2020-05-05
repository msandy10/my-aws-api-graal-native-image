package my.aws.api.model;

import java.util.Date;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class License {
	private int id;
	private String licenseKey;// License unique identifier
	private Date startDate;// Activation Date For the License
	private Date endDate;


	public License() {
		super();
	}

	public License(String licenseKey, Date startDate, Date endDate, Date createdDate) {
		super();
		this.licenseKey = licenseKey;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
