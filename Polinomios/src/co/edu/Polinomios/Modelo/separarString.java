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
        String polinomio="3x5 - .5x3 - 3x2 + 5x +2x +1";
        String[] letras;
        double d;
        int p;
        char s;
        polinomio = polinomio.toLowerCase();
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
        int c=(fracciones.length)*2;
        letras= new String[c];
        int j =0;
        
        
        
        if (fracciones[0].equals("")){
                    for(int i=1;i<fracciones.length;i++)
                {
                     String[] digito = fracciones[i].split("x");
        //                     System.out.println(fracciones[i]);
                              System.out.println(digito[0]);

                            letras[j]=digito[0];
                            j++;
                            if(digito.length==2) {
                              System.out.println(digito[1]);
                              letras[j]=digito[1];
                              j++;
                            }

                }
        } else {
                          for(int i=0;i<fracciones.length;i++)
                {
                     String[] digito = fracciones[i].split("x");
        //                     System.out.println(fracciones[i]);
                              System.out.println(digito[0]);

                            letras[j]=digito[0];
                            j++;
                            if(digito.length==2) {
                              System.out.println(digito[1]);
                              letras[j]=digito[1];
                              j++;
                            }

                }
        }
   }
        
        
        
//        int c=(fracciones.length)*2;
//        letras= new String[c];
//        System.out.println("resultado");
//        
//        int j =0;
//        letras[j]=fracciones[0];
//        j++;
//        
//        
//            for (int i = 1; i < fracciones.length; i++) {
//    //            System.out.println(i);
//
//
//
//                    String[] digito = fracciones[i].split(" ");
//                    letras[j]=digito[0];
//                    j++;
//                    letras[j]=digito[1];
//                    j++;
//                    System.out.println(digito[0]);
//                    System.out.println(digito[1]);
//
//
//            }    
//        
//        
//        
//                
//             
//        System.out.println("final");
//        for (int i = 0; i < letras.length; i++) {
//            System.out.println(letras[i]);
//        }
//       
//       System.out.println(fracciones.length);
////        for(int i=0;i<fracciones.length;i++)
////        {
////            String[] digito = fracciones[i].split(" ");
////            System.out.println(digito[i]);
////        }
    
}
