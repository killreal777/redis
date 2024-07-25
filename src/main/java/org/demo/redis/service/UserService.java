package org.demo.redis.service;

import lombok.RequiredArgsConstructor;
import org.demo.redis.model.User;
import org.demo.redis.repositroy.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Cacheable(value = "users", key = "#id")
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
