package br.com.fiap.dto;

import java.util.Calendar;

import br.com.fiap.entity.ReservaEntity;


public class ReservaDTO {
	
	private int id; 
	private String nomeProduto;
	private Long preco;
	private Calendar dataCompra;
	private int quantidade;

	public ReservaDTO(ReservaEntity entity) {
		this.id = entity.getId();
		this.nomeProduto = entity.getNomeProduto();
		this.preco = entity.getPreco();
		this.dataCompra = entity.getDataCompra();
		this.quantidade = entity.getQuantidade();
	}

	public ReservaDTO(int id, String nomeProduto, Long preco, Calendar dataCompra, int quantidade) {
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
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

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
