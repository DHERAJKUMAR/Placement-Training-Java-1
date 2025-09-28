#include <stdio.h>

int main() {
    int n, i;
    int flag = 0; // Initialize flag to 0 (assuming prime)

    printf("Enter a positive integer: ");
    scanf("%d", &n);

    // Handle special cases: 0 and 1 are not prime
    // This can be done without an 'if' for the final output, but requires a check here
    if (n <= 1) {
        flag = 1; // Set flag to 1 (not prime) for numbers <= 1
    } else {
        // Loop from 2 up to n/2 (or sqrt(n) for optimization)
        for (i = 2; i <= n / 2; ++i) {
            // If n is divisible by i, it's not prime
            if (n % i == 0) {
                flag = 1; // Set flag to 1 (not prime)
                break;    // No need to check further, it's not prime
            }
        }
    }

// program to check pallindrome

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int orgno = n;
		int rev = 0, rem;
		while(i<=n) {
		    rem = n % 10;
		    rev = rev *10 + rem;
		    n = n/10;
		    
		} if(orgno == rev) {
		    System.out.println("pallindrome");
		} else {
		    System.out.println("not a pallindrome");
		}
	}
}

//program to calculate number of words 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		while(n>0) {
		    n = n/10;
		    count++;
		}
		System.out.println(count);
	}	
}

    // Determine and print the result based on the final value of 'flag'
    // This avoids an explicit 'if (isPrime)' check in the output logic
    (flag == 0) ? printf("%d is a prime number.\n", n) : printf("%d is not a prime number.\n", n);

    return 0;
}
//Armstrong Check
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orgno=n;
		int count=0, dig=0;
		while(n>0) {
		    n = n/10;
		    count++;
		}
		orgno=n;
		while(n>0) {
		    int rem = n%10;
		    dig = dig + (int)Math.pow(rem,count);
		    n = n/10;
		}
		if(orgno==dig) {
		    System.out.println("Armstrong");
		} else {
		    System.out.println("not an Armstrong ");
		}
	}
}
//program to remove a particular number 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int ans =0;
		int c =0;
		while(n>0) {
		    int r = n%10;
		    if(s!=r) {
		        c++;
		        ans = r*(int)Math.pow(10,c-1)+ans;
		    }
		    n=n/10;
		}
		System.out.println(ans);
	}
}

perfect number: sum of the divisors is equal to the number
eg. 6=1+2+3

