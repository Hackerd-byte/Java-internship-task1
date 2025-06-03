import java.util.Scanner;
public class PrimeNumber{
  public static void main(String[] args){
    Scanner ip=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=ip.nextInt();
    int i,temp=0;
    if(num<=1){
      temp=temp+1;
    }
    else{
      for(i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
          temp=temp+1;
          break;
        }
      }
    }
    if(temp==0){
      System.out.println("The given number is Prime number");
    }
    else{
      System.out.println("The given number is not Prime number");
    }
  }
}
