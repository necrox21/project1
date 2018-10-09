/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author bt479917
 */
public class Panier extends Observable {
    int tailleMax;
    ArrayList<Orange> tabOrange;
    
    public Panier(){
        tailleMax = 10;
        tabOrange = new <Orange>ArrayList();
    }

    public Panier(int taille){
        tailleMax = taille;
        tabOrange = new <Orange>ArrayList();
    }

    public boolean estPlein(){
        return (tabOrange.size() == tailleMax);
    }
    
    public boolean estVide(){
        return tabOrange.isEmpty();
    }
    
    public int ajoute(Orange o)
    {
        if(tabOrange.size()<tailleMax){
            tabOrange.add(o);
        setChanged();
        notifyObservers("ajout d'une orange "+o.getOrigine()+" "+o.getPrix());
        }
        return 0;
    }
    
    public int retire()
    {
        if(tabOrange.size()>0)
        {
            tabOrange.remove(tabOrange.size()-1);
        setChanged();
        notifyObservers("supression de la derniere orange ");
        }
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
        ArrayList tmp=new ArrayList();
        for(Orange o:tabOrange)
        {
            if(o.getOrigine().equals(s))
                tmp.add(o);
        }
        for(Object a : tmp)
        {
            tabOrange.remove(a);
        }
        setChanged();
        notifyObservers("boycotteOrigine"+" "+s);
        return 0;
    }

    @Override
    public String toString() {
        String s =  "Panier{" + "tailleMax=" + tailleMax+"\n" ;
            for(int i=0 ; i<tabOrange.size();i++)
            {
                s+=tabOrange.get(i).toString()+"\n";
            
            }
            s+="}";
        return s;
    }

    protected final boolean equals(Panier p)
    { 
        boolean res = false;
            if(p!=null)
            {
                if(this.tailleMax==p.tailleMax)
                    res = true;
                return ( res && this.tabOrange.equals(p.tabOrange) );
    
            }
            return res;
    }

}
