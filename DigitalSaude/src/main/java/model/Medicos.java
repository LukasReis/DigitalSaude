package model;

//Classe responsavel, por ser a representar de a entidade medicos, no banco de dados através da JPA juntamente com o Hibernate

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Medicos extends CadastroGenerico {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String crm;
	private String especializacao;

	// Métodos Acessores e Modificadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecilizacao() {
		return especializacao;
	}

	public void setEspecilizacao(String especializacao) {
		this.especializacao = especializacao;
	}

	// Método toString

	@Override
	public String toString() {
		return "Enfermeiro [id=" + id + ", nomeCompleto=" + super.getNomeCompleto() + ", cpf=" + super.getCpf()
				+ ", genero=" + super.getGenero() + ", dataNascimento=" + super.getDataNascimento() + ", +  email="
				+ super.getEmail() + ", corem=" + getCrm() + ", senha=" + super.getSenha() + ", telefone="
				+ super.getTelefone() + "]";
	}

	// HashCode e Equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(crm, id);
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
		return Objects.equals(crm, other.crm) && Objects.equals(id, other.id);
	}

}