import java.util.Scanner;
public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=  sc.nextInt();
        int temp=n;
        sc.nextLine();
        int rev=0;
        
        while(n!=0){
           int digit = n%10;
          rev= rev*10+digit;
           n=n/10;

        }
        if(temp==rev){
            System.out.println("Number is palindrome");
        }
        else 
            System.out.println("Number is not palindrome");
    }
}

