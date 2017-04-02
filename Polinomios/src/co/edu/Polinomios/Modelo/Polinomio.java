package co.edu.Polinomios.Modelo;
/**
 *
 * @author marioh.ramirez
 */
public class Polinomio extends ListaDoblementeLigada 
{      
    public Polinomio()
    {
        double d = 0;
        int p = 0;
        insertar(d, p, null);
    }
    
    public Polinomio(String polinomio)
    {
        String[] letras;
        double d;
        int p;
        letras = separarPolinomio(polinomio);
        if(letras[0].equals(""))
        {
            d = 1;
        }
        else
        {
            d = Double.parseDouble(letras[0]);
        }
        p = Integer.parseInt(letras[1]);
        insertar(d, p, null);
        NodoDoble nodo = primerNodo();
        for(int i=2;i<letras.length;i++)
        {
            if(letras[i].equals("+"))
            {
                d = 1;
            }
            else if(letras[i].equals("-"))
            {
                d = -1;
            }
            else
            {
                d = Double.parseDouble(letras[i]);               
            }
            i = i+1;
            if(i==letras.length)
            {
                break;
            }                
            else
            {
                p = Integer.parseInt(letras[i]);
            }
            insertar(d, p, nodo);
            nodo = nodo.retornaLd();
        }
    }
    
