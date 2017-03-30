/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.projetobancario;


/**
 *
 * @author gabriel
 */
public class ContaCorrente extends Conta {

     private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

          
    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
    }
    


}
