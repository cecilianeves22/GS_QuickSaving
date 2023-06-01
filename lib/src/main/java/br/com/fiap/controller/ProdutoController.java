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

import br.com.fiap.dto.ProdutoDTO;
import br.com.fiap.service.ProdutoService;

public class ProdutoController {

	@Autowired
	private ProdutoService produtoService; 
	
	@GetMapping("/produto")
	ResponseEntity<List<ProdutoDTO>> all() {
		return ResponseEntity.ok(produtoService.getAllProduto());
	}
	
	@GetMapping("/produto/{id}")
	ResponseEntity<List<ProdutoDTO>> getProdutoId(@PathVariable Long id) {
		return ResponseEntity.ok(produtoService.getAllProdutoID(id));
	}
	
	
	
	@PostMapping("/cadastroProduto")
	public ResponseEntity<ProdutoDTO> newProduto(@RequestBody ProdutoDTO newProduto) {
		produtoService.saveComprador(newProduto);
		return ResponseEntity.ok(newProduto);
	}
    
	
	@PutMapping("/produto/{id}")
	public ResponseEntity<ProdutoDTO> replaceProduto(@RequestBody ProdutoDTO newProduto, @PathVariable Long id) {
		ProdutoDTO produtoUpdated = produtoService.updateProduto(newProduto,id);
		return ResponseEntity.ofNullable(produtoUpdated);
	}
	
	@DeleteMapping("/produto/{id}")
	public ResponseEntity<ProdutoDTO> deleteProduto(@PathVariable Long id) {
		return ResponseEntity.ofNullable(produtoService.deleteProduto(id));
	}
}
