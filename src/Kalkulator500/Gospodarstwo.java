/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator500;

/**
 *
 * @author T530a
 */
public class Gospodarstwo {
    private int dzieci;
    private double sumaDochodow;
    private int sumaDoroslych;
    private boolean dNiepelnosprawne;
    
    public Gospodarstwo(int dzieci, double sumaDochodow, int sumaDoroslych, boolean dNiepelnosprawne) {
        this.dzieci = dzieci;
        this.sumaDochodow = sumaDochodow;
        this.sumaDoroslych = sumaDoroslych;
        this.dNiepelnosprawne = dNiepelnosprawne;
    }
    private double srednieDochody() {
        return sumaDochodow/(dzieci+sumaDoroslych);
    }
    public double wyliczenie() {
        if(dNiepelnosprawne == true && srednieDochody() <= 1200.00) {
            return dzieci*500;
        }
        else if(dNiepelnosprawne == false && srednieDochody() <= 800.00) {
            return dzieci*500;
        }
        else
            return (dzieci-1)*500;
        
    }
    
}
