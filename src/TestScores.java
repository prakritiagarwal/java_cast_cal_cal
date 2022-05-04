import java.util.Scanner;
public class TestScores{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a value between 0 and 100:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number >= 90 && number <=100) {
            System.out.println("Your grade is an A :)");
    } else if (number >= 80 && number <=89) {
            System.out.println("Your grade is B");
    } else if (number >= 70 && number <=79) {
            System.out.println("Your grade is C");
    } else if (number >= 60 && number <=69) {
            System.out.println("Your grade is D");
    }
        else {
            System.out.println("Your grade is F :(");
    }
    scanner.close();
}

    
}
