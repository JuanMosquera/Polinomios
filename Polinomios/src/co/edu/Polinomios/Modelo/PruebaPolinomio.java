package co.edu.Polinomios.Modelo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaPolinomio {
    
    public static void main(String[] args) 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String polinomio = "";
        char s = 0;
        double d = 0;
        int p = 0;
        try 
        {
            System.out.println("Ingrese el polinomio: ");
            polinomio = br.readLine().toLowerCase();
        } catch (IOException e){}
        String polinomio1 = polinomio.replace(" ","");
        char recorre;
        int i = 0;
        recorre = polinomio1.charAt(0); 
        if(recorre == '+' || recorre=='-')
        {
            s = recorre;
            recorre = polinomio1.charAt(1);
            i = 1;
        }
        else
        {
            s = '+';            
        }
        int m = i;
        while(recorre!='x')
        {
            recorre = polinomio1.charAt(i);
            i = i+1;
        }
        d = Double.parseDouble(polinomio1.substring(m,i-1));
        p = Integer.parseInt(polinomio1.substring(i,i+1));
        ListaDoblementeLigada listaPolinomio = new ListaDoblementeLigada();
        listaPolinomio.insertar(s,d,p,null);
        NodoDoble n = listaPolinomio.primerNodo();
        m = i+1;
        boolean noVariable = false;
        for(int j=m;j<polinomio1.length()-1;j++) //Pasa el String a char y construye la hilera representada como Lista Doblemente Ligada
        {
            recorre = polinomio1.charAt(j);
            s = recorre;
            j = j+1;
            m = m+1;
            while(recorre!='x')
            {
                if(j>=polinomio1.length())
                {
                    noVariable = true;
                    break;
                }
                recorre = polinomio1.charAt(j);
                j = j+1;
                      
            }
            if(noVariable==true)
            {
                d = Double.parseDouble(polinomio1.substring(m,j));
                p = 0;
                listaPolinomio.insertar(s,d,p,n);
                n = n.retornaLd();
                break;
            };
            d = Double.parseDouble(polinomio1.substring(m,j-1));
            if(j+1<polinomio1.length())
            {
                p = Integer.parseInt(polinomio1.substring(j,j+1));
            }
            else
            {
                p = 1;
                j = j+1;
            }
            listaPolinomio.insertar(s,d,p,n);
            n = n.retornaLd();
            m = j+1;
        }
        listaPolinomio.recorreIzqDer();
    }
}
    

