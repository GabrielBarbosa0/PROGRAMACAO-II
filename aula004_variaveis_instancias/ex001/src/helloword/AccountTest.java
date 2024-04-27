package helloword;
import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {

        String theName;

        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: ", myAccount.getName());
        System.out.println("");

        System.out.println("Please enter the name: ");
        
        theName = input.nextLine();
        myAccount.setName(theName);

        System.out.println();

        System.out.printf("Name in object myAcconunt is: \n%s\n", myAccount.getName());

        input.close();

    }
}
