package co.edu.udistrital.controller;

import co.edu.udistrital.model.Directorio;

public class Ordenador {

    private Directorio directorio;

    public Ordenador(Directorio directorio) {
        this.directorio = directorio;
    }

    public String[] getByCriterio(String criterio) {

        String[] elementos = new String[this.directorio.getOcupados()];
        switch (criterio) {

            case "nombre":
                for (int i = 0; i < elementos.length; i++) {
                elementos[i] = this.directorio.buscar(i).getNombre();
                }

                break;

            case "fechaCreacion":
                for (int i = 0; i < elementos.length; i++) {
                elementos[i] = this.directorio.buscar(i).getFechaCreacion();
                }

                break;
            
            case "ventas":
                for (int i = 0; i < elementos.length; i++) {
                elementos[i] = Long.toString(this.directorio.buscar(i).getVentas());
                }

                break;
            
            case "numClientes":
                for (int i = 0; i < elementos.length; i++) {
                elementos[i] = Long.toString(this.directorio.buscar(i).getNumClientes());
                }
                break;
            default:
                return null;
        }
        return elementos;
    }

    public void burbuja(String[] elementos, boolean descendente) {

        int valor1, valor2, swapped;
        String swap;

        while(true) {
        swapped = 0;
        for (int i = 0; i+1 < elementos.length; i++) {
            valor1 = elementos[i].toLowerCase().compareTo("a");
            valor2 = elementos[i+1].toLowerCase().compareTo("a");

            if(valor1 > valor2) {
                swap = elementos[i];
                elementos[i] = elementos[i+1];
                this.directorio.mover(i, i+1);
                elementos[i+1] = swap;
                swapped++;
            }
            
        }
            if (swapped == 0) break;
        }
        if(descendente) this.directorio.invertir();

    }

    public void burbuja(long[] elementos, boolean descendente) {

        long valor1, valor2, swap;
        int swapped;

        while(true) {
        swapped = 0;
        for (int i = 0; i+1 < elementos.length; i++) {
            valor1 = elementos[i];
            valor2 = elementos[i+1];

            if(valor1 > valor2) {
                swap = elementos[i];
                elementos[i] = elementos[i+1];
                this.directorio.mover(i, i+1);
                elementos[i+1] = swap;
                swapped++;
            }
            
        }
            if (swapped == 0) break;
        }
        if(descendente) this.directorio.invertir();

    }

    public void insercion(String[] elementos, boolean descendente) {

        for (int i = 1; i < elementos.length; i++) {
            String ref = elementos[i];
            int innerIndex = i - 1;
            
            while (innerIndex >= 0 && elementos[innerIndex].toLowerCase().compareTo(ref.toLowerCase()) > 0) {
                elementos[innerIndex + 1] = elementos[innerIndex];
                this.directorio.mover(innerIndex, innerIndex + 1);
                innerIndex--;
            }
            elementos[innerIndex + 1] = ref;
            if(descendente) this.directorio.invertir();
        }
    }

    public void insercion(long[] elementos, boolean descendente) {

        for (int i = 1; i < elementos.length; i++) {
            long ref = elementos[i];
            int innerIndex = i - 1;

            while (innerIndex >= 0 && elementos[innerIndex] > ref) {
                elementos[innerIndex + 1] = elementos[innerIndex];
                this.directorio.mover(innerIndex, innerIndex + 1);
                innerIndex--;
            }
            elementos[innerIndex + 1] = ref;
            if(descendente) this.directorio.invertir();
        }
    }

}
