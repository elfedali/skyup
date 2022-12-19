package ma.weboven.skyup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserModel {
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // username
    @Column(unique = true, nullable = false)
    private String username;
    // password
    @Column(nullable = false)
    private String password;
    // email
    @Column(unique = true, nullable = false)
    private String email;
    // phone
    @Column(unique = true, nullable = false)
    private String phone;
    // address
    @Column(nullable = false)
    private String address;
    // city
    @Column(nullable = false)
    private String city;
    // state
    @Column(nullable = false)
    private String country;
    // zip code
    @Column(nullable = true, name = "zip_code")
    private String zipCode;
    // first name
    @Column(nullable = false, name = "first_name")
    private String firstName;
    // last name
    @Column(nullable = false, name = "last_name")
    private String lastName;


}
