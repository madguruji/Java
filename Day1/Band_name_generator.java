import java.util.Scanner;
public class Band_name_generator
{
	public static void main(String[] args)
	{
		System.out.println("Band name generator");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city name");
		String city=sc.next();
		System.out.println("Enter pet name");
		String pet_name=sc.next();
		System.out.println("Your band name : "+city+" "+pet_name);
	}
}