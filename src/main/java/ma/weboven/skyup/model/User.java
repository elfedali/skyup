package ma.weboven.skyup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // username
    @Column(unique = true, nullable = false)
    private String username;
    // email
    @Column(unique = true, nullable = false)
    private String email;

    @NotEmpty(message = "Please provide your password")
    @Column(nullable = false)
    private String password;

    // TODO:: more fields yet to be added

}
