package br.edu.infnet.apiendereco.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	
		name="TEndereco", 
		uniqueConstraints = @UniqueConstraint(columnNames={"cep"}))
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localicade;
	private String uf;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalicade() {
		return localicade;
	}
	public void setLocalicade(String localicade) {
		this.localicade = localicade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getId());
		sb.append(" - ");
		sb.append(getLogradouro());
		sb.append(", ");
		sb.append(getComplemento());
		sb.append(", ");
		sb.append(getBairro());
		sb.append(" - ");
		sb.append(getLocalicade());
		sb.append("/");
		sb.append(getUf());
		sb.append(" CEP: ");
		sb.append(getCep());
		
		return sb.toString();
	}
	
	

}
