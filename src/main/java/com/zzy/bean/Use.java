package com.zzy.bean;

public class Use {
	private Integer id;
	private Sex sex;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Use [id=" + id + ", sex=" + sex + "]";
	}

	public Use() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
