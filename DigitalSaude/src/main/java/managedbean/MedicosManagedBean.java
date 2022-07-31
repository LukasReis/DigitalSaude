package managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

import dao.DaoMedicos;
import model.Medicos;
import model.Pacientes;

@ViewScoped
@ManagedBean(name = "medicoManagedBean")
public class MedicosManagedBean {

	private Medicos medicos = new Medicos();
	private List<Medicos> listMedicos;
	private DaoMedicos<Medicos> daoMedicos = new DaoMedicos<Medicos>();
	private String pesquisa;
	private Medicos selectedMedicos;

	@PostConstruct
	public void init() {
		listMedicos = daoMedicos.listar(Medicos.class);
	}

	// Metodos Acessores e Modificadores

	public Medicos getMedicos() {
		return medicos;
	}

	public void setMedicos(Medicos medicos) {
		this.medicos = medicos;
	}

	public List<Medicos> getList() {
		return listMedicos;
	}

	public String getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

	// Funcionalidades que serão acessadas via front

	public String salvar() {
		daoMedicos.salvar(medicos);
		listMedicos.add(medicos);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMAÇÃO: ", "Salvo com sucesso!"));
		return "";
	}

	public String pesquisar() {
		listMedicos = daoMedicos.pesquisarNome(pesquisa);
		System.out.println(listMedicos);
		return "";
	}

	public String novo() {
		medicos = new Medicos();
		return "";
	}
	
	public String deletar() {
		daoMedicos.deletar(medicos);
		listMedicos.remove(medicos); 
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMAÇÃO: ", "Excluído com sucesso!"));
		return "";
	}
	
	public Medicos getSelectedMedicos() {
		return selectedMedicos;
	}

	public void setSelectedMedicos(Medicos selectedMedicos) {
		this.selectedMedicos = selectedMedicos;
	}

}