    public String[] separarPolinomio(String polinomio)
    {
        String[] letras;
        int c;
        int j;
        polinomio = polinomio.toLowerCase();
        polinomio = polinomio.replace("  ", "");
        polinomio = polinomio.replace(" ", "");
        polinomio = polinomio.replace("+", " +");
        polinomio = polinomio.replace("-", " -");
        String[] fracciones = polinomio.split(" ");
        c=(fracciones.length)*2;
        letras= new String[c];
        j =0;
        if (fracciones[0].equals(""))
        {
            for (int i=1;i<fracciones.length;i++) 
            {
               String[] digito = fracciones[i].split("x");
               if (digito.length==2) 
               {
                    letras[j]=digito[0];
                    j++;
                    letras[j]=digito[1];
                    j++;
               } 
               else if(digito.length==1) 
               {
                   letras[j]=digito[0];
                   j++;
                   if (fracciones[i].indexOf("x")==(-1))
                   {
                       letras[j]="0";
                       j++;
                   } 
                   else
                   {
                       letras[j]="1";
                       j++;
                   }
               }
               else
               {
                   letras[j]="1";
                   j++;
                   letras[j]="1";
                   j++;
               }  
            }
        } 
        else
        {
            for (int i=0;i<fracciones.length;i++) 
            {
               String[] digito = fracciones[i].split("x");
               if (digito.length==2) 
               {
                    letras[j]=digito[0];
                    j++;
                    letras[j]=digito[1];
                    j++;
               } 
               else if(digito.length==1) 
               {
                   letras[j]=digito[0];
                   j++;
                   if (fracciones[i].indexOf("x")==(-1)) 
                   {
                       letras[j]="0";
                       j++;
                   } 
                   else
                   {
                       letras[j]="1";
                       j++;
                   }
               }
               else
               {
                   letras[j]="1";
                   j++;
                   letras[j]="1";
                   j++;
               }
            }
        }
         return letras;
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
    
//    
//    public Polinomio subHilera(int i, int j)//Devuelve una hilera desde la posición i de la hilera original y toma j caracteres
//    {
//        int k, n;
//        Polinomio s;
//        NodoDoble p;
//        n = longitud();
//        if(i<1 || i>n)
//        {
//            System.out.println("Parámetro inválido");
//            return null;
//        }
//        if(j<1 || j>n-i+1)
//        {
//            System.out.println("Parámetro inválido");
//            return null;
//        }
//        p = primerNodo();
//        k = 1;
//        while(k<i)
//        {
//            p = p.retornaLd();
//            k = k+1;
//        }
//        k = 2;
//        s = new Polinomio();
//        s.insertar(p.retornaDato(), null);
//        p = p.retornaLd();
//        while(k<=j)
//        {
//            s.insertar(p.retornaDato(), s.ultimoNodo());
//            p = p.retornaLd();
//            k = k+1;
//        }
//        return s;
//    }
//    
//    public Polinomio concat(Polinomio s)//Concatena la hilera que llame al método co´n la hilera t que se envia como parametro
//    {
//        Polinomio t;
//        NodoDoble p;
//        t = copiaHilera();
//        p = s.primerNodo();
//        while(!s.finDeRecorrido(p))
//        {
//           t.insertar(p.retornaDato(), t.ultimoNodo());
//           p = p.retornaLd();
//        }
//        return t;
//    }
//    
//    public Polinomio copiaHilera()//Copia la hilera que invoque el método en otra hilera
//    {
//        Polinomio s;
//        NodoDoble p;
//        p = primerNodo();
//        s = new Polinomio();
//        s.insertar(p.retornaDato(), null);
//        p = p.retornaLd();
//        while(!finDeRecorrido(p))
//        {
//            s.insertar(p.retornaDato(), s.ultimoNodo());
//            p = p.retornaLd();
//        }
//        return s;
//    }     
//    
//    public void borrarHilera(int i, int j)//Borra parcial o totalmente una hilera
//    {
//        int k, n;
//        n = longitud();
//        if(i<1 || i>n)
//        {
//            System.out.println("Parámetro inválido");
//            return;
//        }
//        if(j<1 || j>n-i+1)
//        {
//            System.out.println("Parámetro inválido");
//            return;
//        }
//        NodoDoble p;
//        p = primerNodo();
//        k = 1;
//        while(k<i)
//        {
//            p = p.retornaLd();
//            k = k+1;
//        }
//        k = 0;
//        while(k<j)
//        {
//            desconectar(p);
//            p = p.retornaLd();
//            k=k+1;
//        }
//    }
//    
//    public NodoDoble posicion(Polinomio s)//Devuelve el nodo en el cuál comience la hilera que se ingresa como parámetro, dentro de otra hilera
//    {
//        NodoDoble p, pp, q;
//        p = primerNodo();
//        pp = p;
//        q = s.primerNodo();
//        while(!finDeRecorrido(p) && !s.finDeRecorrido(q))
//        {
//            if(p.retornaDato()==q.retornaDato())
//            {
//                p = p.retornaLd();
//                q = q.retornaLd();
//                if(s.finDeRecorrido(q))
//                {
//                    return pp;
//                }
//            }
//            else
//            {
//                pp = pp.retornaLd();
//                p = pp;
//                q = s.primerNodo();
//            }
//        }
//        return null;        
//    }
//    
//     public int posicionInt(NodoDoble s)//Devuelve el nodo en el cuál comience la hilera que se ingresa como parámetro, dentro de otra hilera
//    {
//        NodoDoble p;
//        p = primerNodo();
//        int i=0;
//         while(p!=s)
//        {
//           i++;
//           p = p.retornaLd();
//        }
//        return i;
//              
//    }
//    
//    public boolean esSubstring(Polinomio b)
//    {
//        return posicion(b)!=null;
//    }
//    
//    public void replace(String hilera)            
//    {
//        borrarHilera(1,longitud());
//        construirHilera(hilera);
//    }
//    
//    public boolean esPalindromo() //Devuelve verdadero si la hilera es un palindromo
//    {
//        NodoDoble p,q;
//        int i, j;
//        i = 1;
//        j = longitud();
//        p = primerNodo();
//        q = ultimoNodo();
//        while(i<j && p.retornaDato().equals(q.retornaDato()))
//        {
//            p = p.retornaLd();
//            q = q.retornaLi();
//            i = i+1;
//            j = j-1;
//        }
//        return i >= j;
//    }
//    
//    public Polinomio invertirHilera() //Devuelve una hilera invertida de la hilera original
//    {
//        Polinomio s;
//        NodoDoble p, q;
//        p = ultimoNodo();
//        s = new Polinomio();
//        s.insertar(p.retornaDato(), null);
//        p = p.retornaLi();
//        q = s.primerNodo();
//        while(!finDeRecorrido(p))
//        {
//            s.insertar(p.retornaDato(), q);
//            p = p.retornaLi();
//            q = q.retornaLd();
//        }
//        return s;
//    }
//    
    public Polinomio ordernar() //Devulve la hilera original ordenada alfábeticamente
    {
        Polinomio s;
        NodoDoble p,y;
        p = primerNodo();
        s = new Polinomio();        
        s.insertar(p.retornaDigito(), p.retornaPotencia(), null);
        p = p.retornaLd();
        while(longitud()+1 != s.longitud())
        {
            y = s.buscaDondeInsertar(p.retornaPotencia());
            s.insertar(p.retornaDigito(),p.retornaPotencia(), y);
            p = p.retornaLd();
        }
        return s; //Retorna la nueva hilera en orden alfabetico
    }
    
    public Polinomio minimizar()
    {
        Polinomio s;
        NodoDoble m,n,o;
        double d;
        int p;
        n = primerNodo();
        s = new Polinomio();
        m = primerNodo();
        p = (Integer)m.retornaPotencia()+1;
        o = s.primerNodo();
        while(m!=null)
        {
            while((Integer)m.retornaPotencia()!=p)
            {
                m = m.retornaLd();
                if(m==null)
                {
                    p = p-1;
                    m = primerNodo();
                }
                if(p<0)
                {
                    break;
                }
            }
            if(p<0)
            {
                break;
            }
            d = (Double)m.retornaDigito();
            n = m.retornaLd();            
            while(n!=null)
            {
                if((Integer)n.retornaPotencia()==p)
                {
                    d = d+(Double)n.retornaDigito();
                }
                n = n.retornaLd();
            }
            o = s.buscaDondeInsertar(p);                      
            s.insertar(d, p, o);
            d = 0;
            m = m.retornaLd();
            p = p -1;
        }
        s.recorreIzqDer();
        System.out.println("");
        return s; 
    }
          
    //ninguno de los siguiente metodos son definitivos solo son un primer acercamiento
    
    public Polinomio suma(Polinomio polinomio)
    {
       Polinomio resultado;
       NodoDoble p,q, o;
       Double d;
       int longitudP,longitudQ;
       resultado = new  Polinomio();
       longitudP = longitud();
       longitudQ = polinomio.longitud();
       o = resultado.primerNodo();
       if(longitudP>longitudQ)
       {
           p = primerNodo();
           q = polinomio.primerNodo();
       }
       else
       {
           p = polinomio.primerNodo();
           q = primerNodo();
       }
        while (p!=null)
        {
            d = (Double)p.retornaDigito();
            if(p.retornaPotencia()==q.retornaPotencia())
            {
                d = d+(Double)q.retornaDigito();
                q = q.retornaLd();
            }
            System.out.println("hola");
            o = resultado.buscaDondeInsertar(p.retornaPotencia());                      
            resultado.insertar(d, p.retornaPotencia(), o);
            p = p.retornaLd();           
        }
        return resultado;        
    }
    
    
//    public void sumarNodo(NodoDoble uno, NodoDoble dos, ListaDoblementeLigada result){
//        
//        int a,b,r;
//        String x,y;
//        NodoDoble nuevo;
//        
//        
//            a=(int) uno.retornaDigito();
//            b=(int) dos.retornaDigito();
//            x=(String) uno.retornaSigno();
//            y=(String) dos.retornaSigno();
//            
//            if(x.equals(b) && x.equals("-")){
//                r=a+b;
//                nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                result.insertarN(nuevo);
//                
//            }else if(x.equals(b) && x.equals("+")){
//                r=a+b;
//                nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                result.insertarN(nuevo);
//                
//            }else if(x.equals("+")){
//               
//                if(a<b){
//                    r=b-a;
//                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                    result.insertarN(nuevo);
//                    
//                }else{
//                    r=a-b;
//                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                    result.insertarN(nuevo);
//                } 
//            }else{
//         
//                 if(a<b){
//                    r=b-a;
//                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                    result.insertarN(nuevo);
//                }else{
//                    r=a-b;
//                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                    result.insertarN(nuevo);
//                }
//            }
//            result.borrar(uno);
//            result.borrar(dos);
//            uno=nuevo;
//            dos=nuevo.retornaLd();
//        
//    }
    
    public boolean igualExp(NodoDoble x, NodoDoble y){
    
        int exp1,exp2;
        
        exp1=(int)x.retornaPotencia();
        exp2=(int)y.retornaPotencia();
        
        if(exp1==exp2){
            return true;
        }else{
            return false;
        }
    }
    
    public void simplificar(ListaDoblementeLigada list){
        NodoDoble uno = list.primerNodo();
        NodoDoble dos = uno.retornaLd();
        
        while(!list.finDeRecorrido(dos)){
            
            if(igualExp(uno,dos)){
//                sumarNodo(uno,dos,list);
            }else{
                uno=uno.retornaLd();
                dos=dos.retornaLd();
            }
        }
        
    }
    
    public void derivada(ListaDoblementeLigada list){
        NodoDoble uno=list.primerNodo();
        
        while(!list.finDeRecorrido(uno)){
            
            uno.asignaDigito(((int)uno.retornaPotencia()*(int)uno.retornaDigito()));
            uno.asignaPotencia(((int)uno.retornaPotencia()-1));
            //recordatorio en caso de que la potencia sea negativa?
            
            uno=uno.retornaLd();
        }
        
    }
    
    public void integral(ListaDoblementeLigada list){
         NodoDoble uno=list.primerNodo();
        
        while(!list.finDeRecorrido(uno)){
            
            uno.asignaDigito(((int)uno.retornaDigito()/(int)uno.retornaPotencia()));
            uno.asignaPotencia(((int)uno.retornaPotencia()+1));
            //recordatorio en caso de que la potencia sea negativa?
            //recordatorio en caso de que la potencia sea cero
            
            uno=uno.retornaLd();
        }
    }
    
    
}
