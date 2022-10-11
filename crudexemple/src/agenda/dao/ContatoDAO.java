package agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import agenda.factory.ConnectionFactory;
import agenda.model.Contato;

public class ContatoDAO {
	// CRUD

	public void criarContato(Contato contato) {
		String sql = "INSERT INTO contatos(nome, idade, "
				+ "datacadastro) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			// Cria uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criamos uma PrepareStatement para executar as funcoes de conexao
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores que são esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

			// execute a query
			pstm.execute();
			System.out.println("Executado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fechar a conexão
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Contato> listarTodosContatos() {
		String sql = "SELECT * FROM contatos";

		List<Contato> contatos = new ArrayList<Contato>();
		Connection conn = null;
		PreparedStatement pstm = null;
		// Classe que vai recuperar(receber) os dados do banco
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Contato contato = new Contato();

				// Receber o id
				contato.setId(rset.getInt("id"));
				// Receber o nome
				contato.setNome(rset.getString("nome"));
				// Receber a idade
				contato.setIdade(rset.getInt("idade"));
				// Receber a data do cadastro
				contato.setDataCadastro(rset.getDate("datacadastro"));

				// Salvar dentro do nosso array de contatos
				contatos.add(contato);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return contatos;
	}

	public void atualizaContato(Contato contato) {

		String sql = "UPDATE contatos SET nome = ?,idade = ?, datacadastro = ?" + " WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Criar conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();
			// Criar a classe para executar a query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar os valores para atualizar
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			pstm.setInt(4, contato.getId());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void removerContato(int id) {
		String sql = "DELETE FROM contatos WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
			System.out.println("Deletado com Sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
