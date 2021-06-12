package lesson3;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    long a = 12;
//	    int b = (int)a;
//	    float c = (float)a/b;
//	    // kieu du lieu moi
//	    int[] d= new int[5];
//	    for(int i=0; i<d.length;i++)
//	    System.out.println(d[i]);
	//   Integer f = new Integer(5);
	//   Integer g = new Integer(5);
	//   if( f== g)
//		   System.out.println("bang nhau");
	//   else 
//		   System.out.println("khong bang nhau ");
	//   
//	    // vi so sanh 2 o nho nen dia chi khac nhau 
	//   // dung equals
	//	
//		if(f.equals(g)) // so sanh voi gia tri ben han ben trong o nho 
//			
//			   System.out.println("bang nhau");
//		   else 
//			   System.out.println("khong bang nhau ");
//		   
//		 String hoten1 = new String("nam");
//		 String hoten2 = "nam" ;
//		 if(hoten1 == hoten2)
//			 System.out.println("bang");
//		 else
//			  System.out.println("khong bang nhau ");
	// float luongacc1 = 5240.5f;
	// float luongacc2 = 10970.055f;
	// int luongac1 = (int )luongacc1;
	// int luongac2 = (int )luongacc2;
		
		  
		  //EX4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		// Gọi hàm trong main
		 // question4();
		  // Tạo phương thức static
//		  public static void question4() {
//		  int a, b;
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("Nhập a = ");
//		  a = scanner.nextInt();
//		  do {
//		  System.out.println("Nhập b = ");
//		  b = scanner.nextInt();
//		  if (b == 0) {
//		  System.out.println("Vui lòng nhập b khác 0 !");
//		  }
//		  } while (b == 0);
//		  scanner.close();
//		  System.out.println("Thương: " + (float) a / (float) b);
//		  }
	// Question 2:
//		 Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//		 có số 0 ở đầu cho đủ 5 chữ số)
	 
//	 Random ran = new Random();
//	 long h = ran.nextInt(99999);
//	 System.out.println("h1="+h);
//	 if (h<10000)
//		 h = h*10;
//	 System.out.println(h);
	 
	 
	// Question 3:
//		 Lấy 2 số cuối của số ở Question 2 và in ra.
//		 Gợi ý:
//		 Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//		 Cách 2: chia lấy dư số đó cho 100
//	  long sodu = h%100;
//	  System.out.println("so can tim la :"+sodu);
	  
	  //question3: Lấy 2 số cuối của số ở Question 2 và in ra.
	  //Gợi ý:
		  //Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
		  //Cách 2: chia lấy dư số đó cho 100
	  
