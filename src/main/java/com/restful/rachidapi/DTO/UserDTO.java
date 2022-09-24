package com.restful.rachidapi.DTO;

import com.restful.rachidapi.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private Instant dataNascimento;

    public UserDTO(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.dataNascimento = entity.getData_Nascimento();
    }
}