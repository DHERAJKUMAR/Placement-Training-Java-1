//java placement day 2
//swapping of 2 var by add and sub

public class Main {
    public static void main(String[] args) {
        int a=20, b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
//swapping using mul and div
public class Main {
    public static void main(String[] args) {
        int a=20, b=10;
        a=a*b; //200
        b=a/b; //10
        a=a/b; //20
        System.out.println(a+" "+b);
    }
}

//swapping using ex or gate
public class Main {
    public static void main(String[] args) {
        int a=20, b=10;
        a=a^b; //15
        b=a^b; //10
        a=a^b; //5
        System.out.println(a+" "+b);
    }
}

//Runtime input
Scanner class
creating object    Classname object = new Classname();
import java.util.Scanner is a file containing a nested file as only scanner
import java.util* conatain all java file //
example program using swap using runtime
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A value: ");
       int a= sc.nextInt();
       System.out.println("Enetr B value: ");
       int b=sc.nextInt();
       System.out.println("A = "+a+" B = "+b);
    }
}
OUTPUT:
 

INPUT DATATYPES
nextInt()
nextByte()
nextShort()
nextFloat()
nextLong()
nextDouble()
nextBoolean()
for sting the input type is
String str = sc.next(); //This accepts only first word and its terminator line space
String str=sc.nextLine()  -> terminator line is enter
//Index reference of user input
char str= scan.next().charAt(0);

java program
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char c = sc.next().charAt(3);
       System.out.println(c);

    }
}
 
//Program 2
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       sc.nextLine();
       String c = sc.nextLine();
       System.out.println(a+" "+c);

    }
}

Conditional STATEMENTS
IF, IF ELSE, IF ELSE IF, SWITCH, NESTED IF
If statement
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       if(a%2==0) {
           System.out.println("Even");
       } if(a%2!=0) {
           System.out.println("Odd");
       }

    }
}
Output;
 

If else
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       if(a%2==0) {
           System.out.println("Even");
       } else {
           System.out.println("Odd");
       }

    }
}

 If else if statement
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b && a>c) {
           System.out.println(a);
       } else if(b>c) {
           System.out.println(b);
       } else {
           System.out.println(c);
       }

    }
}
Nested if statement
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       if(a%2==0) {
           if(a%3==0) {
               System.out.println("Divisible by 2 and 3");
           } else{
               System.out.println("Divisible only by 2");
           }
       } 
    }
}
 
Switch Statements
Condition:
•	case value should contain only integers and not float or decimals.
•	case value does not be duplicate. 
Java program to calculate garde:
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int a = sc.nextInt();
        
        
        if ((a>90) && (a<=100)) 
                System.out.println("O Grade");
               
        else if ((a>80) && (a<=90))
                System.out.println("A grade");
                
         else if ((a>70) && (a<=80)):
                System.out.println("B Grade");
                
          else if ((a>60) && (a<=70))
                System.out.println("C Grade");
                
           else if ((a>50) && (a<=60)):
                System.out.println("D Grade");
                
            else if ((a<50) && (a>0))
            System.out.println("fail");
            else 
             System.out.println(“INVALID INPUT”);
            
        }
    }
}
Program to check leap year or not
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a%4==0 && a%100!=0) || (a%400 == 0)) 
        System.out.println("Leap year");
        else 
        System.out.println("Not Leap year");
    }
}

Format specifier for float
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = 56.789f;
        System.out.printf("%.2f", f);
    }
}

Some built in functions 
Math.abs(-2) -> 2
Math.max(12,22) -> 22
Math.min(12,22) -> 12
Math.pow(2,5) -> 2^5 ->32
Typecasting : Math.pow((int)(2.0,5.0)) -> 32.0(no) 32(right)
Math.sqrt(4) -> 2
Math.cbrt(27.0) -> 3.0
Math.ceil(4.5) -> 5
Math.floor(4.5) -> 4
Math.round(float) -> int
Math.round(double) -> long

LOOPING STAEMENTS



