package co.edu.Polinomios.Controlador;

import co.edu.Polinomios.Modelo.NodoDoble;
import co.edu.Polinomios.Modelo.Polinomio;
import jdk.nashorn.internal.parser.TokenType;

public class Controlador 
{
    private Polinomio polinomio1;
    private Polinomio polinomio2;
    private Polinomio resultado;
    
    public Controlador()
    {
        polinomio1 = new Polinomio();
        polinomio2 = new Polinomio();
    }
    
    public void crearPolinomio1(String polinomio)
    {
        this.polinomio1 = new Polinomio(polinomio);
        polinomio1.recorreIzqDer();
        System.out.println("");
        this.polinomio1 = polinomio1.ordernar();
        this.polinomio1 = polinomio1.minimizar();
    }
    
    public String imprimePolinomio(Integer elegido)
    {
        Polinomio polinomio;
        String sPolinomio = "";
        String d = "";
        String pot = "";
        if(elegido==0)
        {
            polinomio = polinomio1;
        }
        else if(elegido==1)
        {
            polinomio = polinomio2;
        }
        else
        {
            polinomio = resultado;
        }
        NodoDoble p = polinomio.primerNodo();
        double m=(double) p.retornaDigito();
        while(!polinomio.finDeRecorrido(p))
        {
            if(m>0)
            {
                if(p.retornaPotencia()==polinomio.primerNodo().retornaPotencia())
                {
                    if((double)p.retornaDigito()==1)
                    {
                        d="";
                    }
                    else
                    {
                        d=""+p.retornaDigito();
                    }
                }
                else
                {
                    d ="+"+p.retornaDigito();
                }
            }
            else if((Double)p.retornaDigito()==1 && (Integer)p.retornaPotencia()>0)
            {
                d="";
            }
            else if((Double)p.retornaDigito()==1 && (Integer)p.retornaPotencia()<0)
            {
                d="-";
            }
            else if((Double)p.retornaDigito()==0)
            {
                d="";
            }
            else
            {
                d =""+p.retornaDigito();
            }
            if ((Integer)p.retornaPotencia()>0)
            {
                pot = "x^"+p.retornaPotencia();
            }
            else
            {
                pot = "";
            }
            sPolinomio = sPolinomio+""+d+""+pot;
            p = p.retornaLd();
        }
        return sPolinomio;
    }
    
    public void crearPolinomio2(String polinomio)
    {
        this.polinomio2 = new Polinomio(polinomio);
        this.polinomio2 = polinomio2.ordernar();
        this.polinomio2 = polinomio2.minimizar();        
    }
    
    public void sumar()
    {
        resultado = polinomio1.suma(polinomio2);
        resultado.recorreIzqDer();
    }
    
    public void multiplicar()
    {
        resultado = polinomio1.multiplicar(polinomio2);
        resultado.recorreIzqDer();
    }
    
    public void derivar(int x){
        
        if (x==0) {
            polinomio1.derivada(polinomio1);
        } else if(x==1){
            polinomio2.derivada(polinomio2);
        }
        
        
    
    }
    
    public double evaluarP(float a, int x){
        
        double n=0;
        if (x==0) {
           n= polinomio1.evaluar(a);
        } else if(x==1){
            n= polinomio2.evaluar(a);
        }
        
        
        return n;
    }
    
    public void integral(int x){
        if (x==0) {
            polinomio1.integral();
        } else if(x==1){
            polinomio2.integral();
        }
    }
    
    public void borrar(int x){
        if (x==0) {
            polinomio1.borrarP();
        } else if(x==1){
            polinomio2.borrarP();
        }
        
    }
    
    public String factor(){
        String respuesta=polinomio1.esFactor(polinomio1,polinomio2);
        return respuesta;
    }
    
    public void nderivada(int x, int n){
        
        if (x==0) {
            polinomio1.nderivar(polinomio1,n);
        } else if(x==1){
            polinomio2.nderivar(polinomio2,n);
        }
        
        
    
    }
    
    
}
