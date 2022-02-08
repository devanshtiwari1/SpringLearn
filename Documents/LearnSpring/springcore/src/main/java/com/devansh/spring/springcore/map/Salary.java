package com.devansh.spring.springcore.map;

import java.util.Map;

public class Salary {
	private int id;
	private Map<Integer, String> hs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getHs() {
		return hs;
	}

	public void setHs(Map<Integer, String> hs) {
		this.hs = hs;
	}

}
