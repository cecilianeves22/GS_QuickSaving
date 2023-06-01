package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.dto.VendedorDTO;
import br.com.fiap.service.VendedorService;


public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService; 
	
	@GetMapping("/vendedor")
	ResponseEntity<List<VendedorDTO>> all() {
		return ResponseEntity.ok(vendedorService.getAllVendedor());
	}
	
	@GetMapping("/vendedor/{id}")
	ResponseEntity<List<VendedorDTO>> getProdutoId(@PathVariable Long id) {
		return ResponseEntity.ok(vendedorService.getAllVendedorID(id));
	}
	
	
	
	@PostMapping("/cadastroVendedor")
	public ResponseEntity<VendedorDTO> newVendedor(@RequestBody VendedorDTO newVendedor) {
		vendedorService.saveVendedor(newVendedor);
		return ResponseEntity.ok(newVendedor);
	}
    
	
	@PutMapping("/vendedor/{id}")
	public ResponseEntity<VendedorDTO> replaceVendedor(@RequestBody VendedorDTO newVendedor, @PathVariable Long id) {
		VendedorDTO vendedorUpdated = vendedorService.updateVendedor(newVendedor,id);
		return ResponseEntity.ofNullable(vendedorUpdated);
	}
	
	@DeleteMapping("/vendedor/{id}")
	public ResponseEntity<VendedorDTO> deleteProduto(@PathVariable Long id) {
		return ResponseEntity.ofNullable(vendedorService.deleteVendedor(id));
	}

}
