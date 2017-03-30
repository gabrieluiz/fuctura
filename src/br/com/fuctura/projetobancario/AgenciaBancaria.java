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
public class AgenciaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        

        
        ContaCorrente contaPessoaA = new ContaCorrente(234567,2000,2000);
/*        contaPessoaA.numero = 234567;
        contaPessoaA.saldo = 2000;
        contaPessoaA.limite = 2000; */
        
        Poupanca contaPessoaB = new Poupanca(345678,500);
/*        contaPessoaB.numero = 345678;
        contaPessoaB.saldo = 500;
        contaPessoaB.limite = 5000; */
        
      /*  System.out.println("SALDO CONTA UM: "+ contaUm.getSaldo());
        System.out.println("");
        System.out.println("");
        
        contaUm.sacar(2000, 1000);
        System.out.println("SALDO CONTA UM: "+contaUm.getSaldo());
        System.out.println("");
        System.out.println(""); */

        System.out.println("SALDO PESSOA A: "+ contaPessoaA.getSaldo());
        System.out.println("SALDO PESSOA B: "+ contaPessoaB.getSaldo());
        System.out.println("");
        contaPessoaA.transferir(500, contaPessoaB);
                
        System.out.println("SALDO PESSOA A: "+ contaPessoaA.getSaldo());
        System.out.println("SALDO PESSOA B: "+ contaPessoaB.getSaldo());

    }
    
}
