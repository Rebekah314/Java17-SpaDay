package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    private static final Map<Integer, User> users = new HashMap<>();

    //static methods (no instances required)

    //add a user:
    public static void add(User user) {
        users.put(user.getId(), user);
    }

    //get a single user by Id:
    public static User getById(int id) {
        return users.get(id);
    }

    //get all users:
    public static Collection<User> getAll() {
        return users.values();
    }

    //remove a user:
    public static void remove(int id) {
        users.remove(id);
    }


}
