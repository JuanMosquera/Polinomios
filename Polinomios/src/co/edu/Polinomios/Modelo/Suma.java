/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.Polinomios.Modelo;

/**
 *
 * @author jfwc1
 */
public class Suma {
    
    
    
    public void suma(ListaDoblementeLigada list1, ListaDoblementeLigada list2){
       
        ListaDoblementeLigada result = new ListaDoblementeLigada();
        
        if(!list1.esVacia() && !list2.esVacia()){
            NodoDoble uno = list1.primerNodo();
            NodoDoble dos = list2.primerNodo();
            
            while(!list1.finDeRecorrido(uno)){
               result.buscaDondeInsertar(uno);
               uno=uno.retornaLd();
            }
            
            
            while (!list2.finDeRecorrido(dos)) {
               result.buscaDondeInsertar(dos);
               dos=dos.retornaLd();
            }
            simplificar(result);
        }
        
    }
    
    
    public void sumarNodo(NodoDoble uno, NodoDoble dos, ListaDoblementeLigada result){
        
        int a,b,r;
        String x,y;
        NodoDoble nuevo;
        
        
            a=(int) uno.retornaDigito();
            b=(int) dos.retornaDigito();
            x=(String) uno.retornaSigno();
            y=(String) dos.retornaSigno();
            
            if(x.equals(b) && x.equals("-")){
                r=a+b;
                nuevo =new NodoDoble("-",r,uno.retornaPotencia());
                result.buscaDondeInsertar(nuevo);
                
            }else if(x.equals(b) && x.equals("+")){
                r=a+b;
                nuevo =new NodoDoble("+",r,uno.retornaPotencia());
                result.buscaDondeInsertar(nuevo);
                
            }else if(x.equals("+")){
               
                if(a<b){
                    r=b-a;
                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
                    result.buscaDondeInsertar(nuevo);
                    
                }else{
                    r=a-b;
                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
                    result.buscaDondeInsertar(nuevo);
                } 
            }else{
         
                 if(a<b){
                    r=b-a;
                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
                    result.buscaDondeInsertar(nuevo);
                }else{
                    r=a-b;
                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
                    result.buscaDondeInsertar(nuevo);
                }
            }
            result.borrar(uno);
            result.borrar(dos);
            uno=nuevo;
            dos=nuevo.retornaLd();
        
    }
    
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
                sumarNodo(uno,dos,list);
            }else{
                uno=uno.retornaLd();
                dos=dos.retornaLd();
            }
        }
        
    }
    
    public void derivada(ListaDoblementeLigada list){
        //ingresar un condicional para cuando la derivada llege cero
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
    
    public int evaluar(ListaDoblementeLigada list, int x){
        NodoDoble nod;
        int result = 0;
        nod=list.primerNodo();
        
        while(!list.finDeRecorrido(nod)){
            result= (int) Math.pow(((int)nod.retornaDigito()*x), (int)nod.retornaPotencia());
        }
        return result;
    }
    
    public void nderivada(ListaDoblementeLigada list, int n){
        
        for (int i = 0; i < n; i++) {
            this.derivada(list);
        }
        
        //ingresar un condicional para cuando la derivada llege cero
    }
    
    public int integralDef(ListaDoblementeLigada list, int x, int y){
        
        this.integral(list);
        int a = this.evaluar(list, x);
        int b = this.evaluar(list, y);
        int r = a-b;
        return r;
        
    }
    
    public String esFactor(ListaDoblementeLigada list, int c){
       
        int x = this.evaluar(list, c);
        if (x==0) {
            return "Es factor";
        } else {
            return "No es factor";
        }
    }
    
    //faltaria borrar polinomio
}
