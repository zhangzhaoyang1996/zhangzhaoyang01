package com.zzy.bean;

public enum Sex {
	男(),
	女();
	
	public String getName() {
		return this.name();
	}
	
	public int getordinal() {
		return this.ordinal();
	}

}
