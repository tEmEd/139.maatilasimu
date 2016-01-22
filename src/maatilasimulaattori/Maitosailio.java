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
public class Maitosailio {

    private double tilavuus;
    private  double saldo = 0;
    
    public Maitosailio() {
        this.tilavuus = 2000;
    }
    
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }

    public double getTilavuus() {
        return this.tilavuus;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double paljonkoTilaaJaljella() {
        return this.tilavuus-this.saldo;
        
    }

    public void lisaaSailioon(double maara) {
        this.saldo +=maara;
        if(this.saldo > this.tilavuus) this.saldo = this.tilavuus;
    }

    public double otaSailiosta(double maara) {
        if(maara > this.saldo) {
            double ota = this.saldo;
            this.saldo = 0.0;
            return ota;
        }
        
        this.saldo -= maara;
        return maara;
        
    }

    @Override
    public String toString() {
        return String.format("%.1f/%.1f", Math.ceil(saldo), Math.ceil(this.tilavuus));
    }
}
