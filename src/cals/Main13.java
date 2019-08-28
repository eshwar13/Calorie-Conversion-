package cals;
import java.util.Scanner ;
public class Main13
{
int bread = 74 ;
int jam = 26 ;
int butter = 120 ;
public void show1(int a , int b , int c)
{
	int res = (a * bread) + (b * jam) + (c * butter) ;
	double eng = res * 4.1868 ;
	System.out.println(eng +" KJ of energy is consumed from "+ res + " calories ");
}
  public void show1(int n )
  {
	  int res = n * bread ;
	  double eng = res * 4.1868 ;
	  System.out.println(eng + " KJ of energy is consumed from : " + res + " calories");
  }

  public void show1(int n1 , int n2)
  {
	 int res = (n1 * bread ) + (n2 * jam) ;
	  double eng = res * 4.1868 ;
	  System.out.println(eng + " KJ of energy is generated from " + res + " caloriers .");
  }
  
       public static void main(String[] args)
	{

	
	System.out.println("1 . Bread + Jam ");
	System.out.println("2. Only Bread ");
	System.out.println("3 . Bread + Jam + Butter");
	 System.out.println("-----------");
	
	
	
	
		Scanner in = new Scanner(System.in);
	 String m = null ;

		do
		{
		
			System.out.println("enter your option ");
			int choice = in.nextInt();
			
			
			switch(choice)
			{
			case 1 :  
			
			 System.out.println("Enter  number of bread slices");
	 int n1 = in.nextInt();
	 System.out.println("Enter number of Jam  ");
	 int n2 = in.nextInt();
	 Main13  obj = new Main13();
	
	 obj.show1(n1, n2);
	 
	 System.out.println("||||||||||");
	 System.out.println("If u want to continue 'Y' (or) To exit press  'N'");
	   m = in.next();
	   break ;
			case 2 :
				System.out.println("enter the number of bread  slices");
				int n = in.nextInt();
				Main13 obj1 = new Main13();
				obj1.show1(n); 
				
			System.out.println("If u want to continue 'Y' (or) To exit press 'N' ");
			m = in.next();
			break ;
			case 3 :
				System.out.println("enter the number of bread slices");
				int a = in.nextInt();
				System.out.println("enter the content of jam ");
				int b = in.nextInt();
				System.out.println("enter the content of butter");
				int c = in.nextInt(); 
				Main13 obj3 = new Main13();
				obj3.show1(a , b ,c);
				System.out.println("Ifu want to continue press 'Y' or TO exit 'N' ");
				m = in.next();
				break ;
						
			}
	 
		}
		
		while(m.equals("Y") || m.equals("y"));
		while(m.equals("N"))
		{
			System.out.println("Thanks");
			break ;
		}
		
	}
	}
	



