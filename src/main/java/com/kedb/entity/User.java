package com.kedb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="role")
    private String role;

    @Column(name ="mobile")
    private String mobile;

    @Column(name ="email")
    private String email;

    @Column(name ="username")
    private String username;

    @JsonIgnore
    private String password;


}
