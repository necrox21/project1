/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.*;
import java.lang.*;

/**
 *
 * @author bt479917
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(){
        prix = 0.0;
        origine = "Inconnue";
    }
    
    public Orange(String o,double p){
        if(p>0.0)
        prix=p;
        else throw new IllegalArgumentException("error message");
        origine=o;
    }

    public double getPrix() {
        return prix;
    }

    public String getOrigine() {
        return origine;
    }

    @Override
    public String toString() {
        return "Orange{" + "prix=" + prix + ", origine=" + origine + '}';
    }
    
    public boolean equals(Orange o)
    {
        boolean res = false;
        if(o!=null)
        {
            if(this.prix==o.prix)
                res = true;
            return(this.origine.equals(o.origine) && res);
        }
        return res;
    }
}
