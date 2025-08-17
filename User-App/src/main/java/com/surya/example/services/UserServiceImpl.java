package com.surya.example.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.surya.example.entities.User;
import com.surya.example.ex.USER_NOT_FOUND_EXCEPTON;
import com.surya.example.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        try {
            User existedUser = userRepository.save(user);
            log.warn("after saving to db {}", user.getName());
            log.warn("after saving to db {}", user.getEmail());
            return existedUser;
        } catch (Exception e) {
            log.error("Exception occurred {}", e.getMessage());
            throw new RuntimeException("User with that id Not Present! " + e.getMessage());
        }
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new USER_NOT_FOUND_EXCEPTON("User with that id Not Present! " + id)
        );
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAllUserPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserById(Long id, User user) {
        User existedUser = userRepository.findById(id)
                .orElseThrow(() -> new USER_NOT_FOUND_EXCEPTON("User with that id Not Present! " + id));
        existedUser.setName(user.getName());
        existedUser.setEmail(user.getEmail());
        return userRepository.save(existedUser);
    }

    @Override
    public User patchUpdateUserById(Long id, User user) {
        User existedUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with that id Not Present! " + id));

        if (user.getName() != null) {
            existedUser.setName(user.getName());
        }
        if (user.getEmail() != null) {
            existedUser.setEmail(user.getEmail());
        }
        return userRepository.save(existedUser);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userRepository.findByNameIgnoreCase(name);
    }
}
