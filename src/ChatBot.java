import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        greetUser();        
        String userName = scanner.nextLine();        
        repeatName(userName);
        guessAge();
        countToUserInput();
        programmingKnowledge();
        scanner.close();
    }

    public static void greetUser()
    {
        System.out.println("~~~ Welcome to the CTAC ChatBot ~~~");
        System.out.println("Please enter your name");
    }

    public static void repeatName(String originalName)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your name again... ");
        String input = scanner.nextLine();        
        if(input.equalsIgnoreCase(originalName))
        {
            System.out.println("Good to meet you " + input);
        }
        else
        {
            System.out.println("Thanks for correcting your name. Good to meet you " + input);
        }
    }

    public static void guessAge()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int year = Integer.valueOf(scanner.nextLine());        
        System.out.println("You are " + (2022 - year) + " years old ...");
    }

    public static void countToUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a favorite number between 1 and 10");
        int number = Integer.valueOf(scanner.nextLine());
        if(number >= 1 && number <= 10 )
        {
            for(int ii=1; ii<= number; ii++)
                System.out.println(ii);
        }
        else
        {
            System.out.println("You entered an unacceptable number");
        }
    }

    public static void programmingKnowledge()
    {
        System.out.println("Lets test your programming skills");
        System.out.println("Which of the following can't be used for loops in Java?");
        System.out.println("A: for" );
        System.out.println("B: do ... while ");
        System.out.println("C: while ");
        System.out.println("D: loop");
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do
        {
            userInput = scanner.nextLine();
            if(!userInput.equalsIgnoreCase("D"))
            {
                System.out.println("Sorry wrong answer.. please try again");
            }
            else
            {
                System.out.println("You got it.. it was nice chatting with you...");
                break;
            }

        } while(true);
    }
    
}
