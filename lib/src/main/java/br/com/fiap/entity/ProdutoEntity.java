package br.com.fiap.entity;

import java.util.Calendar;

import br.com.fiap.dto.ProdutoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_PRODUTO")
public class ProdutoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="nm_produto")
	private String nomeProduto;
	@Column(name="nm_marca")
	private String nomeMarca;
	@Column(name="desc_tipo")
	private String descTipo;
	@Column(name="desc_lote")
	private String descLote;
	@Column(name="dt_validade")
	private Calendar dataValidade;
	@Column(name="pr_unidade")
	private Long precoUnidade;
	
	public ProdutoEntity(ProdutoDTO produto) {
		this.id = id;
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
