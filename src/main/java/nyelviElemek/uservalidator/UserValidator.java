package nyelviElemek.uservalidator;

public class UserValidator {
   /* String username;
    String password1;
    String PassWord2;
    String email;*/
    String errorMessage ="Please give valid data";

    public boolean isValidUserName(String username){
        if (username.length()!=0){
            System.out.println("Name OK");
            return true;
        }
        System.out.println("Name not OK");
        return false;
    }

    public boolean isValidPassword(String password1, String password2){
        if(password1.length()>=8 && password1.equals(password2)){
            System.out.println("Password OK");
            return true;
        }
        System.out.println("Password not OK");
        return false;
    }

    public boolean isValidEmail(String email){
        if(email.indexOf("@")!=-1 && email.indexOf("@")!=0 && email.indexOf(".")!=email.indexOf("@")+1 && email.indexOf(".")!=email.length()-1){
            System.out.println("Email OK");
            return true;
        }
        System.out.println("Email not OK");
        return false;
    }

    public void messageForUser(String name, String password, String email){
        if (this.isValidUserName(name)==true) {
             System.out.println("Name OK");
        } else System.out.println(errorMessage);

    }
}
