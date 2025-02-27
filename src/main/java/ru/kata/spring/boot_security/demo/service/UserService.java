package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    List<User> getAll();
    User getById(Long id);
    void update(User user);
    void delete(Long id);
    Optional<User> findByUsername(String username);
}
