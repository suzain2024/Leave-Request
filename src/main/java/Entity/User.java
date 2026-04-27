/**
 * 
 */
package Entity;

import com.example.leave.request.enums.Role;
import jakarta.persistence.*;

/**
 * 
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String name;
String password;
@Column(unique = true)
String email;
@ManyToOne
private Department department;//reference
@ManyToOne
private User manager;//reference
private Role role;
}
