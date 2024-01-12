/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author jesus
 */
public class CatalogoJuegos {

    public static void main(String[] args) {
       
        Juegos j1 = new Juegos("Super Mario",1990, 9, "nintendo", "nintendo");      
        Juegos j2 = new Juegos("Grand Theft Auto V",2015, 18, "PS4,PC,XBOX", "Rockstar Games");       
        Juegos j3 = new Juegos("Rachet & Clank",20020, 12, "playstation", "maniark");
        
        ArrayList <Juegos> lista = new ArrayList<>();
        
        lista.add (new Juegos(j1));
        lista.add(new Juegos(j2));
        lista.add(new Juegos(j3));
        
        
        lista.forEach(System.out::println);
        Collections.sort(lista, (e1,e2)->e1.getPegi()-e2.getPegi());
        System.out.println("-------------------------Ordenar por Pegi-----------------------");
        lista.forEach(System.out::println);
        
        Collections.sort(lista, (e1,e2)->e1.getAñoLanzamiento()-e2.getAñoLanzamiento());
        System.out.println("--------------------------Ordenar por año de Lanzamiento--------");
        lista.forEach(System.out::println);
        
        
        Collections.sort(lista, (e1,e2)->e1.getCreadores().compareToIgnoreCase(e2.getCreadores()));
        System.out.println("--------------------------Ordenar por Creadores--------");
        lista.forEach(System.out::println);
        
        Collections.sort(lista, (e1,e2)->e1.getNombre().compareToIgnoreCase(e2.getNombre()));
        System.out.println("--------------------------Ordenar por nombre--------");
        lista.forEach(System.out::println);
        
        Collections.sort(lista, (e1,e2)->e1.getConsola().compareToIgnoreCase(e2.getConsola()));
        System.out.println("--------------------------Ordenar por consola--------");
        lista.forEach(System.out::println);
        
        
        Comparator<Juegos> criterioPegi= (e1,e2)->e1.getPegi()-e2.getPegi();
        Collections.sort(lista, criterioPegi.reversed());
        System.out.println("-------------------------Ordenar por Pegi de mayor a menor-----------------------");
        lista.forEach(System.out::println);
        
    
    }
}
