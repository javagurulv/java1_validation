package validation.rules;

import validation.UserRegistrationData;
import validation.ValidationError;
import validation.ValidationRule;

import java.util.ArrayList;
import java.util.List;

public class LoginAreUniqueValidationRule
        implements ValidationRule {

    private Database database;

    public LoginAreUniqueValidationRule(Database database) {
        this.database = database;
    }

    @Override
    public List<ValidationError> validate(UserRegistrationData data) {

        if (database.loginExist(data.getLogin())) {
            ValidationError error = new ValidationError(
                    "login", "Login already exist"
            );
            List<ValidationError> errors = new ArrayList<ValidationError>();
            errors.add(error);
            return errors;
        }

        return new ArrayList<ValidationError>();
    }

}
