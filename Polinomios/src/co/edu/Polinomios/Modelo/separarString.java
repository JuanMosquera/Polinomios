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
        
        String polinomio=" x + 2x3 -3x2 -1 +2x +x +1";
        
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
        
   }
        
    
}
