package TandamLoop;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args)
{
	char operator;
	double number1 , number2 , result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose an operator : + , - ,* ,/");
	operator=sc.next().charAt(0);
	System.out.println("enter the value of number1");
	number1=sc.nextDouble();
	System.out.println("enter the value of number2");
	number2=sc.nextDouble();
	switch(operator) {
	case '+' :
		result=number1+number2;
		System.out.println(number1+"+" +number2+"="+result);
		break;
	case '-':
		result=number1-number2;
		System.out.println(number1+"-" +number2+"="+result);
		break;
	case '*' :
		result=number1*number2;
		System.out.println(number1+"*" +number2+"="+result);
		break;
	case '/' :
		result=number1/number2;
		System.out.println(number1+"/" +number2+"="+result);
		break;
	}
}
}
