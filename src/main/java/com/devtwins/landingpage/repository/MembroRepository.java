package com.devtwins.landingpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtwins.landingpage.model.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {

}
