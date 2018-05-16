package util.mybatis;

public class SqlOrderByOption {
	
	private String field;
	private String direction;

	public String getField() {
		return field;
	}

	public String getDirection() {
		return direction;
	}

	public SqlOrderByOption(String fieldName, boolean ascend) {
		this.field = fieldName;
		this.direction = ascend ? "ASC" : "DESC";
	}

}
