package app;

import java.util.Collections;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        userRepository.addUser(new User(1, "Mark", "mark@gmail.com"));
        userRepository.addUser(new User(2, "Bob", "bob@gmail.com"));
        userRepository.addUser(new User(3, "Michael", "michael@example.com"));
        userRepository.addUser(new User(4, "Roger", "roger@gmail.com"));
        userRepository.addUser(new User(5, "David", "david@gmail.com"));

        int searchId = 3;
        Optional<User> userById = userRepository.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("User found: " + user),
                () -> System.out.println("User by id: " + searchId + " didn't found.")
        );

        String searchEmail = "david@gmail.com";
        Optional<User> userByEmail = userRepository.findUserByEmail(searchEmail);
        userByEmail.ifPresentOrElse(
                user -> System.out.println("User found: " + user),
                () -> System.out.println("User by email " + searchEmail + " didn't found.")
        );
        System.out.println("All users: " + userRepository.findAllUsers() + "\n" + " User count: " + userRepository.findAllUsers().orElse(Collections.emptyList()).size());    }
}