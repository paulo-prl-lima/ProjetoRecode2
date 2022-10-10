package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DestinoDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	public void inserirDestino(Destino destino) {
		String create = "insert into destino (nome, descricao, valor, nomeHotel, idCliente, idPromocao,qtdDias) values(?,?,?,?,?,?,?)";
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(create);
			pstm.setString(1, destino.getNome());
			pstm.setString(2, destino.getDescricao());
			pstm.setDouble(3, destino.getValor());
			pstm.setString(4, destino.getNomeHotel());
			pstm.setInt(5, destino.getIdCliente());
			pstm.setInt(6,destino.getIdPromocao());
			pstm.setInt(7, destino.getQtdDias());
			pstm.executeUpdate();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
