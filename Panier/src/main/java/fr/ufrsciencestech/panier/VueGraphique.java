/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author bt479917
 */
public class VueGraphique extends JFrame implements Observer {

    private JPanel container = new JPanel(new BorderLayout());
    
    public VueGraphique()
    {
    this.setSize(240, 260);

    this.setTitle("Panier d'orange");

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    this.setResizable(false);

    initComposant();                

    this.setContentPane(container);

    this.setVisible(true);
    }
    
    private void initComposant(){
        JButton plus = new JButton("+");
        JButton moins = new JButton("-");
        container.add(plus,BorderLayout.NORTH);
        container.add(moins,BorderLayout.SOUTH);
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
