package day01;

public class NormalUser implements User{
    private String email;
    private String password;

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
