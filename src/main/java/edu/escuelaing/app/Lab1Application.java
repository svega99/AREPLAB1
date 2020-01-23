package edu.escuelaing.app;

import java.io.*;
import java.util.List;

import edu.escuelaing.app.Calculator.Calculator;
import edu.escuelaing.app.LinkedListImpl.LinkedList;





/**
 * Hello world!
 *
 */
public class Lab1Application
{
    public static void main( String[] args )
    {   
         
        File dataFile = null;
        if (args.length > 0){
            dataFile = new File(args[0]);
        }
        else{
            System.out.println("No ingreso un archivo");
            
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            LinkedList<Double> lh = new LinkedList<>();
            String line;
            while ((line = br.readLine()) != null) {
                double num = Double.parseDouble(line);
                lh.add(num);
            }
            double media = Calculator.getMean(lh);
            media = (double)Math.round(media * 100d) / 100d;
            double desviacion = Calculator.getStandardDeviation(lh);
            desviacion =(double)Math.round(desviacion * 100d) / 100d;
            System.out.println("La media es: "+media);
            System.out.println("La desviación estandar es: "+desviacion);
            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("No se pudo leer");
        }
    }
}
