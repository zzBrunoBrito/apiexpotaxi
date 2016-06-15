/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.apiexpotaxi;

import javax.persistence.EntityManager;

/**
 *
 * @author leofreitas
 */
public class TesteRun {
    
    public static void main(String[] args) {
        
        Index index = new Index("Leo");
       
        EntityManager manager = FabricaDeConexao.getManager();
        manager.getTransaction().begin();
        
        try {
            manager.persist(index);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
        manager.close();
    }
}
