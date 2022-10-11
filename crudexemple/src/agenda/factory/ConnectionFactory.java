package agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//como n iremos ter processamento static e como n havera mudança
	
	//nome do usuario mysql
	private static final String USERNAME = "root";
	//senha do banco
	private static final String PASSWORD = "Rocklee767";
	//Caminho
	//caminho do banco de dados com porta e nome do banco
	private static final String DATABASE_URL  = 
	 		"jdbc:mysql://localhost:3306/agenda";
	
	//conexao com o banco de dados
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Cria a conexão com o banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		//Recuperar uma conexão com o banco de dados 
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexão é nula 
		if(con != null) {
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
	}
}
