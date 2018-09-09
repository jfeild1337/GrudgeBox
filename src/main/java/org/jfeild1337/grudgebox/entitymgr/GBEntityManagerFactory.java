/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jfeild1337.grudgebox.entitymgr;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * 
 */
public class GBEntityManagerFactory {
    public static final String PERSISTENCE_UNIT_NAME = "grudgeboxPersistenceUnit";
    
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManagerFactory getEntityManagerFactory() {
        return FACTORY;
    }
    
    
    
}
