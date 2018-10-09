package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Panier p = new Panier();
        VueConsole vc = new VueConsole();
        VueGraphique vg = new VueGraphique();
        Controler c = new Controler();
        c.setModele(p);
        c.setVue(vg);
        vg.addControler(c);
        p.addObserver(vc);
        p.addObserver(vg);
        p.ajoute(new Orange("France",0.80));
        p.ajoute(new Orange("Espagne",0.80));
        p.ajoute(new Orange("Floride",0.90));
        p.boycotteOrigine("France");

        
    }
}
