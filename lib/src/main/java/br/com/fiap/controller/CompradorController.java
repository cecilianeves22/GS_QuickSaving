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

import br.com.fiap.dto.CompradorDTO;
import br.com.fiap.service.CompradorService;


public class CompradorController {
	
	@Autowired
	private CompradorService compradorService; 
	
	@GetMapping("/comprador")
	ResponseEntity<List<CompradorDTO>> all() {
		return ResponseEntity.ok(compradorService.getAllComprador());
	}
	
	@GetMapping("/comprador/{id}")
	ResponseEntity<List<CompradorDTO>> getCompradorId(@PathVariable Long id) {
		return ResponseEntity.ok(compradorService.getAllCompradorID(id));
	}
	
	
	
	@PostMapping("/cadastroComprador")
	public ResponseEntity<CompradorDTO> newComprador(@RequestBody CompradorDTO newComprador) {
		compradorService.saveComprador(newComprador);
		return ResponseEntity.ok(newComprador);
	}
    
	
	@PutMapping("/comprador/{id}")
	public ResponseEntity<CompradorDTO> replaceComprador(@RequestBody CompradorDTO newComprador, @PathVariable Long id) {
		CompradorDTO compradorUpdated = compradorService.updateComprador(newComprador,id);
		return ResponseEntity.ofNullable(compradorUpdated);
	}
	
	@DeleteMapping("/comprador/{id}")
	public ResponseEntity<CompradorDTO> deleteComprador(@PathVariable Long id) {
		return ResponseEntity.ofNullable(compradorService.deleteComprador(id));
	}

}
