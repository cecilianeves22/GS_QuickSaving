package br.com.fiap.dto;

import br.com.fiap.entity.VendedorEntity;

public class VendedorDTO {
	
	private int id;
	private String nomeEmpresa; 
	private Long cnpj;
	
	public VendedorDTO(VendedorEntity entity) {
		this.id = entity.getId();
		this.nomeEmpresa = entity.getNomeEmpresa();
		this.cnpj = entity.getCnpj();
	}

	public VendedorDTO(int id, String nomeEmpresa, Long cnpj) {
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
