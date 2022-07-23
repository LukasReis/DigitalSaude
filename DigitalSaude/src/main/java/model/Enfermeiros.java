package model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enfermeiros extends CadastroGenerico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String COREM;

	// Métodos Acessores e Modificadores

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

	// Método toString

	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf()
				+ ", genero=" + super.getGenero() + ", dataNascimento=" + super.getDataNascimento() + ", +  email="
				+ super.getEmail() + ", COREN=" + getCOREM() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}

	// HashCode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(COREM, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermeiros other = (Enfermeiros) obj;
		return Objects.equals(COREM, other.COREM) && Objects.equals(id, other.id);
	}

}