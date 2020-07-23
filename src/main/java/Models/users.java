package Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {

    @Id
    long id;

    String email;
    String firstName;
    String lastName;
    String password;
    String role;

}
