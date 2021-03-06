package co.edu.Polinomios.Modelo;

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
                System.out.print(p.retornaDigito());
                if((int)p.retornaPotencia()!=0)
                {
                    System.out.print("x^");
                    System.out.print(p.retornaPotencia());
                }
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
        while(!finDeRecorrido(p) && (int)p.retornaPotencia()>(int)d)
        {
            y = p;
            p = p.retornaLd();
        }
        return y;
    }
    
    public NodoDoble buscaDondeInsertar(NodoDoble d)
    {
        NodoDoble p, y;
        
        p = primerNodo();
        y = p.retornaLi();
        
        while(!finDeRecorrido(p) && (int)p.retornaPotencia()>(int)d.retornaPotencia() )
        {
            y = p;
            p = p.retornaLd();
        }
        return y;
    }
    
    
    public void insertarN(NodoDoble x){
        NodoDoble y;
        y = buscaDondeInsertar(x);
        conectar(x,y);
    }
    
    public void insertar(Object d, Object p, NodoDoble y) //Inserta un nuevo nodo con objecto d
    {
        NodoDoble x;
        x = new NodoDoble(d, p);
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

