package baitapbosung;

import java.util.Scanner;

public class baitapbosung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("moi nhap a.b");
		int a = Scanner.nextInt();
		int b = Scanner.nextInt();
		int c = Scanner.nextInt();
		int chuvi = chuvi(a, b);
		System.out.println(+chuvi);
		int dientich = dientich(a, b);
		System.out.println(+dientich);
		daysocantim();
		int nhap = a;
		int tong = tong(nhap);
		System.out.println(tong);
		nghiempt(a,b,c);
		 nhaptaikhoan();
	}

	public static int chuvi(int a, int b) {
		int chuvi = (a + b) * 2;
		return chuvi;
	}

	public static int dientich(int a, int b) {
		int dientich = a * b;
		return dientich;
	}

	public static void daysocantim() {
		for (int i = 10; i <= 200; i++) {
			if (i % 7 == 0 && i % 5 != 0) {
				System.out.println(+i);
			}

		}
	}

	public static int tong(int nhap) {
		int tong = 0;
		do {
			int d = nhap / 10;
			int c = nhap % 10;
			tong = tong + c;
			nhap = d;
		} while (nhap % 10 != 0);

		return tong;
	}

	public static void nghiempt(int a, int b, int c) {
		double x1, x2;
		if (a == 0) {
			System.out.println("khong phai pt bac 2");
		}
		if (a != 0) { // th1
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("vo nhgiem");
			} else if (delta == 0) {
				x1 = x1 = -b / (2 * a);
				System.out.println("x1=x2=" + x1);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);

				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}

	}
	public static void  nhaptaikhoan()
	{   String username ="nguyenvananh";
		int password = 56423;
		String user;
		int pass;
		do  
	{ Scanner Scanner = new Scanner(System.in);
	System.out.println("moi nhap username :");
	   user  =Scanner.nextLine();
	    System.out.println("nhap mat khau");
	   pass = Scanner.nextInt();
	    if(( user !=  username) && (pass != password))
	    {System.out.println("dang nhap khong thanh cong");}
	}  while(( user !=  username) && (pass != password));
		System.out.println("dang nhap thanh cong");

	

}}
