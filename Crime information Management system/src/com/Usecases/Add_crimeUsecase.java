package com.Usecases;

import java.sql.Date;
import java.util.Scanner;
import com.DAO.CriminalDAo;
import com.DAO.CriminalaDAOImpl;
import com.bean.Crime_Info;


public class Add_crimeUsecase {



	public static void main(String[] args) {
		
	
			
			Scanner sc= new Scanner (System.in);
			
			System.out.println("Enter Crime Date: ");
			String date1=sc.next();
			
			System.out.println("Enter Crime Place : ");
			String place=sc.next();
			
			
			System.out.println("Enter Description of crime : ");
			String crime=sc.next();
			
			System.out.println("Enter Crime Victims : ");
			String victim=sc.next();
			
			System.out.println("Enter Detail Description of crime: ");
			String desc=sc.next();
			
			System.out.println("Enter Crime Suspected name : ");
			String suspect=sc.next();
			
		
			
			
			CriminalDAo dao1=new CriminalaDAOImpl();

			Crime_Info crime1=new Crime_Info();
			
			crime1.setCdate(date1);
			crime1.setCplace(place);
			crime1.setCrime(crime);
			crime1.setVictims(victim);;
			crime1.setDescription_Crime(desc);
			crime1.setSuspected_name(suspect);
		
		
			
			String result= dao1.AddCrime(crime1);
			
			System.out.println(result);
			
	}

	
}
