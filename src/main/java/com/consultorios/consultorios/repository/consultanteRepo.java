package com.consultorios.consultorios.repository;

import com.consultorios.consultorios.entity.consultante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface consultanteRepo extends JpaRepository<consultante, Integer>
{
    Optional<consultante> findById(Integer Integer);

    boolean existsById(Integer id);

}
