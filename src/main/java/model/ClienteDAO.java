package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void inserirCliente(Cliente cliente){
		String create = "insert into cliente (nome, endereco, telefone) values(?,?,?)";
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(create);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getEndereco());
			pstm.setString(3, cliente.getTelefone());
			pstm.executeUpdate();
			conn.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}
