package demo;

/**
 * Created by chitboon on 12/3/15.
 */
public class UserDAO {
    public User getUser(String id, String password) {
        if (id != null && id.equals(password)) {
            User u = new User();
            u.setId(id);
            u.setPassword(password);
            u.setName("User "+ id);
            return u;
        }
        return null;
    }
}
