package vti.com.railway12;

public class inthongtin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Department   department1 = new   Department ();
		    department1.id = 1;
		    department1.departmentName ="sale";
		    Department   department2 = new   Department ();
		    department2.id = 2;
		    department2.departmentName ="pm";
		    Department   department3 = new   Department ();
		    department3.id = 3;
		    department3.departmentName ="mkt";
		    Position posittion1 = new Position ();
		    posittion1.id =1;
		    posittion1.positionName =PositionName.DEV;
		    Position posittion2 = new Position ();
		    posittion2.id =2;
		    posittion2.positionName = PositionName.PM;
		  
		    Position posittion3 = new Position ();
		    posittion3.id =3;
		    posittion3.positionName = PositionName.SCRUM_MASTER;
		    
		    // tạo ra group
		   Group group1 = new Group ();
		   group1.id =1;
		   group1.groupName = "phong mkt";
		   // group1.createDate = LocalDate.now();
		   Group group2 = new Group ();
		   group2.id =2;
		   group2.groupName = "phong sale";
		   // group1.createDate = LocalDate.now();
		   Group group3 = new Group ();
		   group3.id =3;
		   group3.groupName = "phong dev";
		   // group1.createDate = LocalDate.now();
		   // tao account 
		   Account  Account1 = new Account();
		   Account1.id=1;
		   Account1.department = department1;
		   Account1.email =" nguyenvanmanh03@gmail.com ";
		   Account1.fullName ="nguyenvanmanh";
		   Account1.userName ="manhnguyen";
		   Account1.position = posittion1;
		   Account1.dsNhoms = new Group[] { group1, group2}; 
		   Account  Account2 = new Account();
		   Account2.id =2;
		   Account2.department = department2;
		   Account2.email =" nguyenvanhinh03@gmail.com ";
		   Account2.fullName ="nguyenvanhinh";
		   Account2.userName ="manhhinh";
		   Account2.position = posittion2;
		   Account2.dsNhoms = new Group[] { group2, group3}; 
		   Account  Account3 = new Account();
		   Account3.id =3;
		   Account3.department = department3;
		   Account3.email =" nguyenhoaianh03@gmail.com ";
		   Account3.fullName ="nguyenhoaianh";
		   Account3.userName ="hoaianh";
		   Account3.position = posittion3;
		   Account3.dsNhoms = new Group[] { group1};
		   group1.account = new Account[] { Account1, Account3};
		//   Question 1:
