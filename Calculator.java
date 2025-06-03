import java.util.Scanner;
public class Calculator{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println(".......Calculator....");
    System.out.print("Enter number1:");
    double num1=input.nextDouble();
    System.out.print("Enter number2:");
    double num2=input.nextDouble();
    System.out.print("Enter a operator(+,-,*,/):");
    char optr=input.next().charAt(0);
    double result=0;
    switch(optr){
      case '+':
        result=num1+num2;
        break;
      case '-':
        result=num1-num2;
        break;
      case '*':
        result=num1*num2;
        break;
      case '/':
        result=num1/num2;
        break;
      default :
        System.out.println("Invaild operator");
        break;
      }
    System.out.println("The result:"+result);
    input.close();
  }
}