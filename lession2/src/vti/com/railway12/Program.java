package vti.com.railway12;


import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 6;
		//int b = 2;
		//int c = 3;
		//if(a == c) 
			//{System.out.println("bang nhau");}
		 // else if (a<b); 
			//{System.out.println("khac  nhau");}
			
			//{System.out.println(a == b ? "bang nhau" : "khac nhau");}			 
		// chú ý:  của int  cách này dung rất nguy hiểm vì dễ nhầm  chỉ được 1 if else 
		
		//switch (a)
		//{
		//case 1:System.out.println("Day la so 1"); 
		//break; 
		//case 2:System.out.println("Day la so 2"); 
		//break; 
		//case 3:System.out.println("Day la so 3"); 
		//break; 
		//case 4:System.out.println("Day la so 4"); 
		//break; 
		//default: 
			//System.out.println("So nao do"); 
		//}	
		// như cây rút tiền có  các mục để khách hàng chọn thì dùng cú pháp switch: nút  case 	
		// break: dùng luôn tại chỗ nếu đáp án đúng tối ưu hơn 
		
		//for (int i = 0 ; i <5 ; i++)
		//{System.out.println(i);}
		
		// chạy từ 0 đến 19 
		//  sự khác biệt néu để int ở ngoài ngoặc thì có thể {System.out.print(i);} nhiều lần hơn 
		// để i++ thì dãy số sẽ đi từ bé đến lớn i-- là từ lớn đến bé 
		// thêm ln hoặc /n ở print thì số sẽ xuống dòng 
		
		// --------------------------------------------------------------
//		Group group1 = new Group();
//		group1.id = 1; 
//		group1.groupName = "group1";
//		Group group2 = new Group();
//		group2.id = 2; 
//		group2.groupName = "group2";
//		Group group3 = new Group();
//		group3.id = 3; 
//		group3.groupName = "group3";
//		
//		Group[] groups = {group1, group2, group3}; // tạo ra các tập hợp con 
		
		//for (Group item : groups) 
		//{System.out.println("ID: " + item.id + " Name: " + item.groupName );} 
		// muốn thao tác trực tiếp đối tượng nếu biết rõ nó  
		
		//for (int i = 0; i < groups.length; i++) 
		//{System.out.println("ID: " + groups[i].id + " Name: " + groups[i].groupName );}
		// thao tác từng đối tượng khi đọc từ 0 theo điều kiện đặt ra 
		
		
		
		//do 
		//{System.out.println(a);a++;}
		// while (a < 6);
		
		//while (a < 6)
		//{System.out.println(a); a++;}
		
		// -------------------------------
		//for (int i = 0; i < 20; i++)
		//{if(i%2 == 0)
			//{continue; // bỏ qua thằng  if phía trước 
			//}
		//System.out.println(i);
			//}
		
		//boolean isCorrent = false; // để chỉ định câu trả lời ra đáp án nào của if 
		
		//--------------------------------------
//		LocalDate localDate = LocalDate.now()												;
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE					; 
//		System.out.println(localDate.format(dateFormatter)); //2020-01-04
//		//-----------------------------------------------------
//		
//		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy")		; 
//		System.out.println(localDate.format(dateFormatter1)); //2020-01-04 
//		
//		DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy")		; 
//		System.out.println(localDate.format(dateFormatter1)); // January 04, 2020
//	
//		DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-YYYY")		; 
//		System.out.println(localDate.format(dateFormatter3)); // 04  January , 2020
		// Cau lenh in ra ngay thang 
		// import java.time.LocalDate;
		// import java.time.format.DateTimeFormatter							;
		// import trước khi in ấn crt cách 
		
//		float tiencuatoi = 545.56453f; 
//		{System.out.printf( "%.3f", tiencuatoi); }
		// cau lenh lam tron so 
		
		//----------------------------------
