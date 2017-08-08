package br.com.metodista.bo;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Icaro
 */
public class Teste implements Serializable {

    private String nome;
    private double decimal;
    private int codigo;
    private int numero;

    public Teste(String nome, double decimal, int codigo, int numero) {
        this.nome = nome;
        this.decimal = decimal;
        this.codigo = codigo;
        this.numero = numero;
    }

    public Teste() {

    }

    public Teste(String nome) {
        this.nome = nome;
    }

    public Teste(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getDecimal() {
        return decimal;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

}
