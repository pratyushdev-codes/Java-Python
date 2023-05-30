import java.util.*;

public class ex {
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
System.out.println("Enter the first number:");
int a = sc.nextInt();



System.out.println("Enter the second number:");
int b =sc.nextInt();


int sum= a+b;
    
 System.out.println("The sum of the numbers is:"+ sum);
}


}

----------
void printNumbers(int n) {
    if (n > 100) return;
    System.out.println(n);
    printNumbers(n+1);
 }
 