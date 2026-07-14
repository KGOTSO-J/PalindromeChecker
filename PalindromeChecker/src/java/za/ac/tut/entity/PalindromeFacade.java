/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonas
 */
@Stateless
public class PalindromeFacade extends AbstractFacade<Palindrome> implements PalindromeFacadeLocal {

    @PersistenceContext(unitName = "PalindromeCheckerEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PalindromeFacade() {
        super(Palindrome.class);
    }
    
}
