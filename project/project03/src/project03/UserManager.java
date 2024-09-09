package project03;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
	private Map<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void addUser(String username) {
        if (!users.containsKey(username)) {
            User user = new User(username);
            users.put(username, user);
            System.out.println("User " + username + " added.");
        } else {
            System.out.println("User " + username + " already exists.");
        }
    }

    public void removeUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("User " + username + " removed.");
        } else {
            System.out.println("User " + username + " does not exist.");
        }
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
