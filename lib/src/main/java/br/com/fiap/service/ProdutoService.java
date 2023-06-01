package br.com.fiap.service;

import java.util.List;
import java.util.Optional;


import br.com.fiap.dao.ProdutoRepository;
import br.com.fiap.dto.ProdutoDTO;
import br.com.fiap.entity.ProdutoEntity;

public class ProdutoService {

private ProdutoRepository produtoRepository;
	
	public ProdutoDTO saveComprador(ProdutoDTO produto) {
		ProdutoEntity produtoEntity = new ProdutoEntity(produto);
		produtoRepository.save(produtoEntity);
		return produto;
	}

	public List<ProdutoDTO> getAllProduto() {
		return produtoRepository.findAll().stream().map(entity -> new ProdutoDTO(entity)).toList();
	}
	
	public ProdutoDTO findById(Long id) {
		 Optional<ProdutoEntity> produtoEntity = produtoRepository.findById(id);
		 if(produtoEntity.isPresent()) {
			 return new ProdutoDTO(produtoEntity.get());
		 } 
		 return null;
	}
	
	public ProdutoDTO updateProduto(ProdutoDTO newProduto, Long id) {
		Optional<ProdutoEntity> produtoEntityOptional = produtoRepository.findById(id);
		if(produtoEntityOptional.isPresent()) {
			ProdutoEntity produtoEntity = produtoEntityOptional.get();
			produtoEntity.setId(newProduto.getId());
			produtoEntity.setNomeProduto(newProduto.getNomeProduto());
			produtoEntity.setNomeMarca(newProduto.getNomeMarca());
			produtoEntity.setDescTipo(newProduto.getDescTipo());
			produtoEntity.setDescLote(newProduto.getDescLote());
			produtoEntity.setDataValidade(newProduto.getDataValidade());
			produtoEntity.setPrecoUnidade(newProduto.getPrecoUnidade());
			return newProduto;
		}
		return null;
		
	}
	
	public ProdutoDTO deleteProduto(Long id) {
		Optional<ProdutoEntity> produtoEntityOptional = produtoRepository.findById(id);
		if(produtoEntityOptional.isPresent()) {
			ProdutoEntity produtoEntity = produtoEntityOptional.get();
			produtoRepository.delete(produtoEntity);
			return new ProdutoDTO(produtoEntity);
		}
		return null;
	}

	public List<ProdutoDTO> getAllProdutoID(Long id) {
		return produtoRepository.findAll().stream().map(entity -> new ProdutoDTO(entity)).toList();
	}
}
