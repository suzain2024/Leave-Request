/**
 * 
 */
package Entity;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
String id;
String name;
String password;
String email;
@ManyToOne
private Department department;
@ManyToOne
private User manager;
String role;
}
