package my.aws.api.model;

public enum ENTITLEMENTPRODUCTENUM {
	CENTERSTONE("CenterStone");
	private String name;

	private ENTITLEMENTPRODUCTENUM(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

