package po;

public class Dept implements java.io.Serializable {

	private Byte deptno;
	private String dname;
	private String loc;

	public Dept() {
	}

	public Dept(Byte deptno) {
		this.deptno = deptno;
	}

	public Dept(Byte deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Byte getDeptno() {
		return this.deptno;
	}

	public void setDeptno(Byte deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}