import java.util.Scanner;
public class NumberComparison {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

System.out.println("Enter a number:");
int numOne = Integer.valueOf(scanner.nextLine());
System.out.println("Enter another number:");
int numTwo = Integer.valueOf(scanner.nextLine());
if (numOne == numTwo) {
    System.out.println("Numbers are the same");
} else if (numOne>numTwo) {
    System.out.println("The first number was larger than the second");
} else if (numOne<numTwo) {
    System.out.println("The second number was larger than the first");
} 
scanner.close();
    }
}    