package my.aws.api.model;

import java.util.List;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class TriggerSchedule {
	
	private List<OrgLoadFrequency> schedules;

	public List<OrgLoadFrequency> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<OrgLoadFrequency> schedules) {
		this.schedules = schedules;
	}
	
}
