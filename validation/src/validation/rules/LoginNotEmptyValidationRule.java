package validation.rules;

import validation.UserRegistrationData;
import validation.ValidationError;
import validation.ValidationRule;

import java.util.ArrayList;
import java.util.List;

public class LoginNotEmptyValidationRule
        implements ValidationRule {

    @Override
    public List<ValidationError> validate(UserRegistrationData data) {
        if (data.getLogin() == null
                || "".equals(data.getLogin())) {
            ValidationError error = new ValidationError(
                    "login", "Login mus be not empty"
            );
            List<ValidationError> errors = new ArrayList<ValidationError>();
            errors.add(error);
            return errors;
        }

        return new ArrayList<ValidationError>();
    }

}
