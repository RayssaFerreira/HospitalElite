/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.SistemaHospitalElite.negocio;

import br.edu.SistemaHospitalElite.apresentacao.Relatorio;
import br.edu.SistemaHospitalElite.persistencia.RelatorioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rayssa
 */
public class RelatorioBO {
    
     
    public List<Relatorio> buscarPaciente() throws SQLException {
    RelatorioDAO relatorioDAO = new RelatorioDAO();
        return relatorioDAO.buscarPacientes();
    }
    
}
