package br.com.fiap.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.dao.VendedorRepository;
import br.com.fiap.dto.VendedorDTO;
import br.com.fiap.entity.VendedorEntity;


public class VendedorService {
	
private VendedorRepository vendedorRepository;
	
	public VendedorDTO saveVendedor(VendedorDTO vendedor) {
		VendedorEntity vendedorEntity = new VendedorEntity(vendedor);
		vendedorRepository.save(vendedorEntity);
		return vendedor;
	}

	public List<VendedorDTO> getAllVendedor() {
		return vendedorRepository.findAll().stream().map(entity -> new VendedorDTO(entity)).toList();
	}
	
	public VendedorDTO findById(Long id) {
		 Optional<VendedorEntity> vendedorEntity = vendedorRepository.findById(id);
		 if(vendedorEntity.isPresent()) {
			 return new VendedorDTO(vendedorEntity.get());
		 } 
		 return null;
	}
	
	public VendedorDTO updateVendedor(VendedorDTO newVendedor, Long id) {
		Optional<VendedorEntity> vendedorEntityOptional = vendedorRepository.findById(id);
		if(vendedorEntityOptional.isPresent()) {
			VendedorEntity vendedorEntity = vendedorEntityOptional.get();
			vendedorEntity.setId(newVendedor.getId());
			vendedorEntity.setNomeEmpresa(newVendedor.getNomeEmpresa());;
			vendedorEntity.setCnpj(newVendedor.getCnpj());
			return newVendedor;
		}
		return null;
		
	}
	
	public VendedorDTO deleteVendedor(Long id) {
		Optional<VendedorEntity> vendedorEntityOptional = vendedorRepository.findById(id);
		if(vendedorEntityOptional.isPresent()) {
			VendedorEntity vendedorEntity = vendedorEntityOptional.get();
			vendedorRepository.delete(vendedorEntity);
			return new VendedorDTO(vendedorEntity);
		}
		return null;
	}

	public List<VendedorDTO> getAllVendedorID(Long id) {
		return vendedorRepository.findAll().stream().map(entity -> new VendedorDTO(entity)).toList();
	}

}
