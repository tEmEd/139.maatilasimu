/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

/**
 *
 * @author Teemu
 */
public class Lypsyrobotti {

    private Maitosailio sailio;

    public Lypsyrobotti() {

    }

    public Maitosailio getMaitosailio() {
        return this.sailio;
    }

    public void setMaitosailio(Maitosailio sailio) {
        this.sailio = sailio;
    }

    public void lypsa(Lypsava lypsava) {
        if(this.sailio == null) 
            throw new IllegalStateException();
            
        this.sailio.lisaaSailioon(lypsava.lypsa());        
        
    }
}
