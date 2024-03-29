package by.itclass.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user")//для подключения к базе данных денвер на локалхост
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
