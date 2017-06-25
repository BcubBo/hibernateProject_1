package po;

public class District implements java.io.Serializable {

	private Short id;
	private String name;

	public District() {
	}

	public District(Short id, String name) {
		this.id = id;
		this.name = name;
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}