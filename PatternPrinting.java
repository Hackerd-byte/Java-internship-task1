import java.util.Scanner;
public class PatternPrinting{
  public static void main(String[] args){
    Scanner ip=new Scanner(System.in);
    System.out.print("Enter the number line Pattern printing:");
    int num=ip.nextInt();
    int i,j;
    for(i=1;i<(num+1);i++){
      for(j=1;j<(i+1);j++){
        System.out.print("*");
      }
      System.out.println();
    }
    ip.close();
  }
  
}