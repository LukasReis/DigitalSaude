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


@ViewScoped
@ManagedBean(name = "MedicoManagedBean")
public class MedicosManagedBean {
	
		private Medicos medicos = new Medicos();
		private List<Medicos> listMedicos = new ArrayList<Medicos>();
		private DaoMedicos<Medicos> daoMedicos = new DaoMedicos<Medicos>();
		private String pesquisa;
		
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
			return "";
		} 


		public String novo() {
			medicos = new Medicos();
			return "";
		}


//		public String deletar(){
//			try{
//			  daoMedicos.deltar(medicos);	
//			  listMedicos.remove(medicos);
//			 FacesContext.getCurrentInstance().addMessage(null,new FacesMessage
//			(FacesMessage.SEVERITY_INFO, "Medico deletado com sucesso!"));
//
//		} catch (Exception e){
//			if (e.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
//						"INFORMAÇÃO: ", "Você não pode excluir esse usuário antes de excluir os telefones!"));
//			} else {
//				e.printStackTrace();// joga no console outra exceção que não foi tratada
//				}
//
//			}
//      		 return "";
//		}
}