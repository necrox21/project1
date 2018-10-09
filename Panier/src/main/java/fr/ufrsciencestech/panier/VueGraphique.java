/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author bt479917
 */
public class VueGraphique extends JFrame implements Observer {

    private JPanel container = new JPanel(new BorderLayout());
    public JButton plus = new JButton("+");
    public JButton moins = new JButton("-");
    private JLabel info = new JLabel("0");
    public VueGraphique()
    {
    this.setSize(240, 260);

    this.setTitle("Panier d'orange");

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLocationRelativeTo(null);

    this.setResizable(false);
    initComposant();                

    this.setContentPane(container);
    
    this.addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });
    
    //this.pack();
    this.setVisible(true);
    }
    
    public void addControler(Controler c)
    {
        plus.addActionListener(c);
        moins.addActionListener(c);
    }
    
    private void initComposant(){

        info.setHorizontalAlignment(SwingConstants.CENTER);
        info.setVerticalAlignment(SwingConstants.CENTER);

        container.add(plus,BorderLayout.NORTH);
        container.add(moins,BorderLayout.SOUTH);
        container.add(info,BorderLayout.CENTER);
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        this.info.setText(String.valueOf(((Panier)o).tabOrange.size()));
    }
    
}
