package com.devansh.spring.springadvance.stereotype.annotations;

import org.springframework.stereotype.Component;

@Component
public class Instructor {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
