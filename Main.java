
import java.util.Scanner;
public class Main {

public static int methodDecrease(int number){
if (number<=0)
	return number; //if entered number is negative, returns number
else 
	System.out.print(number + " "); //if entered number is positive, substract 5 until the number is zero
		return methodDecrease(number-5);
		}
public static int methodIncrease(int number,int n){
if(number<=n) {     //when the number is zero or negative, add 5 until the number equal to entered number
	System.out.print(number + " ");
	return methodIncrease(number+5,n);
	}
	else {
		return number;
}
 
}
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("N sayısı : ");
int number=input.nextInt();
System.out.print("Çıktısı: ");
 methodIncrease(methodDecrease(number),number);  //recursive call
}
}