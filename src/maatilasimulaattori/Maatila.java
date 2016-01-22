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
public class Maatila implements Eleleva{
    
    private final String omistaja;
    private final Navetta navetta;
    
    private Collection<Lehma> lehmat = new ArrayList<Lehma>();
    
    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
    }
    
    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }
    
    public void hoidaLehmat() {
        this.navetta.hoida(lehmat);
    }
    
    public String getOmistaja() {
        return this.omistaja;
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robotti) {
        this.navetta.asennaLypsyrobotti(robotti);
    }
    
    @Override
    public String toString() {
        String line = "Maatilan omistaja: " + this.omistaja;
        line += "\nNavetan maitosäiliö: " + this.navetta.getMaitosailio().toString();
        line += "\nLehmät:";
        for(Lehma lehma : this.lehmat) {
            line += "\n        " + lehma.toString();
        }
        
        return line;
    }
    
    @Override
    public void eleleTunti() {
        for(Lehma lehma : this.lehmat) {
            lehma.eleleTunti();
        }
    }
}
