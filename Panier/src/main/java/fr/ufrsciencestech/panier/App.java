package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Panier b = new Panier();
        b.ajoute(new Orange("France",0.80));
        b.ajoute(new Orange("Espagne",0.80));
        b.ajoute(new Orange("Floride",0.90));
        b.boycotteOrigine("France");
        System.out.println(b.toString());
    }
}
