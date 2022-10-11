package agenda.main;

import java.util.Date;

import agenda.dao.ContatoDAO;
import agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		ContatoDAO contatoDAO = new ContatoDAO();
		contato.setNome("Joãozinho");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		//salvar nosso contato
		contatoDAO.criarContato(contato);
		
		//Atualizar nosso contato
		//Contato c1 = new Contato();
		//c1.setNome("Jonas Alberto");
		//c1.setIdade(34);
		//c1.setDataCadastro(new Date());
		//c1.setId(1); //ID que esta no banco de dados PK
		//contatoDAO.atualizaContato(c1);
		
		//Deleção por ID 
		//contatoDAO.removerContato(3);
		
		//Visualização dos registros do banco de dados TODOS
//		 for (Contato c : contatoDAO.listarTodosContatos()) {
//			System.out.println("Nome: "+c.getNome());
//			System.out.println("Nome: "+c.getIdade());
//		
//		}
		
	}

}
