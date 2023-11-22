package com.projeto.portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.portifolio.models.Perfil;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long>{
    
}
