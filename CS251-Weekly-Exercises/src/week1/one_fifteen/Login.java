package week1.one_fifteen;

public class Login {

    public void isValidLogin(String username, String password){

        if (username.equals("brian") && password.equals("spam")){
            System.out.println("Correct details, login successful");
        }else {
            System.out.println("Invalid");
        }
    }
}
