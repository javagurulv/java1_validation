package validation;

public class UserRegistrationData {

    private String login;
    private String password;
    private String confirmedPassword;

    public UserRegistrationData(String login,
                                String password,
                                String confirmedPassword) {
        this.login = login;
        this.password = password;
        this.confirmedPassword = confirmedPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }
}
