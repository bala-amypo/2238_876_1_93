@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {}
    public User register(User user) { return user; }
    public User findByEmail(String email) {
        throw new RuntimeException("User not found");
    }
}
