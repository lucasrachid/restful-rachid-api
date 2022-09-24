package com.restful.rachidapi.Controller;

import com.restful.rachidapi.DTO.InfoDTO;
import com.restful.rachidapi.DTO.UserDTO;
import com.restful.rachidapi.Entity.User;
import com.restful.rachidapi.Service.FirstEntityService;
import com.restful.rachidapi.Service.UserService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/User")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> buscarTodosUsuariosPaginados(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "6") Integer linesPerPage,
            @RequestParam(value = "direction", defaultValue = "DESC") String direction,
            @RequestParam(value = "orderBy", defaultValue = "id") String orderBy
    ){
        PageRequest pageRequest = PageRequest.of(page,linesPerPage, Sort.Direction.valueOf(direction),orderBy);
        Page<UserDTO> lista = userService.getAllUser(pageRequest);
        return ResponseEntity.ok().body(lista);
    }}