//			   Kiểm tra account thứ 2
//			   Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			   "Nhân viên này chưa có phòng ban"
//			   Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
		   if (Account2.department == null)
		   { System.out.println("phong ban nay khong co nhan vien");}
		   else
		   { System.out.println("phong ban nay co nhan vien la " 
		   +Account1.department.departmentName);}
			/*
			 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
			 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
			 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
			 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
			 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
			 * người hóng chuyện, tham gia tất cả các group"
			 */
		  if(Account2.dsNhoms == null)
		  { System.out.println("nhan vien nay chua co group");}
		  else if(Account2.dsNhoms.length == 1 ||Account2.dsNhoms.length ==2 )
		  { System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");}
		  else if(Account2.dsNhoms.length == 3)
		  { System.out.println("Nhân viên này là người quan trọng, tham gia nhiều");}
		  else if(Account2.dsNhoms.length >= 4)
		  { System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");}
		   
		//  Question 3:
//			  Sử dụng toán tử ternary để làm Question 1
		//  System.out.println (Account2.Department == null ? "Nhân viên này chưa có phòng ban" :""
//		  		+ "phong ban cua nhan vien nay la"   +Account2.Department.departmentName );                                              )
		//    
		//  Question 5:
//			  Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			  Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			  Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			  Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			  Còn lại in ra "Nhóm có nhiều thành viên"
		     
			  if (group1.account == null) {
			  
			  System.out.println("khong co thanh vien"); } 
			  else 
			  { int a = group1.account.length; 
			  switch (a) { 
			  case 1:
			  System.out.println("Nhóm có một thành viên"); 
			  break; 
			  case 2 :
			  System.out.println("Nhóm có hai thành viên"); 
			  break; 
			  case 3:
			  System.out.println("Nhóm có ba thành viên");
			  break; 
			  default:
			  System.out.println("Nhóm có nhieu  thành viên"); }
			  }
//			  Question 6:
//				  Sử dụng switch case để làm lại Question2
			  
			  if(Account2.dsNhoms.length == 0)
			  {  System.out.println("nhan vien nay chua co group");}
			  else
			  { int b =Account2.dsNhoms.length;
			  switch (b) {
			  case 1:
				  System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				  break;
			  case 2:
				  System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				  break;
			  case 3:
				  System.out.println("Nhân viên này là người quan trọng, tham gia nhiều");
				  break;
				  default:
					  System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");  
			  }
			  }
//			  Question 7:
//				  Sử dụng switch case để làm lại Question 4
			  String postioname = Account1.position.positionName.toString();
			  switch( postioname ) {
			  case "DEV" :
				  System.out.println( "Đây là Developer");
				  default :
					  System.out.println( "nguoi nay khong  là Developer");  
			  } 
//			  Question 8:
//				  In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của hoj
			 Account[] accounts= {Account1,Account2,Account3};
			 for(Account  Account : accounts)
		{System.out.println("email:" + Account.email + "id: " +Account.id+ "departmentname:" +Account.department.departmentName);}
			// Question 9:
//				 In ra thông tin các phòng ban bao gồm: id và name	 
		     Department[] deps = {department1,department2,department3};
		     for(Department dep : deps)
		     { System.out.println("id:" +dep.id+ " :ten phong ban "+dep.departmentName);}
//		     FOR
//		     Question 10:
//		     In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		     họ theo định dạng như sau:
//		     Thông tin account thứ 1 là:
//		     Email: NguyenVanA@gmail.com
//		     Full name: Nguyễn Văn A
//		     Phòng ban: Sale
//		     Thông tin account thứ 2 là:
//		     Email: NguyenVanB@gmail.com
//		     Full name: Nguyễn Văn B
//		     Phòng ban:
		     for ( int i= 0 ; i < accounts.length;i++) {
		      System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau" );
		      System.out.println("email: "+accounts[i].email);
		      System.out.println("fullname: "+accounts[i].fullName);
		      System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		     }
//		     Question 11:
//		    	 In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		    	 Thông tin department thứ 1 là:
//		    	 Id: 1
//		    	 Name: Sale
//		    	 Thông tin department thứ 2 là:
//		    	 Id: 2
//		    	 Name: Marketing
		     for ( int j=0; j<  deps.length;j++) {
		         System.out.println("phong ban so id " +(j+1)+ "co thong tin nhu sau" );
		         System.out.println("ten phong ban :"+deps[j].departmentName);
		        }
//		     Question 12:
//		    	 Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		     for ( int i= 0 ; i < 2;i++) {
		         System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau" );
		         System.out.println("email: "+accounts[i].email);
		         System.out.println("fullname: "+accounts[i].fullName);
		         System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		        }
//		     Question 13:
//		    	 In ra thông tin tất cả các account ngoại trừ account thứ 2
		     for ( int i= 0 ; i < accounts.length;i++) {
		    	 if(i != 1) {
		         System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau" );
		         System.out.println("email: "+accounts[i].email);
		         System.out.println("fullname: "+accounts[i].fullName);
		         System.out.println("ten phong ban: "+accounts[i].department.departmentName);}
		        }
				/*
				 * Question 14: In ra thông tin tất cả các account có id < 4
				 */
		     for ( int i= 0 ; i < accounts.length;i++) {
		    	 if(accounts[i].id < 4) {
		         System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau" );
		         System.out.println("email: "+accounts[i].email);
		         System.out.println("fullname: "+accounts[i].fullName);
		         System.out.println("ten phong ban: "+accounts[i].department.departmentName);}
		        }
//		     Question 15:
//		    	 In ra các số chẵn nhỏ hơn hoặc bằng 20
		     for ( int i= 0 ; i <=20;i=i+2) { 
		    	 System.out.println(+i);
		     }
//		     Question 16 dung do while lam cau:  
				/*
				 * WHILE Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE
				 * kết hợp với lệnh break, continue
				 */
//		     --10 
//		     -- khai baso gia tri khoi tao
		     int i = 0;
		     // bai 10:
		     while (i < accounts.length)
		     {
		    	 System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau1" );
		         System.out.println("email: "+accounts[i].email);
		         System.out.println("fullname: "+accounts[i].fullName);
		         System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		         i++; }
		     //  bai 11 :
		     int j=0;
		     while (j<deps.length)
		     {  System.out.println("phong ban so id " +(j+1)+ "co thong tin nhu sau2" );
		     System.out.println("ten phong ban :"+deps[j].departmentName);
		     j++;}
		     // bai 12
		     i=0;
		     while (i<2 )
		     {System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau3" );
		     System.out.println("email: "+accounts[i].email);
		     System.out.println("fullname: "+accounts[i].fullName);
		     System.out.println("ten phong ban: "+accounts[i].department.departmentName); 
		      i++;}
		     // bai 13
		     i=0;
		     while( i <  accounts.length) {
		    	 if(i!=1)
		     {  System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau4" );
		     System.out.println("email: "+accounts[i].email);
		     System.out.println("fullname: "+accounts[i].fullName);
		     System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		     }
		    	 i++;
		     }
		     // bai 14;
		     i=0;
		     while(accounts[i].id < 4)
		      {
		             System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau5" );
		             System.out.println("email: "+accounts[i].email);
		             System.out.println("fullname: "+accounts[i].fullName);
		             System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		             i++; }
		     
		     // bai 15
		     // in so chan tu 0 den 20
//		     int a = 0;
//		     while(a<=120)
//		     { 
//		    	 System.out.println(+a);
//		    	 a++;
//		     
//		     }
		     
		     // dung so while  in ra phong ban khac 2
		  i=0;
		  do {
		     if(i!=1)
		     {
		    	 System.out.println("phong ban so " + (i+1) +  "co thong tin nhu sau6" );
		         System.out.println("email: "+accounts[i].email);
		         System.out.println("fullname: "+accounts[i].fullName);
		         System.out.println("ten phong ban: "+accounts[i].department.departmentName);
		        
		     }
		     i++; 
		     } while(i<accounts.length);
	}

}
