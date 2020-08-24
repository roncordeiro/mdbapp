package io.todo.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class User extends PanacheEntity {
    public String username;
    public String password;
    public String firstName;
    public String lastName;
    public Date nasc;
    public String nuEleitor;
    public String nuZona;
    public String nuSecao;

    public static User findByUsernameAndPassword(String username, String password) {
        return find("username = ?1 and password = ?2", username, password).firstResult();
    }
    public static User findByUsername(String username) {
        return find("username = ?1", username).firstResult();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nasc='" + nasc + '\'' +
                ", nuEleitor='" + nuEleitor + '\'' +
                ", nuZona='" + nuZona + '\'' +
                ", nuSecao='" + nuSecao + '\'' +
                '}';
    }
}