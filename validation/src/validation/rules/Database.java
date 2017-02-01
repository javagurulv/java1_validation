package validation.rules;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> existingLogins = new ArrayList<String>();

    public Database(String ... existingLogins) {
        for (String login : existingLogins) {
            this.existingLogins.add(login);
        }
    }

    public boolean loginExist(final String login) {
        return existingLogins.stream()
                    .filter(l -> l.equals(login))
                    .findAny().isPresent();
    }

}
