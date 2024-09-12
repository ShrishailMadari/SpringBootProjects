package com.shyloostyle.dtodemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String email;
    private String  firstName;
    private String lastName;
    private long password;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Location_id")
    private Location location;
}
