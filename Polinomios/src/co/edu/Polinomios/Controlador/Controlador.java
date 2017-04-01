package co.edu.Polinomios.Controlador;

import co.edu.Polinomios.Modelo.Polinomio;

public class Controlador 
{
    private Polinomio polinomio;
    
    public Controlador()
    {
        polinomio = new Polinomio();
    }
    
    public void crearPolinomio(String polinomio)
    {
        this.polinomio = new Polinomio(polinomio);
    }
}
