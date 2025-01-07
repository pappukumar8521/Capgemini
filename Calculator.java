import java.util.*;
public class Calculator{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in) ;
        System.out.println("enetr the value of a");
        int a = sc.nextInt();
        System.out.println("enetr the value of b");
        int b=sc.nextInt();
        System.out.println("enetr the opration");
        char oprator=sc.next().charAt(0);
        switch(oprator){
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;    
            case '*' : System.out.println(a*b);
                       break;    
            case '/' : System.out.println(a/b);
                       break;   
            case '%' : System.out.println(a%b);
                       break;  
            default: System.out.println("wrong opretor");                               
        }
    }

}