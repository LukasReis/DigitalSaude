package model;

//Classe abastrata, responsavel por ser ter atributos, a serem herdados, para economizar linhas de codigo

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CadastroGenerico {

	private String nomeCompleto;
	private String cpf;
	private String genero;
	private LocalDate dataNascimento;
	private String email;
	private String senha;
	private String telefone;

	// Métodos Acessores e Modificadores

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// Método toString

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNascimento, email, genero, nomeCompleto, senha, telefone);
	}

	// HashCode e Equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroGenerico other = (CadastroGenerico) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(genero, other.genero) && Objects.equals(nomeCompleto, other.nomeCompleto)
				&& Objects.equals(senha, other.senha) && Objects.equals(telefone, other.telefone);
	}

}