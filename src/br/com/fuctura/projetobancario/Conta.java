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
public class Conta {
    
    private int numero;
    private double saldo;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;

    
    }

    public boolean sacar (double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return false;
        } else {
            System.out.println("Não há saldo suficiente para o saque");
           return true;
        }
    }


    public boolean sacar (double valor1, double valor2){
        if(valor1 <= this.saldo){
            this.saldo -= valor1;
            return true;
        } else {
            System.out.println("Não há saldo suficiente para o saque de R$"+ valor1+",00, tentaremos sacar R$"+valor2+",00.");
            this.saldo -= valor2; 
           return false;
        }
       
    }
    
    public void depositar(double valor){
        
        this.saldo += valor;
    }
    
    public boolean transferir (double valor, Conta contaDois){
        
        System.out.println("TRANSFERÊNCIA A -> B:");
        System.out.println("Valor selecionado: "+ valor);
        System.out.println("");
        
        if (valor <= this.saldo) {
            
            while(valor <= this.saldo){
                contaDois.saldo += valor;
                this.saldo -= valor;
                System.out.println("Transferência concluída:");
                System.out.println("________________________");
                System.out.println("SALDO Pessoa A: "+ this.saldo);
                System.out.println("SALDO Pessoa B: "+ contaDois.saldo);
                System.out.println("________________________");
            }
            
            System.out.println("Não há saldo disponível.");
            System.out.println("");
            return true;
        } else { 
            System.out.println("Não há saldo disponível."); 
            System.out.println("");
        }   return false;
    }

    
    
}
