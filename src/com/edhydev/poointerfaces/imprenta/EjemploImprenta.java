package com.edhydev.poointerfaces.imprenta;

import com.edhydev.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Persona edgar = new Persona("Edgar", "Jiménez");
        Persona julio =  new Persona("Julio", "Verne");
        Persona francisco =  new Persona("Francisco", "ITT");

        Curriculo cv = new Curriculo(edgar, "Ing. en Sistemas Computacionales", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular 2.0");

        Libro libro = new Libro(julio, "La isla misteriosa", Genero.CIENCIA_FICCION);
        libro.addPagina(new Pagina("Capitulo 1"))
                .addPagina(new Pagina("Capitulo 2"))
                .addPagina(new Pagina("Capitulo 3"))
                .addPagina(new Pagina("Capitulo 4"));

        Informe informe = new Informe(edgar, francisco, "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
