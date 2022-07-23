package model;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String especilizacao;
	private Duration data;
	private Instant horario;

	// Métodos Acessores e Modficadores

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEspecilizacao() {
		return especilizacao;
	}

	public void setEspecilizacao(String especilizacao) {
		this.especilizacao = especilizacao;
	}

	public Duration getData() {
		return data;
	}

	public void setData(Duration data) {
		this.data = data;
	}

	public Instant getHorario() {
		return horario;
	}

	public void setHorario(Instant horario) {
		this.horario = horario;
	}

	// Método toString

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", especilizacao=" + especilizacao + ", data=" + data + ", horario=" + horario
				+ "]";
	}

	// HasCode e Equals

	@Override
	public int hashCode() {
		return Objects.hash(data, especilizacao, horario, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(data, other.data) && Objects.equals(especilizacao, other.especilizacao)
				&& Objects.equals(horario, other.horario) && Objects.equals(id, other.id);
	}

}
