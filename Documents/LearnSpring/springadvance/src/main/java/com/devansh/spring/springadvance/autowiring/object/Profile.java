package com.devansh.spring.springadvance.autowiring.object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
     @Value("Google")
	private String company;
     
     @Override
	public String toString() {
		return "Profile [company=" + company + ", role=" + role + "]";
	}

	@Value("SDE-2")
	private String role;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
