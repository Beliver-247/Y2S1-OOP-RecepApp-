package com.Receptionist;

public class Receptionist {
	private int id;
	private String Rname;
	private String Address;
	private String email;
	private String mobile;
	private String UserID;
	private String UPassword;
	
	//overloaded constructor
	public Receptionist(int id, String rname, String address, String email, String mobile, String userID,
			String uPassword) {
		
		this.id = id;
		this.Rname = rname;
		this.Address = address;
		this.email = email;
		this.mobile = mobile;
		this.UserID = userID;
		this.UPassword = uPassword;
	}

	public int getId() {
		return id;
	}

	public String getRname() {
		return Rname;
	}

	public String getAddress() {
		return Address;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getUserID() {
		return UserID;
	}

	public String getUPassword() {
		return UPassword;
	}

}
