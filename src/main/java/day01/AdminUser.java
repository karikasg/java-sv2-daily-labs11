package day01;

public class AdminUser implements User{
    private String email;
    private String password;

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
//        StringBuilder pw = new StringBuilder();
//        for (int i = 0; i < password.length(); i++){
//            pw.append("*");
//        }
        String st = new String();
        st = "*".repeat(password.length());
//        return pw.toString();
        return st;
    }
}
