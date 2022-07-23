package model;

//Classe responsavel, por ser a representar de a entidade enfermeiros, no banco de dados através da JPA juntamente com o Hibernate

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
	private String corem;

	// Métodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorem() {
		return corem;
	}

	public void setCorem(String corem) {
		this.corem = corem;
	}

	// Método toString

	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf()
				+ ", genero=" + super.getGenero() + ", dataNascimento=" + super.getDataNascimento() + ", +  email="
				+ super.getEmail() + ", corem=" + getCorem() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}

	// HashCode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(corem, id);
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
		return Objects.equals(corem, other.corem) && Objects.equals(id, other.id);
	}

}