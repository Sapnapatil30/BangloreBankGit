package com.sopra.project;
import java.util.*;

public class Main {

	public static int total=1000;
	public static int deposit(int a)
	{

		total=a+total;
		return total;

	}
	public static int withrow(int b)
	{
	   total=total-b;
	   return total;

	}
	public static void view()
	{
		System.out.println("Total Balance : "+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();

		System.out.println("Enter Bank Id : ");
		int bi=sc.nextInt();
		System.out.println("Enter Bank Name : ");
		String bn=sc.next();
		System.out.println("Enter acount no : ");
		String ac=sc.next();
		b.setBankId(bi);
		b.setBankName(bn);
		b.setAccountNo(ac);
		System.out.println(b);

		Main m1 = new Main();
		int amount,ch;

		System.out.println("Account balance ");
		m1.view();


		int ss;

		do {
			System.out.println("1. Deposit 2.Withdrow ");
			System.out.println("Enter your choise : ");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1 :    System.out.println("Enter amount ");
					amount=sc.nextInt();
					System.out.println("deposite " + amount +" Rs ");
					m1.deposit(1000);
					m1.view();
					break;

		case 2 :    System.out.println("Enter amount ");
					amount=sc.nextInt();
					System.out.println("withdrow " + amount +" Rs ");
					m1.withrow(500);
					m1.view();
					break;

		default :   System.out.println("Invalid information");
		}

		System.out.println("Enter 1 for Continue");
		ss=sc.nextInt();

		}while(ss==1);

	}

}