/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author bt479917
 */
public class Controler implements ActionListener {

    VueGraphique vg;
    Panier p;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(((JButton)e.getSource())==vg.plus)
        {
            p.ajoute(new Orange());
        }
        else
        {
            p.retire();
        }
    }
    
    public void setModele(Panier p)
    {
        this.p = p;
    }
    
    public void setVue(VueGraphique vg){
        this.vg = vg;
    }
}
