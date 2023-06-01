package br.com.fiap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.entity.VendedorEntity;

public interface VendedorRepository extends JpaRepository<VendedorEntity, Long> {

}
