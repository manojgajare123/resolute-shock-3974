package com.bean;

import java.sql.Date;

public class Crime_Info {

private int	CrimeId;           
private String	Cdate;             
private String   Cplace;
private String   crime;            
private String	 Victims;           
private String	 Description_Crime ;
private String Suspected_name;


public Crime_Info() {
	super();
	// TODO Auto-generated constructor stub
}


public Crime_Info(int crimeId, String cdate, String cplace, String crime, String victims, String description_Crime,
		String suspected_name) {
	super();
	CrimeId = crimeId;
	Cdate = cdate;
	Cplace = cplace;
	this.crime = crime;
	Victims = victims;
	Description_Crime = description_Crime;
	Suspected_name = suspected_name;
}


public int getCrimeId() {
	return CrimeId;
}


public void setCrimeId(int crimeId) {
	CrimeId = crimeId;
}


public String getCdate() {
	return Cdate;
}


public void setCdate(String cdate) {
	Cdate = cdate;
}


public String getCplace() {
	return Cplace;
}


public void setCplace(String cplace) {
	Cplace = cplace;
}


public String getCrime() {
	return crime;
}


public void setCrime(String crime) {
	this.crime = crime;
}


public String getVictims() {
	return Victims;
}


public void setVictims(String victims) {
	Victims = victims;
}


public String getDescription_Crime() {
	return Description_Crime;
}


public void setDescription_Crime(String description_Crime) {
	Description_Crime = description_Crime;
}


public String getSuspected_name() {
	return Suspected_name;
}


public void setSuspected_name(String suspected_name) {
	Suspected_name = suspected_name;
}


@Override
public String toString() {
	return "Crime_Info [CrimeId=" + CrimeId + ", Cdate=" + Cdate + ", Cplace=" + Cplace + ", crime=" + crime
			+ ", Victims=" + Victims + ", Description_Crime=" + Description_Crime + ", Suspected_name=" + Suspected_name
			+ "]";
}



	
}
