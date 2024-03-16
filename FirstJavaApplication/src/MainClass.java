import java.util.Scanner;
        
public class MainClass {
    
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
       
        double firstNumber, secondNumber, sum;
        
        System.out.println("Enter first number : ");
        firstNumber = readme.nextDouble();
        
        System.out.println("Enter second number : ");
        secondNumber = readme.nextDouble();
        
        sum = firstNumber + secondNumber;
        
        System.out.println("The sum is = " + sum);
    }
    
}
