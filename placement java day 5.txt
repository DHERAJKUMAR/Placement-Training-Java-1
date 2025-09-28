//A
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int oddsum=0; evensum=0;
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		    if(arr[i]%2==0) {
		        evensum += arr[i];
		    } else {
		        oddsum += arr[i];
		    }
		}
		System.out.println(oddsum>evensum?oddsum+evensum:evensum-oddsum);
	}
}


//Array Operations:
//Array insertion
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[size+1];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		if(pos<=0 || pos > size-1) {
		    System.out.println("Invalid");
		}  else {
		    System.out.println("Enetr the element you want to insert: ");
		    int ele = sc.nextInt();
		    for(int i = size: i > pos ; i--) {
		        arr[i] = arr[i-1];
		        
		    }
		    arr[pos] = ele;
		   } 
		   
		    for(int x : arr) {
		        System.out.println(x+" ");
		}
	}
}


//Array deletion
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[size+1];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		
		if(pos<0 || pos > size) {
		    System.out.println("Invalid");
		}  else {
		    
		    for(int i = pos; i < size-1 ; i++) {
		        arr[i] = arr[i+1];
		        
		    }
		    
		   } 
		   
		    for(int i=0; i<size-1; i++) {
		        System.out.println(arr[i]+" ");
		}
	}
}

//swapping with adjacent number
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		} 
		for(int i=0; i<size-1; i=i+2) {
		     int temp = arr[i];
		     arr[i] = arr[i+1];
		     arr[i+1] = temp;
	     }
	    for(int x:arr) {
	        System.out.print(x+" ");
	    } 
	}
}

//swapping the odd and even numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		} 
		for(int i=0;i<size-2; i=i+4) {
		    int temp = arr[i];
		    arr[i]=arr[i+2];
		    arr[i+2]= temp;
		} 
		for(int i=1;i<size-2; i=i+4) {
		    int temp = arr[i];
		    arr[i]=arr[i+2];
		    arr[i+2]= temp;
		}
		for(int x:arr) {
		    System.out.print(x+" ");
		}
	}
}


INBUILT METHODS IN Array
1. arr.length -> calculate the length of the array
2. Arrays.toString(array_name) -> converts the array to string & used for without for loop
3. Arrays.copyof(arr_name,arr_length) -> copies one array to another
4. Arrays.copyofRange(arr_name,1,4) -> copies the value only from start to end (1 to 4)
5. Arrays.equals(arr1,arr2) -> if this is not given, it checks only address of the array in Arrays and Strings (i.e., always shows false)
6. Arrays.fill(a,7) -> {7,7,7,7,7} if as size mentioned (i.e., int[5] a;)


TWO DIMENSIONAL ARRAY
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
		int rsize = sc.nextInt();
		int csize = sc.nextInt();
		int arr[][] = new int[rsize][csize];
		
		for(int i=0; i<size; i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		for(int i=0;i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.println(arr[i][j]+" ");
			}
		} 
		
	}
}

//program to count only corner elements in array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
		int rsize = sc.nextInt();
		int csize = sc.nextInt();
		int arr[][] = new int[rsize][csize];
		int sum =0;
		
		for(int i=0; i<rsize; i++) {
			for(int j=0;j<csize;j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		for(int i=0; i<rsize ;i++) {
			for(int j=0; j<csize ; j++) {
				if (i==0 || j==0 || i == rsize-1 || j==csize-1 ) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}

output:
4
4
12 13 14 15
16 17 18 19 
20 21 22 23
24 25 26 27
234







//program to find max element in row total and coloumn total
package rockpaperscissor; 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
		int rsize = sc.nextInt();
		int csize = sc.nextInt();
		int arr[][] = new int[rsize][csize];
		
		for(int i=0; i<rsize; i++) {
			for(int j=0;j<csize;j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		int rmax = Integer.MIN_VALUE, cmax = Integer.MIN_VALUE;
		int row, col;
		for(int i=0; i<rsize ;i++) {
			row = 0;
			col = 0;
			for(int j=0;j<csize;j++) {
				row += arr[i][j];
				col += arr[j][i];
			}
			if(row>rmax ) {
				rmax = row;
				
			}
			if(col>cmax) {
				cmax = col;
			}
		}
		
		System.out.println(cmax+" "+rmax);
	}
}