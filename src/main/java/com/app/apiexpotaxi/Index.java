package com.app.apiexpotaxi;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */

public class Index{
    
    private Integer id;
    
    private String nome;

    public Index(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Index() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
