package hilera;
/**
 *
 * @author marioh.ramirez
 */
public class Hilera extends ListaDoblementeLigada 
{      
    public Hilera(){}//Constructor de la clase Hilera
    
    public void construirHilera(String hilera)
    {
        char letra;
        letra = hilera.charAt(0);
        insertar(letra,null);
        NodoDoble p = primerNodo();
        for(int i=1;i<hilera.length();i++) //Pasa el String a char y construye la hilera representada como Lista Doblemente Ligada
        {
            letra = hilera.charAt(i);
            insertar(letra, p);
            p = p.retornaLd();
        }
    }
    
    public int longitud() //Retorna la longitud de la hilera
    {
        NodoDoble p;
        p = primerNodo();
        int i = 0;
        while(!finDeRecorrido(p))
        {
           i=i+1;
           p = p.retornaLd();
        }
        return i;
    }
    
    public boolean anagrama(Hilera s)
    {
        int i;
        NodoDoble k;
        Hilera aux, car;
        if(longitud()!= s.longitud())
        {
            return false;
        }
        aux = copiaHilera();
        i = 1;
        car = subHilera(i,1);
        k = aux.posicion(car);
        while(i<=longitud() && k!=null)
        {
            aux.borrar(k);
            i = i+1;
            if(i>longitud())
            {
                break;
            }
            car = subHilera(i,1);
            k = aux.posicion(car); 
        }
        return i>longitud();//Retorna verdadero si i es mayor que la longitud de la hilera que llama el método, de lo contrario retorna falso
    }
    
    public Hilera subHilera(int i, int j)//Devuelve una hilera desde la posición i de la hilera original y toma j caracteres
    {
        int k, n;
        Hilera s;
        NodoDoble p;
        n = longitud();
        if(i<1 || i>n)
        {
            System.out.println("Parámetro inválido");
            return null;
        }
        if(j<1 || j>n-i+1)
        {
            System.out.println("Parámetro inválido");
            return null;
        }
        p = primerNodo();
        k = 1;
        while(k<i)
        {
            p = p.retornaLd();
            k = k+1;
        }
        k = 2;
        s = new Hilera();
        s.insertar(p.retornaDato(), null);
        p = p.retornaLd();
        while(k<=j)
        {
            s.insertar(p.retornaDato(), s.ultimoNodo());
            p = p.retornaLd();
            k = k+1;
        }
        return s;
    }
    
    public Hilera concat(Hilera s)//Concatena la hilera que llame al método co´n la hilera t que se envia como parametro
    {
        Hilera t;
        NodoDoble p;
        t = copiaHilera();
        p = s.primerNodo();
        while(!s.finDeRecorrido(p))
        {
           t.insertar(p.retornaDato(), t.ultimoNodo());
           p = p.retornaLd();
        }
        return t;
    }
    
    public Hilera copiaHilera()//Copia la hilera que invoque el método en otra hilera
    {
        Hilera s;
        NodoDoble p;
        p = primerNodo();
        s = new Hilera();
        s.insertar(p.retornaDato(), null);
        p = p.retornaLd();
        while(!finDeRecorrido(p))
        {
            s.insertar(p.retornaDato(), s.ultimoNodo());
            p = p.retornaLd();
        }
        return s;
    }     
    
    public void borrarHilera(int i, int j)//Borra parcial o totalmente una hilera
    {
        int k, n;
        n = longitud();
        if(i<1 || i>n)
        {
            System.out.println("Parámetro inválido");
            return;
        }
        if(j<1 || j>n-i+1)
        {
            System.out.println("Parámetro inválido");
            return;
        }
        NodoDoble p;
        p = primerNodo();
        k = 1;
        while(k<i)
        {
            p = p.retornaLd();
            k = k+1;
        }
        k = 0;
        while(k<j)
        {
            desconectar(p);
            p = p.retornaLd();
            k=k+1;
        }
    }
    
    public NodoDoble posicion(Hilera s)//Devuelve el nodo en el cuál comience la hilera que se ingresa como parámetro, dentro de otra hilera
    {
        NodoDoble p, pp, q;
        p = primerNodo();
        pp = p;
        q = s.primerNodo();
        while(!finDeRecorrido(p) && !s.finDeRecorrido(q))
        {
            if(p.retornaDato()==q.retornaDato())
            {
                p = p.retornaLd();
                q = q.retornaLd();
                if(s.finDeRecorrido(q))
                {
                    return pp;
                }
            }
            else
            {
                pp = pp.retornaLd();
                p = pp;
                q = s.primerNodo();
            }
        }
        return null;        
    }
    
     public int posicionInt(NodoDoble s)//Devuelve el nodo en el cuál comience la hilera que se ingresa como parámetro, dentro de otra hilera
    {
        NodoDoble p;
        p = primerNodo();
        int i=0;
         while(p!=s)
        {
           i++;
           p = p.retornaLd();
        }
        return i;
              
    }
    
    public boolean esSubstring(Hilera b)
    {
        return posicion(b)!=null;
    }
    
    public void replace(String hilera)            
    {
        borrarHilera(1,longitud());
        construirHilera(hilera);
    }
    
    public boolean esPalindromo() //Devuelve verdadero si la hilera es un palindromo
    {
        NodoDoble p,q;
        int i, j;
        i = 1;
        j = longitud();
        p = primerNodo();
        q = ultimoNodo();
        while(i<j && p.retornaDato().equals(q.retornaDato()))
        {
            p = p.retornaLd();
            q = q.retornaLi();
            i = i+1;
            j = j-1;
        }
        return i >= j;
    }
    
    public Hilera invertirHilera() //Devuelve una hilera invertida de la hilera original
    {
        Hilera s;
        NodoDoble p, q;
        p = ultimoNodo();
        s = new Hilera();
        s.insertar(p.retornaDato(), null);
        p = p.retornaLi();
        q = s.primerNodo();
        while(!finDeRecorrido(p))
        {
            s.insertar(p.retornaDato(), q);
            p = p.retornaLi();
            q = q.retornaLd();
        }
        return s;
    }
    
    public Hilera ordernarAlfabeticamente() //Devulve la hilera original ordenada alfábeticamente
    {
        Hilera s;
        NodoDoble p,y;
        p = primerNodo();
        s = new Hilera();
        s.insertar(p.retornaDato(), null);
        p = p.retornaLd();
        while(longitud() != s.longitud()) //Ciclo en donde se insertan los datos en orden alfabetico en una nueva hilera
        {
            y = s.buscaDondeInsertar(p.retornaDato());
            s.insertar(p.retornaDato(), y);
            p = p.retornaLd();
        }
        return s; //Retorna la nueva hilera en orden alfabetico
    }
            
}
