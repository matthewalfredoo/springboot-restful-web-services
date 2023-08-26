package com.example.springboot.service.impl;

import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.User;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor // constructor-based dependency injection, similar to @Autowired but more explicit
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        // convert UserDto into User JPA Entity
        User user = new User(
                userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail()
        );

        User savedUser = userRepository.save(user);

        // convert User JPA Entity into UserDto
        UserDto savedUserDto = new UserDto(
                savedUser.getId(), savedUser.getFirstName(), savedUser.getLastName(), savedUser.getEmail()
        );

        return savedUserDto;
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
