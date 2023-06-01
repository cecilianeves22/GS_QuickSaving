package br.com.fiap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.entity.ReservaEntity;

public interface ReservaRepository extends JpaRepository<ReservaEntity,Long>{

}
