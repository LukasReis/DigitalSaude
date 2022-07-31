package managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import dao.DaoPaciente;
import model.Pacientes;

@ViewScoped
@ManagedBean(name = "pacienteManagedBean")
public class PacienteManagedBean {

	private Pacientes paciente = new Pacientes();
	private List<Pacientes> list;
	private DaoPaciente<Pacientes> daoPaciente = new DaoPaciente<Pacientes>();
	private String pesquisa;
	private Pacientes selectedPaciente;

	@PostConstruct
	public void init() {
		list = daoPaciente.listar(Pacientes.class);
	}

	public Pacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}

	public List<Pacientes> getList() {
		return list;
	}

	public void setList(List<Pacientes> list) {
		this.list = list;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

	public Pacientes getSelectedPaciente() {
		return selectedPaciente;
	}

	public void setSelectedPaciente(Pacientes selectedPaciente) {
		this.selectedPaciente = selectedPaciente;
	}

	// funcionalidade que serão acessadas via FRONT (Pág.XHTML)
	public String salvar() {
		daoPaciente.salvar(paciente);
		list.add(paciente);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMAÇÃO: ", "Salvo com sucesso!"));
		return "";
	}

	public String pesquisar() {
		list = daoPaciente.pesquisarNome(pesquisa);
		System.out.println(list);
		return "";
	}

	public void novo() {
		System.out.println(this.selectedPaciente);
	}

	public String deletar() {
		daoPaciente.deletar(paciente);
		list.remove(paciente); 
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMAÇÃO: ", "Excluído com sucesso!"));
		return "";
	}

}
