package br.com.fiap.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.dao.ReservaRepository;
import br.com.fiap.dto.ReservaDTO;
import br.com.fiap.entity.ReservaEntity;

public class ReservaService {
	
private ReservaRepository reservaRepository;
	
	public ReservaDTO saveReserva(ReservaDTO reserva) {
		ReservaEntity reservaEntity = new ReservaEntity(reserva);
		reservaRepository.save(reservaEntity);
		return reserva;
	}

	public List<ReservaDTO> getAllReserva() {
		return reservaRepository.findAll().stream().map(entity -> new ReservaDTO(entity)).toList();
	}
	
	public ReservaDTO findById(Long id) {
		 Optional<ReservaEntity> reservaEntity = reservaRepository.findById(id);
		 if(reservaEntity.isPresent()) {
			 return new ReservaDTO(reservaEntity.get());
		 } 
		 return null;
	}
	
	public ReservaDTO updateReserva(ReservaDTO newReserva, Long id) {
		Optional<ReservaEntity> reservaEntityOptional = reservaRepository.findById(id);
		if(reservaEntityOptional.isPresent()) {
			ReservaEntity reservaEntity = reservaEntityOptional.get();
			reservaEntity.setId(newReserva.getId());
			reservaEntity.setNomeProduto(newReserva.getNomeProduto());
			reservaEntity.setPreco(newReserva.getPreco());
			reservaEntity.setDataCompra(newReserva.getDataCompra());
			reservaEntity.setQuantidade(newReserva.getQuantidade());
			return newReserva;
		}
		return null;
		
	}
	
	public ReservaDTO deleteReserva(Long id) {
		Optional<ReservaEntity> reservaEntityOptional = reservaRepository.findById(id);
		if(reservaEntityOptional.isPresent()) {
			ReservaEntity reservaEntity = reservaEntityOptional.get();
			reservaRepository.delete(reservaEntity);
			return new ReservaDTO(reservaEntity);
		}
		return null;
	}

	public List<ReservaDTO> getAllReservaID(Long id) {
		return reservaRepository.findAll().stream().map(entity -> new ReservaDTO(entity)).toList();
	}

}
