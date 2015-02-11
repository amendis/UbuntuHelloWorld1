/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.ejb.Stateless;

/**
 *
 * @author akila
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    @Override
    public String helloworld() {
        //return null;
        return "Hello, world.";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