//	  int min = 0;
//	  int max = 99999;
//	  int a = (int) (Math.random() * max) + min;
//	  while (a < 10000) {
//	  a = a * 10;
//	  }
//	  System.out.printf("===Question2======\n");
//	  System.out.println("Số ngẫu nhiên: " + a);
//	  System.out.println("======Question3=======");
//	  String b = String.valueOf(a);
//	  System.out.println("Hai số cuối: " + b.substring(3)); 
		 
		 // ep kieu tu string sang int 
	  //va nguoc al
	  //String myString  = "12345";
	  //int foo = Integer.parseInt(myString);
	  //System.out.println(foo);
	  //String a= String.valueOf(foo);
	  //String b = "+foo";
	  //String  c= Integer.toString(foo);
	  //groupp gr1 = new   roupp ();
	   //gr1.id = 1;
	  //gr1.groupname ="phong sale";
	  //Groupp gr2 = new   Groupp ();
	  //gr2.id =2;
	  //gr2.groupname = "phong sale";
	  //System.out.println(gr1.equals(gr2));
	  //compare
	  
		//----------------------------------------------------------------------//
	  //Exercise 2 (Optional): Default value
	  //Question 1:
	  //Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
	  //tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
		System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");

				Account[] accArray = new Account[5];
				for (int i = 0; i < accArray.length; i++) {
				Account acc = new Account();
				acc.email = "Email " + i;
				acc.user = "User name " + i;
				acc.fullName = "Full name " + i;
				acc.createDate = LocalDate.now();
				accArray[i] = acc;
				System.out.println(

				"Thông tin Account " + i + " Email: " +

				accArray[i].email + " UserName: " + accArray[i].user
				+ " FullName: " +
				accArray[i].fullName + " CreateDate: " + accArray[i].createDate);
	  
	  }
	  
	  //Exercise 3(Optional): Boxing & Unboxing
	  //Question 1:
	  //Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
	  //Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
	  //float có 2 số sau dấu thập phân)
	  	Integer salary = 5000;
		System.out.printf("%2.2f" , (float) salary);

	  // Question 2:Khai báo 1 String có value = "1234567"
		//Hãy convert String đó ra số int
		System.out.println("Question2");
		String s = "1234567";
		int i = Integer.parseInt(s);
		System.out.println(i);
	  
	// Question 3: Khởi tạo 1 số Integer có value là chữ "1234567"
		//Sau đó convert số trên thành datatype int	
		System.out.println("Question3");
		Integer integer = 1234567;
		int i1 = integer.intValue();
		System.out.println(i1);
		
		//Exercise 4: String
		//Question 1:
		//Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
		//thể cách nhau bằng nhiều khoảng trắng ); => đáp án chưa chính xác, cần xem lại	
		
		String s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		System.out.println("Số kí tự: " + words.length);
		scanner.close();
		
		// QUESTION 2 : Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Question 2 ------------");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi 1: ");
		String s1String = sc1.next();
		System.out.println("Nhập vào chuỗi 2: ");
		String s2 = sc1.next();
		
	   // Question 3:
		//Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu
		//thì viết hoa lên
		
		Scanner scanner2 = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		System.out.println("char at:"+ name.charAt(1));
		name = firstCharacter + leftCharacter;
		System.out.println(name);
		scanner.close();
		
		// Question 4:
		//Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên
		//của người dùng ra
		//VD:
		//Người dùng nhập vào "Nam", hệ thống sẽ in ra
		//"Ký tự thứ 1 là: N"
		//"Ký tự thứ 1 là: A"
		//"Ký tự thứ 1 là: M"
		
		String nameString;
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = scanner.nextLine();
		name = name.toUpperCase();
		for (int iinteger = 0; i < name.length(); i++) {
		System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
		}
		scanner.close();
		// HỎI THẦY SAO LẠI DÙNG IINTERGER DÒNG FOR MÀ KHÔNG ĐƯỢC DÙNG I 
		
		// Question 5:
		//Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
		//dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Nhập họ: ");
		String firstName = scanner.nextLine();
		System.out.println("Nhập tên: ");
		String lastName = scanner.nextLine();
		System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));
		scanner.close();
		
		// Question 6:
		//Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
		//sau đó hệ thống sẽ tách ra họ, tên , tên đệm
		//VD:
		//Người dùng nhập vào "Nguyễn Văn Nam"
		//Hệ thống sẽ in ra
		//"Họ là: Nguyễn"
		//"Tên đệm là: Văn"
		//"Tên là: Nam"
		
		String fullName;
		String lastNameString = "", middleName = "", firstNameString = "";
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("Nhập họ tên đầy đủ:");
		fullName = scanner.nextLine();
		// Chuẩn hóa xâu
		fullName = fullName.trim();
		String[] wordStrings = fullName.split(" ");
		lastName = words[0];
		firstName = words[words.length - 1];
		for (int j = 1; i <= words.length - 2; i++) {
		middleName += words[i] + " ";
		}
		System.out.println("Họ là: " + lastName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName);
		scanner.close();
		
		// Question7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
		//chuẩn hóa họ và tên của họ như sau:
			//a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
			//vào
			//VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
		//	chuẩn hóa thành "nguyễn văn nam"
			//b) Viết hoa chữ cái mỗi từ của người dùng
			//VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
			//chuẩn hóa thành "Nguyễn Văn Nam"
		
		Scanner scanner6 = new Scanner(System.in);
		String fullNameString;
		System.out.println("Nhập họ tên đầy đủ");
		fullName = scanner.nextLine();
		scanner.close();
		// remove space characters
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		System.out.println("test"+ fullName);
		String[] wordsStrings = fullName.split(" ");
		fullName = "";
		for (String word : words) {
		String firstCharacteString = word.substring(0, 1).toUpperCase();
		String leftCharacterString = word.substring(1);
		word = firstCharacter + leftCharacter;
		fullName += word + " ";
		}
		System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
		
		
		// Question 8:
		//In ra tất cả các group có chứa chữ "Java"
		
		String[] groupNames = 
			{ "Java with VTI", "Cách qua môn gia va", "Học Java có khó không?" };

				for (String groupName : groupNames) 
				{
				if (groupName.contains("Java")) 
				{System.out.println(groupName);}
				}
				
		
		//Question 9:
		//In ra tất cả các group "Java"
				
				String[] groupNameStrings = { "Java", "C#", "C++" };
				for (String groupName : groupNames) 
				{
				if (groupName.equals("Java")) 
				{System.out.println(groupName);}
				}
		
		// Question 10 (Optional):
				//Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
				//Nếu có xuất ra “OK” ngược lại “KO”.
				//Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
				Scanner scanner7 = new Scanner(System.in);
				String s1String2, s2String, reverseS1 = "";
				System.out.println("Nhập chuỗi 1");
				s1 = scanner.nextLine();
				System.out.println("Nhập chuỗi 2");
				s2 = scanner.nextLine();
				scanner.close();
				for (int ii = s1.length() - 1; i >= 0; i--) {
				reverseS1 += s1.substring(i, i + 1);
				}
				if (s2.equals(reverseS1)) {
				System.out.println("Đây là chuỗi đảo ngược !");
				}
				else {
				System.out.println("Đây không phải chuỗi đảo ngược");
				}
		
		// Question 11: Count special Character
				//Tìm số lần xuất hiện ký tự "a" trong chuỗi
				Scanner scanner8 = new Scanner(System.in);
				String str;
				System.out.println("Mời bạn nhập vào một chuỗi: ");
				str = scanner.nextLine();
				scanner.close();
				int count = 0;
				for (int j = 0; i < str.length(); i++) {
				if ('a' == str.charAt(i)) {
				count++;
				}
		
		// Question 12 : Reverse String
				//Đảo ngược chuỗi sử dụng vòng lặp
				Scanner scanner9 = new Scanner(System.in);
				String s1String3, reverseS1String = "";
				System.out.println("Nhập chuỗi 1");
				s1 = scanner.nextLine();
				for (int k = s1.length() - 1; i >= 0; i--) {
				reverseS1 += s1.charAt(i);
				}
				System.out.println(reverseS1);
				scanner.close();
		
	  // Question 13 : String not contains digit
				//Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
				//lại true.
				//Ví dụ:
				//"abc" => true
				//"1abc", "abc1", "123", "a1bc", null => false
		
				Scanner scanner10 = new Scanner(System.in);
				String string;
				System.out.println("Nhập chuỗi: ");
				str = scanner.nextLine();
				scanner.close();
				for (int k = 0; i < str.length(); i++) {
				if (checkKeyNumber(str.charAt(i))) {
				System.out.println("False");
				return;
				}
				}
				System.out.println("True");
				}
				public static boolean checkKeyNumber(char ch) {
				if (ch >= '0' && ch <= '9') {
				return true;
				}
				return false;	
				
				
		// Question 14: Replace character
				//Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
				//cho trước.
				//Ví dụ:
				//"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"		
		
				Scanner scanner = new Scanner(System.in);
				String str;
				char ch1, ch2;
				System.out.println("Nhập chuỗi: ");	
				str = scanner.nextLine();
				System.out.println("Nhập kí tự muốn chuyển: ");
				ch1 = scanner.nextLine().toCharArray()[0]; 
				// chuyển một mảng string sang array char, sau đó lấy phần tử thứ 0

				System.out.println("Nhập kí tự sẽ chuyển: ");
				ch2 = scanner.nextLine().toCharArray()[0];
				scanner.close();
				for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch1) {
				str = str.replace(ch1, ch2);
				}
				}
				System.out.println("Chuoi sau khi chuyen: " + str);	
				
		// Question 15: Revert string by word
				//Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
				//thư viện.
				//Ví dụ: " I am developer " => "developer am I".
				//Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
				//Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
				//chuỗi theo dấu cách		
				
				Scanner scanner2 = new Scanner(System.in);
				String string;
				System.out.println("Chuỗi: ");
				str = scanner.nextLine();
				scanner.close();
				str = str.trim();
				str = str.replaceAll("\\s+", " ");
				String[] words = str.split(" ");
				for (int i = words.length - 1; i >= 0; i--) {
				System.out.print(words[i] + " ");
				}	
				
		// Question 16 Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
				//bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
				//hình “KO”.
				//public static void
				
				Scanner scanner3 = new Scanner(System.in);
				String string2;
				int n;
				System.out.println("Chuỗi: ");
				str = scanner.nextLine();
				System.out.println("Nhập n: ");
				n = scanner.nextInt();
				scanner.close();
				if (str == null || str.isEmpty() || str.length() % n != 0) {
				System.out.println("No");
				return ;
				}

				for (int i = 0; i < str.length(); i += n) {
				System.out.println(str.substring(i, i + n));
				}
				
				
				
				
				
				
		
	}
	