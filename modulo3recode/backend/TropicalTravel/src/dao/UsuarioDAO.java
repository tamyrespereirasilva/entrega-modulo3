package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import model.Usuario;

public class UsuarioDAO {
	
	//CREATE
	public void save(Usuario pessoa) { 
		
		
		String sql = "INSERT INTO usuario (nome_usuario) VALUES (?)";
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, pessoa.getNome_usuario());
			
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
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
	
	//READ
	public List<Usuario> getUsuario() { 
		
		
		String sql = "SELECT * FROM Usuario";
		
		
		List<Usuario> pessoas = new ArrayList<Usuario>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			
			pstm = conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			
			while (rset.next()) { 
				Usuario pessoa = new Usuario();
				
				pessoa.setId_usuario(rset.getInt("id_usuario"));
				pessoa.setNome_usuario(rset.getString("nome_usuario"));
				
				pessoas.add(pessoa);
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
		
		return pessoas;
	}

	//UPDATE
	public void update(Usuario pessoa) { 
		
		String sql = "UPDATE Usuario SET nome_usuario = ? WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, pessoa.getNome_usuario());
			pstm.setInt(2, pessoa.getId_usuario());
			
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
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
	
	//DELETE
	public void deleteById(int id) { 
		
		String sql = "DELETE FROM Usuario WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
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
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
}