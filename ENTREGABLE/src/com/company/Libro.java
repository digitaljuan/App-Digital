package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    //ATRIBUTOS
    private String nombre;
    private Integer ISBN;
    private String autor;
    private ArrayList<Ejemplar> listaEjemplares;


    //CONSTRUCTOR
    public Libro(String nombre, Integer ISBN, String autor) {
        this.nombre = nombre;
        this.ISBN = ISBN;
        this.autor = autor;
        
    }


    //Aqui hice una variable donde guardo todos los ejemplares que tengo


    //METODO

    public void agregarNuevoEjemplar(Ejemplar ejemplar){
        listaEjemplares.add(ejemplar);
    }


    public Boolean tieneEjemplaresDisponibles(){
        if (listaEjemplares.isEmpty()){
        return listaEjemplares;
        } else {
            return false;
        }
    }

    //Por ahora no entiendo la estructura de como se hace
    public Ejemplar prestarEjemplar(){
        listaEjemplares.remove(0);
        return
    }

    public void reingresarEjemplar(Ejemplar unEjemplar){
        listaEjemplares.//Reingresar unEjemplar
    }



}
