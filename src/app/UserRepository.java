package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public Optional<User> findUserById(int id) {
        Optional<User> userById = users.stream().filter(user -> user.id == id).findFirst();
        return userById;
    }

    public Optional<User> findUserByEmail(String email) {
        Optional<User> userByEmail = users.stream().filter(user -> user.email.equals(email)).findFirst();
        return userByEmail;
    }

    public Optional<List<User>> findAllUsers() {
        Optional<List<User>> allUsers = Optional.of(users);
        return allUsers;
    }
}
