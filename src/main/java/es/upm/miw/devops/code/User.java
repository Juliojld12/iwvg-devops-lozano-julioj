package es.upm.miw.devops.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private final String id;
    private final String name;
    private final String familyName;
    private final List<Fraction> fractions;

    public User(String id, String name, String familyName) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.fractions = new ArrayList<>();

        if ("1".equals(id)) {
            this.fractions.add(new Fraction(1, 2));
            this.fractions.add(new Fraction(1, 3));
        }
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

    public List<Fraction> getFractions() {
        return this.fractions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", fractions=" + fractions +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return (this.name.charAt(0) + "" + this.familyName.charAt(0)).toUpperCase();
    }
}
