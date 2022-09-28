package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Utility.DBUtil;
import com.bean.Crime_Info;
import com.bean.Criminal_Info;

public class CriminalaDAOImpl  implements CriminalDAo {

	@Override
	public String AddCriminal(Criminal_Info criminalInfo) {

		String msg= "Not Insertd ....";
		
	
		
		try(Connection conn= DBUtil.provideConnection();) {
			PreparedStatement ps = conn.prepareStatement
					("insert into criminal (Cname, Age, Gender, Address, Face_mark, Crime_Area, Crime_Name) "
							+ "values (?,?,?,?,?,?,?)");
			
			ps.setString(1,criminalInfo.getName());
			ps.setInt(2, criminalInfo.getAge());
			ps.setString(3,criminalInfo.getGender());
			ps.setString(4,criminalInfo.getAddress());
			ps.setString(5,criminalInfo.getIdentify_face_mark());
			ps.setString(6,criminalInfo.getCrime_Area());
			ps.setString(7,criminalInfo.getCrime_Name());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Criminal Added Sucessfully !";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

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
