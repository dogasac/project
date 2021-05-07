package Entities;

public class Player {
	private int id;
	private String userName;
	private String passaword;
	private String nationalId;
	private int birthOfYear;
	public Player(int id, String userName, String passaword, String nationalId, int birthOfYear) {
		super();
		this.id = id;
		this.userName = userName;
		this.passaword = passaword;
		this.nationalId = nationalId;
		this.birthOfYear = birthOfYear;
	
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassaword() {
		return passaword;
	}
	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	
	}

	
	

