package com.example.LabCycle1;

public class Customer {
	String name,address;
	Ticket ticket;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", ticket=" + ticket + "]";
	}
}
