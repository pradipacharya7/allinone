package com.allinone.practice.model;

import javax.persistence.*;

@Entity
@Table()
public class Authorities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String authority;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Authorities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
