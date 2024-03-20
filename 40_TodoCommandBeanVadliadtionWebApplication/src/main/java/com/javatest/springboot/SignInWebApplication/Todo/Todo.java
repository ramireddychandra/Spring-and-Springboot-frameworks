package com.javatest.springboot.SignInWebApplication.Todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {

	private int id;
	private String username;
	
	@Size(min=10,message ="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean status;

	public Todo(int id,  String username,String description, LocalDate targetDate, boolean status) {
		super();
		this.id = id;
		this.username = username;	
		this.description = description;
		this.targetDate = targetDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", username=" + username + ", targetDate="
				+ targetDate + ", status=" + status + "]";
	}

}
