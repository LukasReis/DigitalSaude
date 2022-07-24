package managedbean;

import java.util.ArrayList;
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
		private List<Pacientes> list = new ArrayList<Pacientes>();
		private DaoPaciente<Pacientes> daoPaciente = new DaoPaciente<Pacientes>();
		private String pesquisa;
		
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

		public String getPesquisa() {
			return pesquisa;
		}

		public void setPesquisa(String pesquisa) {
			this.pesquisa = pesquisa;
		}
		
		// funcionalidade que serão acessadas via FRONT (Pág.XHTML)
		public String salvar() {
			daoPaciente.salvar(paciente); // salva no banco, o usuário não vê
			list.add(paciente); // salva na lista temporário para o usuário ver
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMAÇÃO: ", "Salvo com sucesso!"));
			return "";
		}

		public String pesquisar() {
			list = daoPaciente.pesquisarNome(pesquisa);
			return "";
		}

		public String novo() {
			paciente = new Pacientes();
			return "";
		}
		
}
