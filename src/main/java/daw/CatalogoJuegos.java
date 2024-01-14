/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author jesus
 */
public class CatalogoJuegos {

    public static void main(String[] args) {

        Juegos j1 = new Juegos("Super Mario", 1990, 9, "nintendo", "nintendo");

        CatalogoJuegos catalogo1 = new CatalogoJuegos();
        CatalogoJuegos catalogo2 = new CatalogoJuegos();

        //Método 1
        System.out.println("Método 1");
        System.out.println("El catálogo tiene " + catalogo1.numeroElementos()
                + " elementos");
        System.out.println("El catálogo 2 tiene " + catalogo2.numeroElementos()
                + " elementos");

        //metodo2
        System.out.println("\nMétodo 2");
        System.out.println("¿Está vacío el catálogo? " + catalogo1.estaVacio());

        //Método 3
        System.out.println("\nMétodo 3");
        catalogo1.guardarElemento(j1);
        catalogo1.guardarElemento(new Juegos("playstation",
                1992, 18, "maniark", "yakjito"));

        catalogo2.guardarElemento(new Juegos("nintendogs",
                1599, 15, "saijhsajs", "nomammaa"));
        catalogo2.guardarElemento(new Juegos("xbox",
                1892, 50, "maniadadark", "saoijsa"));
        //Método 4
        System.out.println("\nMétodo 4");
        System.out.println(catalogo1.verElemento(0));
        System.out.println(catalogo1.verElemento(1));
        System.out.println(catalogo2.verElemento(0));
        System.out.println(catalogo2.verElemento(1));

        //Método 5
        System.out.println("\nMétodo 5");
        catalogo1.cambiarElemento(0, new Juegos());
        System.out.println(catalogo1.verElemento(0));

        //Método 6
        System.out.println("\nMétodo 6");
        catalogo1.eliminarElemento(0);
        System.out.println(catalogo1.verElemento(0));

        //Método 7
        System.out.println("\nMétodo 7");
        catalogo2.eliminaElemento(j1);
        catalogo2.imprimirCatalogo();

        //Método 8
        System.out.println("\nMétodo 8");
        ArrayList<Juegos> juegosLista = new ArrayList<>();
        juegosLista.add(new Juegos("rachet", 1990, 9,
                "xbox", "yakitolakaka"));

        juegosLista.add(new Juegos("2345 jfj", 2299, 9,
                "Enrique iglesia", "ahskw"));
        catalogo2.eliminarElemento(juegosLista);
        catalogo2.imprimirCatalogo();

        //Método 9
        System.out.println("\nMétodo 9");
        catalogo2.eliminarTodos();
        System.out.println("¿La lista 2 está vacía? " + catalogo2.estaVacio());
        
        //Método 10
        System.out.println("\nMétodo 10");
        catalogo1.imprimirCatalogo();

        //Método 11
        System.out.println("\nMétodo 11");
        System.out.println("el juego 1 se encuentra en "
                + catalogo1.buscarElementoIndexOf(j1));

        //Método 12
        System.out.println("\nMétodo 12");
        catalogo1.ordenarPorAño();
        catalogo1.imprimirCatalogo();

        //Método 13
        System.out.println("\nMétodo 13");
        System.out.println("El objeto j1 está en la posición "
                + catalogo1.buscarElementoBinarySearch(j1));

    }

    private ArrayList<Juegos> listaJuegos;

    public CatalogoJuegos() {
        this.listaJuegos = new ArrayList<>();
    }

    public ArrayList<Juegos> getListaJuegos() {
        return listaJuegos;
    }

    public void setListaJuegos(ArrayList<Juegos> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.listaJuegos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CatalogoJuegos other = (CatalogoJuegos) obj;
        return Objects.equals(this.listaJuegos, other.listaJuegos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CatalogoJuegos{");
        sb.append("listaJuegos=").append(listaJuegos);
        sb.append('}');
        return sb.toString();
    }

    //Creación de Métodos
    //numeroElementos(): devuelve el número de objetos que hay en la lista.
    public int numeroElementos() {
        return listaJuegos.size();
    }

    public boolean estaVacio() {
        return listaJuegos.isEmpty();
    }

    public Juegos verElemento(int posicion) {
        try {
            return listaJuegos.get(posicion);
        } catch (IndexOutOfBoundsException a) {
            System.out.print("No existen elementos o no existe la posición / ");
            return null;
        }

    }

    public void cambiarElemento(int posicion, Juegos nuevoObjeto) {
        try {
            listaJuegos.set(posicion, nuevoObjeto);
        } catch (IndexOutOfBoundsException a) {
            System.out.println("No existe la posicón indicada");
        }
    }

    //guardarElemento(Objeto c): agrega al final de la lista el nuevo elemento
    public void guardarElemento(Juegos guardarJuego) {
        listaJuegos.add(guardarJuego);
    }

    //eliminarElemento(int): elimina el objeto que se encuentra en la posición indicada
    public void eliminarElemento(int posicion) {
        listaJuegos.remove(posicion);
    }

    //eliminaElemento(Objeto c), elimina el objeto c si se encuentra en la lista
    public void eliminaElemento(Juegos eliminarObjeto) {
        listaJuegos.remove(eliminarObjeto);
    }

    public void eliminarElemento(ArrayList<Juegos> eliminarObjetoLista) {
        listaJuegos.removeAll(eliminarObjetoLista);
    }

    //eliminarTodos(), borra todos los objetos.
    public void eliminarTodos() {
        Iterator<Juegos> it = listaJuegos.iterator();

        while (it.hasNext()) {
            it.next();
            if (!listaJuegos.isEmpty()) {
                it.remove();
            }
        }
    }

    public void imprimirCatalogo() {

        listaJuegos.forEach(System.out::println);
    }

    //No usar búsqueda binaria.
    public int buscarElementoIndexOf(Juegos elementoABuscar) {
        return listaJuegos.indexOf(elementoABuscar);
    }

    public void ordenarPorCreadores() {
        Collections.sort(listaJuegos,
                (e1, e2) -> e1.getCreadores().compareToIgnoreCase(e2.getCreadores()));
    }

    public void ordenarPorAño() {
        Collections.sort(listaJuegos,
                (e1, e2) -> e1.getAñoLanzamiento() - e2.getAñoLanzamiento());
    }

    public void ordenarPorPegi() {
        Collections.sort(listaJuegos,
                (e1, e2) -> Integer.compare(e1.getPegi(), e2.getPegi()));
    }

    public int buscarElementoBinarySearch(Juegos elementoABuscar) {
        //La lista tiene estar ordenada primero
        //ejecutar primero el método de ordenación
        elementoABuscar.setCreadores("nintendo");
        return Collections.binarySearch(listaJuegos,
                elementoABuscar,
                (e1, e2) -> e1.getCreadores().compareToIgnoreCase(e2.getCreadores()));

    }
}
