package br.com.fiap.entity;

import java.util.Calendar;

import br.com.fiap.dto.ReservaDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_PRODUTO")
public class ReservaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	@Column(name="nm_produto")
	private String nomeProduto;
	@Column(name="preco")
	private Long preco;
	@Column(name="dt_compra")
	private Calendar dataCompra;
	@Column(name="nm_quantidade")
	private int quantidade;

	public ReservaEntity(ReservaDTO reserva) {
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
