
import java.util.Scanner ;

public class Email {
public static void main(String[] args) {
    	
        Scanner kb = new Scanner(System.in);

        System.out.println("Your Email ID and Password");

        System.out.println("\nHere the syntax of Email ID:");
        System.out.println("\nfirstNamelastName@department.company.com");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. HumanResource");
        System.out.println("4. Legal");

        System.out.print("\nWhat is your Department?: ");
        int choice = kb.nextInt();
        System.out.println();


        if (choice == 1){
            Technical();
        }
        else if (choice == 2){
            Admin();
        }
        else if (choice == 3){
            HumanResource();
        }
        else if (choice == 4){
            Leagal();
        }

        System.out.println();
        kb.close();
    }

    public static void Technical(){
    	String nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Technical");

        System.out.print("\nFirst Name: ");
        nOne = kb.next();

        System.out.print("\nSecond Name: ");
        nTwo = kb.next();

        kb.close();
        System.out.println("Dear "+ nOne + " your generated credentials are as follows");
        String s1 = (nOne + nTwo + "@tech.abc.com");
        System.out.println(s1);
        System.out.println("Password is ----> " + Main.sb());
    }

   

	public static void Admin(){
		String nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Admin");

        System.out.print("\nFirst Name: ");
        nOne = kb.next();

        System.out.print("\nSecond Name: ");
        nTwo = kb.next();

        kb.close();
        System.out.println("Dear "+ nOne + " your generated credentials are as follows");
        String s1 = (nOne + nTwo + "@admin.abc.com");
        System.out.println(s1);
        System.out.println("Password is ----> " + Main.sb());

            }        
        
    

    public static void HumanResource(){
    	String nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("HumanResource");

        System.out.print("\nFirst Name: ");
        nOne = kb.next();

        System.out.print("\nSecond Name: ");
        nTwo = kb.next();

        kb.close();
        System.out.println("Dear "+ nOne + " your generated credentials are as follows");
        String s1 = (nOne + nTwo + "@hr.abc.com");
        System.out.println(s1);
        System.out.println("Password is ----> " + Main.sb());
    }

    public static void Leagal(){
    	String nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Leagal");

        System.out.print("\nFirst Name: ");
        nOne = kb.next();

        System.out.print("\nSecond Name: ");
        nTwo = kb.next();

        kb.close();
        System.out.println("Dear "+ nOne + " your generated credentials are as follows");
        String s1 = (nOne + nTwo + "@leagal.abc.com");
        System.out.println(s1);
        System.out.println("Password is ----> " + Main.sb());
    }
}

