package web.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surName;

    public User(){};

    public User(int id,String name,String surName){
        this.id = id;
        this.name = name;
        this.surName = surName;
    }
//    public User(String name,String surName){
//        this.name = name;
//        this.surName = surName;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "UserId " +
                " = " + id +
                "\n name = '" + name + '\'' +
                "\n surName = '" + surName + '\'';
    }
}
