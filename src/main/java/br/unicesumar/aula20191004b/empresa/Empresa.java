package br.unicesumar.aula20191004b.empresa;

import br.unicesumar.aula20191004b.socio.Socio;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Empresa {
	@Id
	private String id;
	private String razaoSocial;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ContratoSocial contratoSocial;

	public Empresa() {
		id = UUID.randomUUID().toString();
	}
	
	public Empresa(String termosDoContratoSocial) {
		this.contratoSocial = new ContratoSocial(termosDoContratoSocial, this);
	}
	
	public ContratoSocial getContratoSocial() {
		return contratoSocial;
	}
	
	public String getId() {
		return id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}

	
	
	@Entity
	public static class ContratoSocial {		
		@Id
		private String id = UUID.randomUUID().toString();
		private String termos;
		
		@ManyToMany(mappedBy="contratosSociais")
		private Set<Socio> socios = new HashSet<>();
		
		
		@OneToOne(mappedBy="contratoSocial")
		private Empresa empresa;

		private ContratoSocial() {
			id = UUID.randomUUID().toString();
		}
		
		private ContratoSocial(String termos, Empresa empresa) {
			this();
			this.termos = termos;
			this.empresa = empresa;			
		}
		
		@JsonIgnore
		public Empresa getEmpresa() {
			return empresa;
		}
		
		public String getTermos() {
			return termos;
		}
		public String getId() {
			return id;
		}
		public Set<Socio> getSocios() {
			return socios;
		}
	}
}
