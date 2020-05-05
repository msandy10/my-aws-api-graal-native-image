package my.aws.api.model;

public enum EMAILTYPE {

	IMPLICIT("IMPLICIT"), EXPLICIT("EXPLICIT");

	private String ruleType;

	public String getRuleType() {
		return this.ruleType;
	}

	private EMAILTYPE(String ruleType) {
		this.ruleType = ruleType;
	}
}