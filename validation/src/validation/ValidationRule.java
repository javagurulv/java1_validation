package validation;

import java.util.List;

public interface ValidationRule {

    List<ValidationError> validate(UserRegistrationData data);

}
