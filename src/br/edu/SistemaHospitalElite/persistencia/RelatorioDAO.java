/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.SistemaHospitalElite.persistencia;

import br.edu.SistemaHospitalElite.apresentacao.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class RelatorioDAO {
    
     private static final String SQL_CONSULTA_RELATORIO = "SELECT P.NOME P.IDADE FROM PACIENTE ORDER BY P.NOME";


    public List<Relatorio> buscarPacientes() throws SQLException {
      Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        List<Relatorio> listaJogaorTime = new ArrayList<>();
        try {
            //Recupera a conexão
            conexao = BancoDadosUtil.getConnection();
            //Cria o comando de consulta dos dados
            comando = conexao.prepareStatement(SQL_CONSULTA_RELATORIO);
            //Executa o comando e obtém o resultado da consulta
            resultado = comando.executeQuery();
            //O método next retornar boolean informando se existe um próximo
            //elemento para iterar
            while (resultado.next()) {
                Relatorio relatorio = this.extrairLinhaResultadoBuscarJogadorTime(resultado);
                //Adiciona um item à lista que será retornada
                listaJogaorTime.add(relatorio);
            }
        } finally {
            //Todo objeto que referencie o banco de dados deve ser fechado
            BancoDadosUtil.fecharChamadasBancoDados(conexao, comando, resultado);
        }
        return listaJogaorTime;
    
    }

    private Relatorio extrairLinhaResultadoBuscarJogadorTime(ResultSet resultado) throws SQLException {
     Relatorio relatorio = new Relatorio();     
        relatorio.setNome(resultado.getString(1));
        relatorio.setIdade(resultado.getInt(2));
        return relatorio;  
    }
    
}
