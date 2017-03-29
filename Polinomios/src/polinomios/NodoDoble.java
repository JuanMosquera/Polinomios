/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilera;

/**
 *
 * @author jfwc1
 */
public class NodoDoble 
{
    private NodoDoble Li, Ld;
    private Object dato;
    
    NodoDoble(Object d)
    {
        Li = null;
        Ld = null;
        dato = d;
    }

    public NodoDoble retornaLi() {
        return Li;
    }

    public void asignaLi(NodoDoble x) {
        Li = x;
    }

    public NodoDoble retornaLd() {
        return Ld;
    }

    public void asignaLd(NodoDoble x) {
        Ld = x;
    }

    public Object retornaDato() {
        return dato;
    }

    public void asignaDato(Object d) {
        dato = d;
    }   
}

