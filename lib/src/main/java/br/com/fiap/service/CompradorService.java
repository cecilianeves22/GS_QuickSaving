package br.com.fiap.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.dao.CompradorRepository;
import br.com.fiap.dto.CompradorDTO;
import br.com.fiap.entity.CompradorEntity;

public class CompradorService {

private CompradorRepository compradorRepository;
	
	public CompradorDTO saveComprador(CompradorDTO comprador) {
		CompradorEntity compradorEntity = new CompradorEntity(comprador);
		compradorRepository.save(compradorEntity);
		return comprador;
	}

	public List<CompradorDTO> getAllComprador() {
		return compradorRepository.findAll().stream().map(entity -> new CompradorDTO(entity)).toList();
	}
	
	public CompradorDTO findById(Long id) {
		 Optional<CompradorEntity> compradorEntity = compradorRepository.findById(id);
		 if(compradorEntity.isPresent()) {
			 return new CompradorDTO(compradorEntity.get());
		 } 
		 return null;
	}
	
	public CompradorDTO updateComprador(CompradorDTO newComprador, Long id) {
		Optional<CompradorEntity> compradorEntityOptional = compradorRepository.findById(id);
		if(compradorEntityOptional.isPresent()) {
			CompradorEntity compradorEntity = compradorEntityOptional.get();
			compradorEntity.setId(newComprador.getId());
			compradorEntity.setNomeEmpresa(newComprador.getNomeEmpresa());;
			compradorEntity.setCnpj(newComprador.getCnpj());
			return newComprador;
		}
		return null;
		
	}
	
	public CompradorDTO deleteComprador(Long id) {
		Optional<CompradorEntity> compradorEntityOptional = compradorRepository.findById(id);
		if(compradorEntityOptional.isPresent()) {
			CompradorEntity compradorEntity = compradorEntityOptional.get();
			compradorRepository.delete(compradorEntity);
			return new CompradorDTO(compradorEntity);
		}
		return null;
	}

	public List<CompradorDTO> getAllCompradorID(Long id) {
		return compradorRepository.findAll().stream().map(entity -> new CompradorDTO(entity)).toList();
	}
}
