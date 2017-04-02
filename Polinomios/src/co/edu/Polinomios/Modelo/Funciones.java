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
public class Funciones {
    
    public ListaDoblementeLigada suma(ListaDoblementeLigada list1, ListaDoblementeLigada list2){
       
        ListaDoblementeLigada result = new ListaDoblementeLigada();
        
        if(!list1.esVacia() && !list2.esVacia()){
            NodoDoble uno = list1.primerNodo();
            NodoDoble dos = list2.primerNodo();
            
//            result.insertar(uno.retornaDigito(), uno.retornaPotencia(), null);
//            uno=uno.retornaLd();
            
            while(!list1.finDeRecorrido(uno)){
                System.out.println("hola");
                System.out.println(uno.retornaDigito());
                result.insertar(uno.retornaDigito(), uno.retornaPotencia(), uno);
               uno=uno.retornaLd();
            }
            
            
            while (!list2.finDeRecorrido(dos)) {
               result.insertar(dos.retornaDigito(), dos.retornaPotencia(), dos);//si sera el metodo para insertar un nodo
               dos=dos.retornaLd();
            }
            simplificar(result);
        }
        return result;
    }
    
    
    public void sumarNodo(NodoDoble uno, NodoDoble dos, ListaDoblementeLigada result){
        
        float a,b,r;
        String x,y;
        NodoDoble nuevo;
        
        
            a=(float) uno.retornaDigito();
            b=(float) dos.retornaDigito();
//            x=(String) uno.retornaSigno();
//            y=(String) dos.retornaSigno();


        r=a+b;
         nuevo =new NodoDoble(r,uno.retornaPotencia());
         
//            
//            if(x.equals(b) && x.equals("-")){
//                r=a+b;
//                nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                result.buscaDondeInsertar(nuevo);
//                
//            }else if(x.equals(b) && x.equals("+")){
//                r=a+b;
//                nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                result.buscaDondeInsertar(nuevo);
//                
//            }else if(x.equals("+")){
//               
//                if(a<b){
//                    r=b-a;
//                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                    result.buscaDondeInsertar(nuevo);
//                    
//                }else{
//                    r=a-b;
//                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                    result.buscaDondeInsertar(nuevo);
//                } 
//            }else{
//         
//                 if(a<b){
//                    r=b-a;
//                    nuevo =new NodoDoble("+",r,uno.retornaPotencia());
//                    result.buscaDondeInsertar(nuevo);
//                }else{
//                    r=a-b;
//                    nuevo =new NodoDoble("-",r,uno.retornaPotencia());
//                    result.buscaDondeInsertar(nuevo);
//                }
//            }
            result.borrar(uno);
            result.borrar(dos);
            result.buscaDondeInsertar(nuevo);//si sera el metodo para insertar un nodo
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
            if ((int)uno.retornaDigito()==0) {
                //borrar ese nodo de la lista
            } else {
                if ((int)uno.retornaPotencia()==0) {
                    uno.asignaDigito(0);
                } else {
                    uno.asignaDigito(((float)uno.retornaPotencia()*(float)uno.retornaDigito()));
                    uno.asignaPotencia(((float)uno.retornaPotencia()-1));
                    //recordatorio en caso de que la potencia sea negativa?
                }
            }
 
            
           
            
            uno=uno.retornaLd();
        }
        
    }
    
    public void integral(ListaDoblementeLigada list){
         NodoDoble uno=list.primerNodo();
        
        while(!list.finDeRecorrido(uno)){
            
           
                uno.asignaPotencia(((float)uno.retornaPotencia()+1));
                //sera que guarda tipo int o float por lo del punto flotante
                uno.asignaDigito(((float)uno.retornaDigito()/(float)uno.retornaPotencia()));
            
                //recordatorio en caso de que la potencia sea negativa?
            
            
            
            
            uno=uno.retornaLd();
        }
    }
    
    public float evaluar(ListaDoblementeLigada list, int x){
        NodoDoble nod;
        float result = 0;
        nod=list.primerNodo();
        
        while(!list.finDeRecorrido(nod)){
            result= (float) Math.pow(((float)nod.retornaDigito()*x), (float)nod.retornaPotencia());
            nod=nod.retornaLd();
        }
        return result;
    }
    
    public void nderivada(ListaDoblementeLigada list, int n){
        
        for (int i = 0; i < n; i++) {
            this.derivada(list);
        }
        
        //ingresar un condicional para cuando la derivada llege cero
    }
    
    public float integralDef(ListaDoblementeLigada list, int x, int y){
        
        this.integral(list);
        float a = this.evaluar(list, x);
        float b = this.evaluar(list, y);
        float r = a-b;
        return r;
        
    }
    
    public String esFactor(ListaDoblementeLigada list, int c){
       
        float x = this.evaluar(list, c);
        if (x==0) {
            return "Es factor";
        } else {
            return "No es factor";
        }
    }
    
    //faltaria borrar polinomio
}
