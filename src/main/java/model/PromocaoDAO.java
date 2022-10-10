package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PromocaoDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void inserirPromocao(Promocao promocao) {
		String create = "insert into promocao (nomePacote, percentual, observacao) values(?,?,?)";
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(create);
			pstm.setString(1, promocao.getNomePacote());
			pstm.setDouble(2, promocao.getPercentual());
			pstm.setString(3, promocao.getObservacao());
			pstm.executeUpdate();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
