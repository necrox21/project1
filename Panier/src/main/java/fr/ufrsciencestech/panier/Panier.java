/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author bt479917
 */
public class Panier {
    int tailleMax;
    ArrayList<Orange> tabOrange;
    
    public Panier(){
        tailleMax = 10;
        tabOrange = new <Orange>ArrayList();
    }

    public Panier(int taille){
        tailleMax = taille;
    }

    public boolean estPlein(){
        return (tabOrange.size() == tailleMax);
    }
    
    public boolean estVide(){
        return tabOrange.isEmpty();
    }
    
    public int ajoute(Orange o)
    {
        tabOrange.add(o);
        return 0;
    }
    
    public int retire()
    {
        tabOrange.remove(tabOrange.size()-1);
        return 0;
    }
    
    public double getPrix()
    {
        double res = 0.0;
        for(Orange o : tabOrange)
        {
            res += o.getPrix();
        }
        return res;
    }
    
    public int boycotteOrigine(String s)
    {
        ArrayList<int> tmp = new <int>ArrayList();
        for(Orange o:tabOrange)
        {
            if(o.getOrigine().equals(s))
                tabOrange.remove(o);
        }
        return 0;
    }

    @Override
    public String toString() {
        String s =  "Panier{" + "tailleMax=" + tailleMax+"\n" ;
            for(int i=0 ; i<tabOrange.size();i++)
            {
                s+=tabOrange.get(i).toString()+"\n";
            
            }
        return s;
    }

    protected final boolean equals(Panier p)
    { 
        boolean res = false;
        if(this.tailleMax==p.tailleMax)
            res = true;
        return ( res && this.tabOrange.equals(p.tabOrange) );
    }

}
