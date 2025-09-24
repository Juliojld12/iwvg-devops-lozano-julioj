package es.upm.miw.devops.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class UsersDatabase {

    private final List<User> users;

    public UsersDatabase() {
        this.users = new ArrayList<>(List.of(
                new User("1", "Ada", "Lovelace"),
                new User("2", "Alan", "Turing"),
                new User("3", "Grace", "Hopper"),
                new User("4", "Linus", "Torvalds"),
                new User("5", "Dennis", "Ritchie")
        ));
    }

    public List<User> getUsers() {
        return new ArrayList<>(this.users); // Evita modificación externa
    }

    public Optional<User> findUserById(String id) {
        return this.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
    public Fraction findFractionAdditionByUserId(String id) {
        return this.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + id))
                .getFractions().stream()
                .reduce(new Fraction(0, 1), Fraction::add);
    }
    public Fraction findFractionDivisionByUserId(String id) {
        return this.findUserById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + id))
                .getFractions().stream()
                .reduce((a, b) -> a.divide(b))
                .orElse(new Fraction(1, 1)); // Si no hay fracciones
    }

    public Stream<User> stream() {
        return this.users.stream();
    }
}
