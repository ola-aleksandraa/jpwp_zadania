
/*
    ZADANIE 3
    Podziel klasę na dwie: jedna powinna odpowiadać za zarządzanie użytkownikami, druga za logowanie.
    Każda klasa powinna mieć tylko jedną odpowiedzialność.
 */

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<String> users = new ArrayList<>();

    public void addUser(String username) {
        users.add(username);
    }

    public void removeUser(String username) {
        users.remove(username);
    }

    public List<String> getUsers() {
        return new ArrayList<>(users);
    }
}

