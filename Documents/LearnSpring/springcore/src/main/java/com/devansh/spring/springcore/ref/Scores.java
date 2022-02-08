package com.devansh.spring.springcore.ref;

public class Scores {
	private int Maths;
	private int physics;
	private int Chem;

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChem() {
		return Chem;
	}

	public void setChem(int chem) {
		Chem = chem;
	}

	@Override
	public String toString() {
		return "Scores [Maths=" + Maths + ", physics=" + physics + ", Chem=" + Chem + "]";
	}
}
