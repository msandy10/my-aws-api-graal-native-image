package my.aws.api.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class ApplicationStatusObj {
	
	public String serviceName;
	
	public String commitId;
	
	public String version;
	
	public String commitMessage;
	
	public String commitTime;

	public ApplicationStatusObj(String serviceName, String commitId, String version, String commitMessage,
			String commitTime) {
		super();
		this.serviceName = serviceName;
		this.commitId = commitId;
		this.version = version;
		this.commitMessage = commitMessage;
		this.commitTime = commitTime;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCommitMessage() {
		return commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	public String getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

}
