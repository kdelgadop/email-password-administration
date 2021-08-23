import java.util.Random;
import java.util.Scanner;

public class Email {

    private String name;
    private String lastName;
    private String emailAdress;
    private String password;
    private String dept;
    private int mailboxCapacity = 1000;
    private String altEmail;
    private String company = "Company";

    //EMAIL GENERATOR---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void setEmail(String name, String lastName) {
        System.out.println("");
        System.out.println("");

        this.name = name;
        this.lastName = lastName;
    //Getting the Department---------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("What's your department: ");
        System.out.println("1: Marketing");
        System.out.println("2: Sales");
        System.out.println("3: Dev ");
        System.out.println("4: Other");

        for (int c = 0; c < 10; c++) {
            Scanner depart = new Scanner(System.in);
            int department = depart.nextInt();
            if(department == 1) {
                this.dept = "Marketing";
                System.out.println("");
                System.out.println("Department: Markteting");
                System.out.println("");
                String newEmail = name + "." + lastName + "@" + dept + "." + company + ".com";
                this.emailAdress = newEmail.toLowerCase();
                System.out.println("Your new email is:");
                System.out.println(this.emailAdress);
                // depart.close();
                this.setPassword();
                return;
            }
            else if(department == 2) {
                this.dept = "Sales";
                System.out.println("");
                System.out.println("Department: Sales");
                System.out.println("");
                String newEmail = name + "." + lastName + "@" + dept + "." + company + ".com";
                this.emailAdress = newEmail.toLowerCase();
                System.out.println("Your new email is:");
                System.out.println(this.emailAdress);
                // depart.close();
                this.setPassword();
                return;
            }
            else if(department == 3) {
                this.dept = "Dev";
                System.out.println("");
                System.out.println("Department: Software Developement");
                System.out.println("");  
                String newEmail = name + "." + lastName + "@" + dept + "." + company + ".com";
                this.emailAdress = newEmail.toLowerCase();
                System.out.println("Your new email is:");
                System.out.println(this.emailAdress);
                // depart.close();
                this.setPassword();
                return;
            }
            else if(department == 4) {
                System.out.println("");
                this.dept = "other";
                String newEmail = name + "." + lastName + "@" + dept + "." + company + ".com";
                this.emailAdress = newEmail.toLowerCase();
                System.out.println("Your new email is:");
                System.out.println(this.emailAdress);
                System.out.println("");
                // depart.close();
                this.setPassword();
                return;
            }
            else {
                System.out.println("Please enter a number from 1 to 4 to select your department.");
                }
            }
        System.out.println("Please try again later.");
        return;
    }

    //PASSWORD GENERATOR---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    protected void setPassword() {

        int passwordLimit = 7;
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")"};
        String[] passWordArray = new String[7];
        passWordArray = new String[passwordLimit];

        for(int i = 0; i < (passwordLimit); i++) {
            Random random = new Random();
            int x = random.nextInt(characters.length);
            
            passWordArray[i] = characters[x]; 
        }
        this.password = String.join("", passWordArray[0], passWordArray[1], passWordArray[2], passWordArray[3], passWordArray[4], passWordArray[5], passWordArray[6]);
        System.out.println("Your Password is: " + this.password);
    }

    //PASSWORD CHANGER---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   protected void changePassword() {

        Scanner keyboard = new Scanner(System.in);
        // Where you enter your old password. *****
        System.out.println("Please enter your old password: ");
        for (int i = 0; i <= 4; i++) {
            String passwordEntry = keyboard.nextLine();
        //When you enter the new password with a number and at least 7 characters long. *****
            if (passwordEntry.equals(this.password)) {
                for (int j = 0; j <= 10; j++) {
                    System.out.println("Please enter your new password:");
                    String newPassword = keyboard.nextLine();
                    int passwordLenght = newPassword.length();
                        if (passwordLenght >= 7) {
                            char[] chars = newPassword.toCharArray();
                            for (char c : chars) {
                                if (Character.isDigit(c)) {
                                    char[] chars2 = newPassword.toCharArray();
                                        for (char c2 : chars2) {
                                            if(Character.isUpperCase(c2)) {
                                                this.password = newPassword;
                                                System.out.println("Your new password is: " + this.password);
                                                keyboard.close();
                                                return;
                                        }
                                    }
                                }
                            }
                                System.out.println("The password should be at least 7 characters long, contain a number and a capital letter.");
                            }
                            
                        else {
                            System.out.println("The password should be at least 7 characters long, contain a number and a capital letter.");
                            }
            }
            keyboard.close();
            System.out.println("Your password remains unchanged. Please try again.");
            return;
        }
        else { 
            System.out.println("Wrong password.");
            }
    }
      System.out.println("Entered Incorrect Password too many times.");
      keyboard.close();
    }

    //SET ALT EMAIL ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void setAltEmail() {
        System.out.println("");
        System.out.println("");
        System.out.println("Please, enter your alt email bellow:");
        Scanner keyboard = new Scanner(System.in);
        this.altEmail = keyboard.nextLine();

        System.out.println("Your alt email is: " + this.altEmail);
        keyboard.close();
    }

    // DISPLAY ALL SETTINGS (Getter)---------------------------------------------------------
    public void displaySettings() {
        System.out.println("");
        System.out.println("");
        System.out.println("Account Email: " + this.emailAdress);
        System.out.println("Account password: " + this.password);
        System.out.println("User's name: " + this.name + " " + this.lastName);
        System.out.println("User's department: " + this.dept);
        System.out.println("Email's mailbox Capacity: " + this.mailboxCapacity);
    }

}
