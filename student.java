package studentdemo;
import java.util.Scanner;


public class student {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner("1 2 3 4 5 7 8");
			int no;
			int num;
			while(sc.hasNextInt())
			{
				no=sc.nextInt();
				System.out.println(no +" : "+no*no);
			}
			System.out.println("------------------------------------");
			//sc=new Scanner("Nashik, Pune, Mumbai");
			sc=new Scanner("Nashik, Pune, Mumbai").useDelimiter(", ");
			while(sc.hasNext())
				System.out.println(sc.next());
			System.out.println("------------------------------------");
			sc=new Scanner("1. 2. 3. 4. 5").useDelimiter(". ");
			while(sc.hasNextInt())
				System.out.println(sc.nextInt());
			System.out.println("------------------------------------");
			Scanner sc1=new Scanner("1 2 3 4 5 7 8 ");
			while(sc1.hasNextInt()) {
				num=sc1.nextInt();
				if(num%2==0)
				  System.out.println(num);	
			}
		}				
		
}


