package com.Patient;

public class Patient {
	private int id;
	private String NIC;
	private String pName;
	private int pAge;
	private String Gender;
	private String Mphone;
	private String Hphone;
	private String pAddress;
	private String pEmail;
	private String bloodType;
	private String Insuarance;
	private String MedicalHistory;
	private String pwd;
	
	//default constructor
	public Patient() {}
	
	//overloaded constructor
	public Patient(int id, String nIC, String pName,int pAge, String gender, String mphone, String hphone,
			String pAddress, String pEmail, String bloodType, String insuarance, String medicalHistory,String pwd) {

		this.id = id;
		this.NIC = nIC;
		this.pName = pName;
		this.pAge = pAge;
		this.Gender = gender;
		this.Mphone = mphone;
		this.Hphone = hphone;
		this.pAddress = pAddress;
		this.pEmail = pEmail;
		this.bloodType = bloodType;
		this.Insuarance = insuarance;
		this.MedicalHistory = medicalHistory;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public String getNIC() {
		return NIC;
	}

	public String getpName() {
		return pName;
	}

	public int getpAge() {
		return pAge;
	}

	public String getGender() {
		return Gender;
	}

	public String getMphone() {
		return Mphone;
	}

	public String getHphone() {
		return Hphone;
	}

	public String getpAddress() {
		return pAddress;
	}

	public String getpEmail() {
		return pEmail;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String getInsuarance() {
		return Insuarance;
	}

	public String getMedicalHistory() {
		return MedicalHistory;
	}
	
	public String getpwd() {
		return pwd;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public void setMphone(String mphone) {
		Mphone = mphone;
	}

	public void setHphone(String hphone) {
		Hphone = hphone;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void setInsuarance(String insuarance) {
		Insuarance = insuarance;
	}

	public void setMedicalHistory(String medicalHistory) {
		MedicalHistory = medicalHistory;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
