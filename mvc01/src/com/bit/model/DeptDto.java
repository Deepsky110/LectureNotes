package com.bit.model;

public class DeptDto { // data transfer object 데이터를 이동시 그룹화하는 단위
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto() {
		// 디폴트 생성자를 반드시 명시할 것
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
