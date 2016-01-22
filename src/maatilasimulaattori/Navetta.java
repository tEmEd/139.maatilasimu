/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatilasimulaattori;

import java.util.*;
/**
 *
 * @author Teemu
 */
public class Navetta {
    
    private Maitosailio sailio;
    private Lypsyrobotti robotti;
    
    public Navetta(Maitosailio maitosailio) {
        this.sailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio() {
        return this.sailio;
    }
  
    public void asennaLypsyrobotti(Lypsyrobotti robotti) {
        robotti.setMaitosailio(this.sailio);
        this.robotti = robotti;
    }

    public void hoida(Lehma lehma) {
        this.tarkistus();
        
        this.robotti.lypsa(lehma);
    }

    private void tarkistus() {
        if(this.robotti == null) throw new IllegalStateException();
    }

    public void hoida(Collection<Lehma> lehmat) {
        this.tarkistus();
        
        for(Lehma x : lehmat) {
        this.robotti.lypsa(x);
    }
    }

    @Override
    public String toString() {
        return this.sailio.toString();
    }

}
