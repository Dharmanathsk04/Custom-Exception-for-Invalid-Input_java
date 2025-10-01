import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}


public interface CustomExceptionDemo {
    
static void registerUser(int age) throws InvalidAgeException {

    if(age < 18) {

        throw new InvalidAgeException("❌ age must be 18 or above to register.");
    }

    else {

        System.out.println("✅ Registration successful ! Welcome to the system");

    }
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    try {


        System.out.print("Enter your age for registration");
        int age = sc.nextInt();

        registerUser(age);
    }

    catch (InvalidAgeException e) {

        System.out.println("Exception Caught: "+e.getMessage());

    }

    catch(Exception e) {

        System.out.println("Unexpected Error: "+e);
    }

    finally {

        System.out.println("🎯 Program finished.");
        sc.close();
    }
}


}
