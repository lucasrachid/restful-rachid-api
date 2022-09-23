package com.restful.rachidapi.Repository;

import com.restful.rachidapi.Entity.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FirstEntityRepository extends JpaRepository<FirstEntity, Long> {

   Optional<FirstEntity> findById(Long id);

   List<FirstEntity> findAllByNameIsNotNull();

}
