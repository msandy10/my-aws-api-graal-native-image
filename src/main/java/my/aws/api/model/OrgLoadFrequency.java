package my.aws.api.model;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class OrgLoadFrequency {
	

	@Min(value = 1, message = "orgId should be greater than zero")
    @Max(value = Integer.MAX_VALUE, message = "orgId should not to large")
	private int orgId;
	
	@Pattern(regexp = "^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$", message = "defaultStartTime should be Valid format HH:MM:ss format")
	private String defaultStartTime;
	
	@Pattern(regexp = "^([1-9]|0[0-9]|1[0-9]|2[0-3]):([1-9]|[0-5][0-9])$", message = "defaultTimeInterval should be Valid format HH:MM format")
	private String defaultTimeInterval;

	
	private List<EntityLoadFrequency> loadTimes;

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
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

	public List<EntityLoadFrequency> getLoadTimes() {
		return loadTimes;
	}

	public void setLoadTimes(List<EntityLoadFrequency> loadTimes) {
		this.loadTimes = loadTimes;
	}
}
