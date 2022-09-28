package com.DAO;

import com.bean.Crime_Info;
import com.bean.Criminal_Info;

public interface CriminalDAo {

	public String AddCriminal(Criminal_Info criminalInfo);
	public String AddCrime(Crime_Info crimeInfo);
	
}
