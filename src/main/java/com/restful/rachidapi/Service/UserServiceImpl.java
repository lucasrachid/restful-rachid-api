package com.restful.rachidapi.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restful.rachidapi.DTO.FirstEntityDTO;
import com.restful.rachidapi.DTO.InfoDTO;
import com.restful.rachidapi.DTO.UserDTO;
import com.restful.rachidapi.Entity.FirstEntity;
import com.restful.rachidapi.Entity.User;
import com.restful.rachidapi.Repository.FirstEntityRepository;
import com.restful.rachidapi.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public UserDTO getUser(Long id) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public Page<UserDTO> getAllUser(PageRequest pageRequest) {
        Page<User> listUser = userRepository.findAll(pageRequest);
        return listUser.map(x -> new UserDTO(x));
    }

    @Override
    public UserDTO updateUser(UserDTO user, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
