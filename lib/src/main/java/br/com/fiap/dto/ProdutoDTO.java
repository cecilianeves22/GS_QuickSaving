package br.com.fiap.dto;

import java.util.Calendar;

import br.com.fiap.entity.ProdutoEntity;

public class ProdutoDTO {
	
	private int id;
	private String nomeProduto;
	private String nomeMarca;
	private String descTipo;
	private String descLote;
	private Calendar dataValidade;
	private Long precoUnidade;
	
	public ProdutoDTO(ProdutoEntity entity) {
		this.id = entity.getId();
		this.nomeProduto = entity.getNomeProduto();
		this.nomeMarca = entity.getNomeMarca();
		this.descTipo = entity.getDescTipo();
		this.descLote = entity.getDescLote();
		this.dataValidade = entity.getDataValidade();
		this.precoUnidade = entity.getPrecoUnidade();
	}

	public ProdutoDTO(int id, String nomeProduto, String nomeMarca, String descTipo, String descLote,
			Calendar dataValidade, Long precoUnidade) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.nomeMarca = nomeMarca;
		this.descTipo = descTipo;
		this.descLote = descLote;
		this.dataValidade = dataValidade;
		this.precoUnidade = precoUnidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

	public String getDescTipo() {
		return descTipo;
	}

	public void setDescTipo(String descTipo) {
		this.descTipo = descTipo;
	}

	public String getDescLote() {
		return descLote;
	}

	public void setDescLote(String descLote) {
		this.descLote = descLote;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Long getPrecoUnidade() {
		return precoUnidade;
	}

	public void setPrecoUnidade(Long precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
	
	
	
	

}
