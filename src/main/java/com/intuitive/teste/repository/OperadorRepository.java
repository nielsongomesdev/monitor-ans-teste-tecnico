package com.intuitive.teste.repository;

import com.intuitive.teste.model.Operador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OperadorRepository extends JpaRepository<Operador, Integer> {

    List<Operador> findByRazaoSocialContainingIgnoreCase(String termo);
}
