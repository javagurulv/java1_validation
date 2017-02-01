package validation.rules;

import org.junit.Test;
import validation.UserRegistrationData;
import validation.ValidationError;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LoginAreUniqueValidationRuleTest {

    @Test
    public void shouldReturnErrorWhenLoginAlreadyExist() {
        Database db = new Database("a");
        LoginAreUniqueValidationRule rule =
                new LoginAreUniqueValidationRule(db);

        List<ValidationError> errors = rule.validate(
          new UserRegistrationData("a", null, null)
        );

        assertThat(errors.size(), is(1));
        assertThat(errors.get(0).getField(), is("login"));
        assertThat(errors.get(0).getErrorMessage(), is("Login already exist"));
    }

    @Test
    public void shouldReturnNoErrorsWhenLoginNotExistInDB() {
        Database db = new Database("a");
        LoginAreUniqueValidationRule rule =
                new LoginAreUniqueValidationRule(db);

        List<ValidationError> errors = rule.validate(
                new UserRegistrationData("b", null, null)
        );

        assertThat(errors.size(), is(0));
    }

}
