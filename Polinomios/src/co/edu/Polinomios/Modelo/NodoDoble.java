package co.edu.Polinomios.Modelo;

public class NodoDoble 
{
    private NodoDoble Li, Ld;
    private Object digito, signo, potencia;
    
    NodoDoble(Object s, Object d, Object p)
    {
        Li = null;
        Ld = null;
        signo = s;
        digito = d;
        potencia = p;
    }

    public NodoDoble retornaLi() 
    {
        return Li;
    }

    public void asignaLi(NodoDoble x) 
    {
        Li = x;
    }

    public NodoDoble retornaLd() 
    {
        return Ld;
    }

    public void asignaLd(NodoDoble x) 
    {
        Ld = x;
    }

    public Object retornaDigito() 
    {
        return digito;
    }

    public void asignaDigito(Object d) 
    {
        digito = d;
    }
    
    public Object retornaSigno() 
    {
        return signo;
    }

    public void asignaSigno(Object s) 
    {
        signo = s;
    } 
    
    public Object retornaPotencia() 
    {
        return potencia;
    }

    public void asignaPotencia(Object p) 
    {
        potencia = p;
    }   
}

