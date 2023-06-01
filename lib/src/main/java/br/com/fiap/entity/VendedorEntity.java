package br.com.fiap.entity;

import br.com.fiap.dto.VendedorDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="T_VENDEDOR")
public class VendedorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="nm_empresa")
	private String nomeEmpresa; 
	
	@Column(name="nr_cnpj")
	private Long cnpj;
	
	public VendedorEntity() {}
	
	public VendedorEntity(VendedorDTO vendedor) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa; 
		this.cnpj = cnpj; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
