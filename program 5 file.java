//Program to calualate the sum of first and last two digit
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a<999) {
		    System.out.println("Enter a four digit number");
		}  else {
		    int last = a%100;
		    int first = a;
		    while(first>99) {
		        first /=10;
		    }
		    System.out.println(last+first);
		}
	}
}
