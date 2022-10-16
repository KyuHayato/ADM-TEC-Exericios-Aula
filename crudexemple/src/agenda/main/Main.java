package agenda.main;

import java.util.Date;

import agenda.dao.ContatoDAO;
import agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		ContatoDAO contatoDAO = new ContatoDAO();
		contato.setNome("Jo�ozinho");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		//salvar nosso contato
		//contatoDAO.criarContato(contato);
		
		//Atualizar nosso contato
		Contato c1 = new Contato();
		c1.setNome("Cacique");
		c1.setIdade(50);
		c1.setDataCadastro(new Date());
		c1.setId(4); //ID que esta no banco de dados PK
		//contatoDAO.atualizaContato(c1);
		
		//Dele��o por ID 
		contatoDAO.removerContato(4);
		
		//Visualiza��o dos registros do banco de dados TODOS
		 for (Contato c : contatoDAO.listarTodosContatos()) {
			System.out.println("Nome: "+c.getNome());
			System.out.println("Idade: "+c.getIdade());
		
		}
		
	}

}
