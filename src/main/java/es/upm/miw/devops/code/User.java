package es.upm.miw.devops.code;

import java.util.Objects;

public class User {
    private final String id;
    private final String name;
    private final String familyName;

    public User(String id, String name, String familyName) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return ("" + this.name.charAt(0) + this.familyName.charAt(0)).toUpperCase();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj instanceof User other && Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
