package com.Usecases;

import java.util.Scanner;



public class Main {


	static boolean ordering = true;
	 
	public static void menu() {
		
		System.out.println("*************** 👮 👉 Welcome To Crime Information Management System 👈 👮*************"
				+ "\n1.Check and Add Crime Detail"
				+ "\n2.Check and Add Criminal Detail"
				+ "\n3.Exit");
			
		
	}
	static boolean  Switch1=true;
	public static void switchcase1() {
		Scanner sc=new Scanner (System.in);
		do {
			Switch1= true;
		System.out.println("\n1.Add crime"
				+ "\n2.View crime Record"
				+ "\n3.Update Crime Case Statuse Solved/Unsolved"
				+ "\n4.Delete crime Record"
				+ "\n5.No of solving  and unsolving crime"
				+ "\n6.Number of crimes recorded in the current month"
				+ "\n7.Crime Wise criminal Record"
				+ "\n8.Exit");
		int Choice=sc.nextInt();
		switch(Choice) {
		
		case 1:
			System.out.println("Add Crime");
			Add_crimeUsecase.AddCrimeRecord();
			break;
			
			
		case 2:
			System.out.println("View crime Record");
			GetCrimeUsecase.ViewCrimeRecord();
			break;
			
		
		case 3:
			System.out.println("Update crime Case Status");
			CaseStatusUpdateUsecase.UpdateCaseStatus();
			break;
			
		case 4:
			System.out.println("Delete Crime Record");
			DeleteCrimeUsecase.DelectCrimeRecord();
			break;
			
		case 5:
			System.out.println("No of solving  and unsolving crime");
			GetCrimeStatusCountUsecase.countSovingCases();
			break;
			
		case 6:
			System.out.println("Number of crimes recorded in the current month");
			GetcurrentMonthcrimeUsecase.OneMonthCrime();
			break;
			
		case 7:
			System.out.println("Crime Wise criminal Record");
			GetCriminal_crimeUsecase.CriminalCrimeRecord();
			break;
	
		case 8:
			System.out.println("Thank you for using application !!");
		    Switch1=false;
			break;
			
		default:
			System.out.println("Please enter valid  Choice");
			break;
		}
		}while(Switch1);
		
	}
	
	static boolean Switch2=true;
	public static void switchcase2() {
		
		Scanner sc=new Scanner (System.in);
		do {
			Switch2= true;
		System.out.println("\n1.Add criminal"
				+ "\n2.View criminal Record"
				+ "\n3.Update Criminal Record"
				+ "\n4.Delete criminal Record"
				+ "\n5.View all criminal Record"
				+ "\n6.Exit");
		int Choice=sc.nextInt();
		switch(Choice) {
		
		case 1:
			System.out.println("Add Criminal");
			AddCriminalUseCase.Addcriminal();
			break;
			
			
		case 2:
			System.out.println("View criminal Record");
			GetCriminalByCidUsecase.ViewCriminalById();
			break;
			
		
		case 3:
			System.out.println("Update criminal record");
			UpdateCriminalUsecase.Updatecriminal();
			break;
			
		case 4:
			System.out.println("Delete Criminal Record");
			DelectCriminalUsecase.DeleteCriminal();
			break;
			
		case 5:
			System.out.println("View all criminal Record ");
			GetCriminalsUsecase.Criminal();
			break;
			
		case 6:
			System.out.println("Thank you for using application !!");
			
			Switch2=false;
			break;
			
		default:
			System.out.println("Please enter valid  Choice");
			break;
		}
		}while(Switch2);
		
	}
	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner (System.in);
		
		do {
			menu();	
			System.out.println("Enter your Choice");
			int Choice=sc.nextInt();
			
			switch(Choice) {
			
			case 1:
				System.out.println("Check and add Crime detail");
				
				switchcase1();
				break;
				
				
			case 2:
				System.out.println("Check and add Criminal detail");
				switchcase2();
				break;
				
			case 3:
				System.out.println("** 😊 Thank you for using Application !!  😊 **");
				ordering=false;
				break;
				
			default:
				System.out.println("Please enter valid  Choice");
				break;
			}
		}	while(ordering);
	
		
	}
}
