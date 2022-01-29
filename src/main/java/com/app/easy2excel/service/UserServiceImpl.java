package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.UserMapper;
import com.app.easy2excel.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    @Override
    public User saveUser(UserDTO userDTO) {
        return userRepository.save(userMapper.toEntity(userDTO));
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userRepository.findById(id).map(userMapper::toDTO )
                .orElseThrow(() -> new ResourceNotFoundException("User not found :" +id));
    }

}
