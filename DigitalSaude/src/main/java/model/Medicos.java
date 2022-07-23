package model;

import java.util.Objects;

//Classe responsavel por ser a representar de uma entidade no banco de dados através da JPA juntamente com o Hibernate

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medicos extends CadastroGenerico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String CRM;

	// Métodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}

	// Método toString

	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf()
				+ ", genero=" + super.getGenero() + ", dataNascimento=" + super.getDataNascimento() + ", +  email="
				+ super.getEmail() + ", COREN=" + getCRM() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}

	// HashCode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CRM, id);
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
		Medicos other = (Medicos) obj;
		return Objects.equals(CRM, other.CRM) && Objects.equals(id, other.id);
	}

}