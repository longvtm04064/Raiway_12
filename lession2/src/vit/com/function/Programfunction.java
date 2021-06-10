package vit.com.function;
import java.util.Scanner;

public class Programfunction {
	public static void main(String[] args) {
		
//		String hoTen = nhapten();
//		System.out.println(hoTen);
//	}

//	public static void hienThiTen()
//	{System.out.prinln("Toi la ai, day la dau");}

	// -----------------------------------
//	public static int tongCuaHaiSo(int a, int b)
//	{int tong = a + b;
//	return tong; 
//	}

	// viet mot ham nhap vao ten va sau do in ten cua nguoi do
//	public static String nhapten() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap ten: ");
//		String hoTen = scanner.nextLine();
//		return hoTen;
		
		
//-------------------------------------------- tao function ATM 
		int nhap;
		System.out.println("chao mung ban den voi vti");
		do {
			   System.out.println("Moi  ban chon chua nang");
			   System.out.println("------------------------");
			   System.out.println("1.rut tien");
			   System.out.println("2.chuyen tien");
			   System.out.println("3.truy van so du");
			   System.out.println("4.dong bat ho");
			   System.out.println("5.Thoat");
			   Scanner Scanner = new Scanner (System.in);
			    nhap = Scanner .nextInt();
			   ATM(nhap);}   while (nhap !=5) ;}
	
	public static void ATM(int nhap)
	{ switch (nhap)
		{case 1:
			System.out.println("1.rut tien");
			break;
		case 2:
			System.out.println("2.chuyen tien");
			break; 
		case 3:
			System.out.println("3.truy van so du");
			break; 
		case 4:
			System.out.println("4.dong bat ho");
			break;
		case 5:
			System.out.println("5.Thoat");
			break;
			default: System.out.println("Moi ban nhap tu 1 ->  5");}
	}

	
}	


