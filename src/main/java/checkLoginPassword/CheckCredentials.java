package checkLoginPassword;

public class CheckCredentials {

    static boolean checkCredentials(String login, String password, String confirmPassword){

        boolean valid = true;
        try{
            if(!login.matches("\\w+")){
                valid = false;
                throw new WrongLoginException("Invalid login. Login must contain only latin letters, numbers, underscore.");
            }
            if(login.length() > 20){
                valid = false;
                throw new WrongLoginException("Invalid login. Login can be no more than 20 characters.");
            }
        }catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }

        try{
            if(!password.matches("\\w+")){
                valid = false;
                throw new WrongPasswordException("Invalid password. Password must contain only latin letters, numbers, underscore.");
            }
            if(password.length() > 20){
                valid = false;
                throw new WrongPasswordException("Invalid password. Password can be no more than 20 characters.");
            }
            if(!password.equals(confirmPassword)){
                valid = false;
                throw new WrongPasswordException("Invalid confirm password. Confirm password must have an equal password.");
            }
        }catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }

        return valid;
    }
}
