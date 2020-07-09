package com.bit.dept;

public class DeptDto {
	private int num;
	private String id;
	private String pw;
	private String name;
	private int lev;
	private boolean result; // 로그인 되면 true
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLev() {
		return lev;
	}
	public void setLev(int lev) {
		this.lev = lev;
	}
	public boolean isResult() { //boolean타입은 get이 아닌 is
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
}
