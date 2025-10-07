package moDi.service.impl;

import lombok.RequiredArgsConstructor;
import moDi.model.User;
import moDi.repository.UserRepository;
import moDi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
