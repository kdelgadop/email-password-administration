

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email();

        email.setEmail("Kevin", "Delgado");
        email.displaySettings();
        // email.setAltEmail();
        email.changePassword();
        email.displaySettings();
            
        }
    }