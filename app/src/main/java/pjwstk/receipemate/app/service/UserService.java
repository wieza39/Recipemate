package pjwstk.receipemate.app.service;

import org.springframework.stereotype.Service;
import pjwstk.receipemate.app.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
