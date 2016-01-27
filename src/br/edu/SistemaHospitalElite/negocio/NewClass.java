/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.SistemaHospitalElite.negocio;

/**
 *
 * @author Rayssa
 */
public class NewClass {
    
    /*
    Classe BO
public void verificaUsuarioExistente(Usuario usuario) throws SQLException {
 Usuario usuarioExistente = null;
 UsuarioDAO usuarioDAO = new UsuarioDAO(); 
usuarioExistente = usuarioDAO.buscarByCPF(usuario.getCpf());
 if (usuarioExistente != null)
 { throw new UsuarioCpfExistenteException("Existe um usuario cadastrado com esse CPF."); 
}
 }

Classe DAO
private static final String SQL_SELECT_BY_CPF = "SELECT * FROM USUARIO WHERE CPF = ? AND F = TRUE";
public Usuario buscarByLogin(String login) throws SQLException{ 
Usuario usuario = null; 
Connection conexao = null; 
PreparedStatement comando = null; 
ResultSet resultado = null; 
try{ conexao = BancoDadosUtil.getConnection(); 
comando = conexao.prepareStatement(SQL_SELECT_BY_LOGIN); 
comando.setString(1, login);
 resultado = comando.executeQuery(); 
while(resultado.next()){
 usuario = new Usuario(); 
usuario.setCpf(resultado.getString(1));
 usuario.setRg(resultado.getString(2)); 
usuario.setIdade(resultado.getInt(3)); 
usuario.setCargo(resultado.getString(4)); 
usuario.setNome(resultado.getString(5)); 
usuario.setPermissao(resultado.getInt(8)); } 
} catch (Exception e) 
{ if (conexao != null) { 
conexao.rollback(); } 
    
    
    
    */
    
}
