package com.restful.rachidapi.Service;

import com.restful.rachidapi.DTO.InfoDTO;
import com.restful.rachidapi.DTO.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface UserService {

    UserDTO getUser(Long id);

    Page<UserDTO> getAllUser(PageRequest pageRequest);

    UserDTO updateUser(UserDTO user, Long id);

    void deleteUser(Long id);
}
