package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TecsEnfermagem extends CadastroGenerico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String COREM;

	// Métodos Acessores e Modicadores
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCOREM() {
		return COREM;
	}

	public void setCOREM(String cOREM) {
		COREM = cOREM;
	}

	//Método toString  
	
	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf() + ", genero=" + super.getGenero()
				+ ", dataNascimento=" + super.getDataNascimento() + ", +  email=" + super.getEmail() + ", COREN=" + getCOREM() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}
}