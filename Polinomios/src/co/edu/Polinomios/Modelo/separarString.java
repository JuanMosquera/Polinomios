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
public class separarString {
    
    public static void main(String[] args) {
        
        String polinomio="2x2+x2+3x2-2 -3";
        
        String[] letras;
        int c;
        int j;
        
        polinomio = polinomio.toLowerCase();
        polinomio = polinomio.replace("  ", "");
        polinomio = polinomio.replace(" ", "");
        System.out.println(polinomio);

        polinomio = polinomio.replace("+", " +");
        polinomio = polinomio.replace("-", " -");
        System.out.println(polinomio);
        
        
        String[] fracciones = polinomio.split(" ");
        for(int i=0;i<fracciones.length;i++)
        {
            System.out.println(fracciones[i]);
        }
        
        System.out.println("prueba");
        c=(fracciones.length)*2;
        letras= new String[c];
        j =0;
        
        
        
        if (fracciones[0].equals("")){
            
            for (int i=1;i<fracciones.length;i++) {
               String[] digito = fracciones[i].split("x");
               System.out.println(digito.length);
        //                     System.out.println(fracciones[i]);
              // System.out.println(digito[0]);

                 if (digito.length==2) {
                    letras[j]=digito[0];
                    j++;
//                        System.out.println(digito[1]);
                    letras[j]=digito[1];
                    j++;
                   
                            
                } else if(digito.length==1) {
                     letras[j]=digito[0];
                    j++;
                    if (fracciones[i].indexOf("x")==(-1)) {
                        letras[j]="0";
                        j++;
                   } else {
                        letras[j]="1";
                        j++;
                   }
                    
                }else{
                    letras[j]="1";
                    j++;
                    letras[j]="1";
                    j++;
                }  
            }
            
        } else {
            
            for (int i=0;i<fracciones.length;i++) {
               String[] digito = fracciones[i].split("x");
               System.out.println(digito.length);
        //                     System.out.println(fracciones[i]);
               // System.out.println(digito[0]);

               if (digito.length==2) {
                    letras[j]=digito[0];
                    j++;
//                        System.out.println(digito[1]);
                    letras[j]=digito[1];
                    j++;
                   
                            
                } else if(digito.length==1) {
                     letras[j]=digito[0];
                    j++;
                    if (fracciones[i].indexOf("x")==(-1)) {
                        letras[j]="0";
                        j++;
                   } else {
                        letras[j]="1";
                        j++;
                   }
                    
                }else{
                    letras[j]="1";
                    j++;
                    letras[j]="1";
                    j++;
                }
            }
        }
        
        System.out.println("letras");
        for(int i=0;i<letras.length;i++)
        {
            if (letras[i]!=null) {
                 System.out.println(letras[i]);
            }else{
                break;
            }
           
        }
        
        
         double d;
        int p;
         if(letras[0].equals(""))
        {
            d = 1;
        }
         else if(letras[0].equals("-") && letras[0].length()==1){
             d = -1;
         }
        else
        {
            d = Double.parseDouble(letras[0]);
        }
        p = Integer.parseInt(letras[1]);
        Polinomio poli = new Polinomio();
        poli.insertar(d, p, null);
        NodoDoble nodo = poli.primerNodo();
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
            if(i==letras.length || letras[i]==null)
            {
                break;
            }                
            else
            {
                p = Integer.parseInt(letras[i]);
            }
            poli.insertar(d, p, nodo);
            nodo = nodo.retornaLd();
        }
        System.out.println("122");
        poli.recorreIzqDer();
        System.out.println("hola");
        nodo= poli.primerNodo();
        for (int i = 0; i < poli.longitud()-1; i++) {
            
            if (nodo.retornaPotencia()==nodo.retornaLd().retornaPotencia()) {
                System.out.println("son iguales");
                nodo.asignaDigito((double)nodo.retornaDigito()+ (double)nodo.retornaLd().retornaDigito());
                poli.borrar(nodo.retornaLd());
                i--;
            }else {
                nodo=nodo.retornaLd();
            }
        }
        
         poli.recorreIzqDer();

        
   }
        
    
}
