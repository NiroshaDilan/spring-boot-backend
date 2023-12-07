package lk.icoder.springbootbackend.service;

import lk.icoder.springbootbackend.dto.UserDto;
import org.apache.juli.logging.Log;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long userId);
}
