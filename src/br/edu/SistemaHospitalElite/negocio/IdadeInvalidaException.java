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
public class IdadeInvalidaException extends RuntimeException {

    public IdadeInvalidaException(String string) {
        super (string);
    }
    
}