//		Scanner scanner  = new Scanner(System.in)								;
//				System.out.printf( "Moi ban nhap vao mot ten :" )				;
//		String hoten  = scanner.nextLine();
//				System.out.printf( "Ten toi la : " + hoten )					;	
		//------------------------------------		
//			
//				System.out.printf( "Moi ban nhap vao mot so :" )				;
//		int a  = scanner.nextInt()												;
//				System.out.printf( "Ban vua nhap vao so : " + a  )				;		
				// khong lay so khong nhap so dung int nhap chuỗi là String
				// neu ghi moi next thi khong co dau cach 
				// Scanner scanner  = new Scanner(System.in); cau lenh chi go 1 lan duy nhat 
				
		//--------------------------------
//				Random random = new Random()									;
//				int a = random.nextInt(50) + 100								;
//				System.out.println(a)											;
				// chi duoc dung println 
				// lay ngau nhien 1 so bat ki 
				
		// ----------------------------------
//		        Random random = new Random ()									; 
//		 		int minDay = (int) LocalDate.of(1990, 1, 1).toEpochDay()		;		 				 		
//		 		int maxDay = (int) LocalDate.of(2021, 6, 6).toEpochDay()		;
//		 		long randomInt = minDay + random.nextInt(maxDay - minDay)		; 
//		 		LocalDate randomDay = LocalDate.ofEpochDay(randomInt)			;
//		 		System.out.println(randomDay);
		 		
		// lay ra so ngay giua min max 
		
		// phan quan trong 
		
		 		
		
		//-----------------------------------------------------------------------------
		// Làm bài tập lesson 2 
		// Tạo 1 Project đặt tên là "TestingSystem_Assignment_2", tách mỗi
		// exercise thành 1 class riêng, mỗi Question tách thành 1 method 
		
		// Tạo Department
		
		Department dep1 = new Department()			;
		dep1.id = 1									;
		dep1.departmentName = "Marketing"			;
		
		Department dep2 = new Department()			;
		dep1.id = 2									;
		dep1.departmentName = "Sales"				;
		
	
		Department dep3 = new Department()			;
		dep1.id = 3									;
		dep1.departmentName = "BOD"					;
		
		// Tạo Position
		
		Position pos1 = new Position()				;
		pos1.id = 1									;
		pos1.positionName = PositionName.DEV		;
		
		Position pos2 = new Position()				;
		pos2.id = 2 								;
		pos2.positionName = PositionName.TEST		;
		
		Position pos3 = new Position()					;
		pos3.id = 3 									;
		pos3.positionName = PositionName.SCRUM_MASTER	;
		
		Position pos4 = new Position()				;
		pos4.id = 4									;
		pos4.positionName = PositionName.PM			;
		
		
		// Tạo Group

		Group gro1 = new Group()					;
		gro1.id = 1									;
		gro1.groupName = "Testing System"			;
		
		
		Group gro2 = new Group()					;
		gro2.id = 2									;
		gro2.groupName = "Development"				;
		
		Group gro3 = new Group()					;
		gro3.id = 3									;
		gro3.groupName = "Sale"				        ;
		
		// Tạo account 
		Account acc2 = new Account()				;
		acc2.id = 2;
		acc2.email = "daonq1"						;
		acc2.userName = "daonq1"					;
		acc2.fullName = "Dao Nguyen 1"				;
		acc2.department = dep1						;
		acc2.position = pos2						;
		acc2.createDate = LocalDate.now()			;
		Group[] groacc = { gro1, gro2 }			;
		acc2.Group = groacc1						;
		
		Account acc1 = new Account()				;
		acc1.id = 1;
		acc1.email = "daonq1"						;
		acc1.userName = "daonq1"					;
		acc1.fullName = "Dao Nguyen 1"				;
		acc1.department = dep1						;
		acc1.position = pos1						;
		acc1.createDate = LocalDate.now()			;
		Group[] groacc1 = { gro1, gro2 }			;
		acc1.Group = groacc1						;
		
		
		
		
		
			}
		
		
		
		
	}


