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
    
}
