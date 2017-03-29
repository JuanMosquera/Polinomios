/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomios;

/**
 *probando
 * @author jfwc1
 */

public class ListaDoblementeLigada{
    
    private NodoDoble primero, ultimo;
    
    public ListaDoblementeLigada()//Constructor de la clase ListaDoblementeLigada
    {
        primero = null;
        ultimo = null;
    }
    
    public NodoDoble primerNodo()//Retorna el primer Nodo de la Lista
    {
        return primero;
    }
    
    public NodoDoble ultimoNodo()//Retorna el último Nodo de la Lista
    {
        return ultimo;
    }
    
    public boolean finDeRecorrido(NodoDoble x) //Devuelve verdadero si el nodo ingresado es igual a nulo
    {
        return x==null;
    }
    
    public boolean esVacia() //Verifica si la lista no tiene ningún dato
    {
        return primero==null;
    }
    
    public void  recorreIzqDer()//Recorre la lista por sus Ligas derechas
    {
        NodoDoble p;
        p = primerNodo();
        if(!esVacia())
        {
            while(!finDeRecorrido(p))
            {
                System.out.println(p.retornaSigno());
                System.out.println(p.retornaDigito());
                System.out.println("X");
                System.out.println(p.retornaPotencia());
                p = p.retornaLd();
            }
        }
        else
        {
            System.out.println("La lista está vacía");
        }
    }
    
    public void recorreDerIzq()//Recorre la lista por sus ligas izquierdas
    {
        NodoDoble p;
        p = ultimoNodo();
        while(!finDeRecorrido(p))
        {
            System.out.println(p.retornaSigno());
            System.out.println(p.retornaDigito());
            System.out.println("X");
            System.out.println(p.retornaPotencia());
            p = p.retornaLi();
        }
    }
    
    public NodoDoble buscaDondeInsertar(Object d)
    {
        NodoDoble p, y;
        p = primerNodo();
        y = p.retornaLi();
        while(!finDeRecorrido(p) && (char)p.retornaDato()<(char)d)
        {
            y = p;
            p = p.retornaLd();
        }
        return y;
    }
    
    public void insertar(Object s, Object d, Object p, NodoDoble y) //Inserta un nuevo nodo con objecto d
    {
        NodoDoble x;
        x = new NodoDoble(s, d, p);
        conectar(x,y);
    }
    
    public void conectar(NodoDoble x, NodoDoble y) //Conecta el nodo X con el nodo Y
    {
       if(y==null)
       {
           x.asignaLd(primero);
           if(primero!=null)
           {
               primero.asignaLi(x);
           }
           else
           {
               ultimo = x;
           }
           primero = x;
       }
       else if(y.retornaLd()==null)
       {
           y.asignaLd(x);
           x.asignaLi(y);
           ultimo = x;
       }
       else
       {
           x.asignaLd(y.retornaLd());
           x.asignaLi(y);
           x.retornaLd().asignaLi(x);
           y.asignaLd(x);
       }
    }
    
    public void desconectar(NodoDoble x)//Desconecta el nodo X de la lista
    {
        if(x.retornaLi()==null)
        {
            primero = x.retornaLd();
            if(primero == null)
            {
                ultimo = null;
            }
            else
            {
                primero.asignaLi(null);
            }
        }
        else if(x.retornaLd()==null)
        {
            ultimo = x.retornaLi();
            ultimo.asignaLd(null);
        }
        else
        {
            x.retornaLd().asignaLi(x.retornaLi());
            x.retornaLi().asignaLd(x.retornaLd());
        }
    }
    
    public void borrar(NodoDoble x) //Busca el nodo X en la lista y lo desconecta
    {
        if(x==null)
        {
            System.out.println("Dato a borrar no existe.");
            return;
        }
        desconectar(x);
    }
}

