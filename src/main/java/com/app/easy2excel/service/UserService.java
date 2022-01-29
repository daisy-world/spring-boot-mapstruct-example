package com.app.easy2excel.service;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;

public interface UserService {
	 User saveUser(UserDTO userDTO);
	 UserDTO getUserById(Long id);
}
