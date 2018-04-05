package github;
import java.util.Scanner;
public class OdEven {
	public static void main(String[] args) {
	int y;
	System.out.println("enter the number to be checked");
	Scanner b=new Scanner(System.in);
	y=b.nextInt();
	if(y%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	b.close();
	
	}

}
