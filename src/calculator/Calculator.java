
package calculator;

import java.util.Scanner;


public class Calculator {

    
    public static void main(String[] args) {
         int a,b,c,selection;
    
       System.out.println("Enter number 1:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter number 2:");
        b=sc.nextInt();
    System.out.println("choose the number of operation which you want to perform");
  System.out.println("1.ADDITION");
  System.out.println("2.SUBTRACTION");
  selection=sc.nextInt();
  
   
  Operations obj=new Operations();
    
     
    
        if (selection==1)
        {
        c=obj.add(a,b);
       System.out.println("your answer is:"+c);
        }
        else if(selection==2){
        c=obj.sub(a,b);
       System.out.println("your answer is:"+c);
        }  
        else{
        System.out.println("invalid input");
        }
    }
    
}
