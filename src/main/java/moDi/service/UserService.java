package moDi.service;

import moDi.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User create(User user);
}
