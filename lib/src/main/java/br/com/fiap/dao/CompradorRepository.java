package br.com.fiap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.entity.CompradorEntity;

public interface CompradorRepository extends JpaRepository<CompradorEntity, Long>{
}
