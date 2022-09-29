package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Utility.DBUtil;
import com.bean.Crime_Info;


public class CrimeDAOImp implements CrimeDAO{

	
	@Override
	public String AddCrime(Crime_Info crimeInfo) {
		String msg= "Not Insertd ....";
		
		

		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement
					("insert into crimInfo (Cdate, Cplace, crime, Victims, Description_Crime, Suspected_name) "
							+ "values (?,?,?,?,?,?)");
			
			ps.setString(1,crimeInfo.getCdate());
			ps.setString(2, crimeInfo.getCplace());
			ps.setString(3,crimeInfo.getCrime());
			ps.setString(4,crimeInfo.getVictims());
			ps.setString(5,crimeInfo.getDescription_Crime());
			ps.setString(6,crimeInfo.getSuspected_name());
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Crime Added Sucessfully !";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return msg;
	}

	
	

}
