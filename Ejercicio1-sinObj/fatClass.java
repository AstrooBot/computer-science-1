import java.util.Scanner;

public class fatClass {

    public static Scanner sc = new Scanner(System.in);

    public String[] burbuja(String[] elementos) {

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
                elementos[i+1] = swap;
                swapped++;
            }
            
        }
            if (swapped == 0) break;
        }
        return elementos;
    }

    public long[] burbuja(long[] elementos) {

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
                elementos[i+1] = swap;
                swapped++;
            }
        }
            if (swapped == 0) break;
        }
        return elementos;
    }

    public String[] insercion(String[] elementos) {

        for (int i = 1; i < elementos.length; i++) {
            String ref = elementos[i];
            int innerIndex = i - 1;
            
            while (innerIndex >= 0 && elementos[innerIndex].toLowerCase().compareTo(ref.toLowerCase()) > 0) {
                elementos[innerIndex + 1] = elementos[innerIndex];
                innerIndex--;
            }
            elementos[innerIndex + 1] = ref;
        }
        return elementos;
    }

    public long[] insercion(long[] elementos) {

        for (int i = 1; i < elementos.length; i++) {
            long ref = elementos[i];
            int innerIndex = i - 1;

            while (innerIndex >= 0 && elementos[innerIndex] > ref) {
                elementos[innerIndex + 1] = elementos[innerIndex];
                innerIndex--;
            }
            elementos[innerIndex + 1] = ref;
        }
        return elementos;
    }

    public String[] invertir(String[] arr) {
        String[] newArr = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
		return newArr;
	}

    public long[] invertir(long[] arr) {
        long[] newArr = new long[arr.length];
		for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
		return newArr;
	}

    public static String[] nombres = {
        "Textiles LuisP",
        "Comidas Rapidas: Que Alitas",
        "Panaderia DKCH",
        "Zapateria Donde Mercedes",
        "Supermercado San Juan"
    };
    public String[] fechas = {
        "20/03/2008",
        "25/12/2018",
        "14/04/2015",
        "17/03/2000",
        "10/06/1999"
    };
    public long[] ventas = {
        37456000,
        62876000,
        123345000,
        12500000,
        92889000};
    public long[] numClientes = {
        342,
        2347,
        5654,
        398,
        2654
    };

    public String[] ordenar(String[] elementos, int metodo, boolean descendente) {
        String[] result;
        switch (metodo) {
            case 1:
                result = this.burbuja(elementos);
                break;
            case 2:
                result = this.insercion(elementos);
                break;
            default:
                result = null;
                break;
        }
        if(descendente){result = this.invertir(result);}
        return result;
    }

    public long[] ordenar(long[] elementos, int metodo, boolean descendente) {
        long[] result;
        switch (metodo) {
            case 1:
                result = this.burbuja(elementos);
                break;
            case 2:
                result = this.insercion(elementos);
                break;
            default:
                result = null;
                break;
        }
        if(descendente){result = this.invertir(result);}
        return result;
    }

    public static void main(String[] args) {
    
    System.out.println("Metodo de ordenamiento: \n 1.Burbuja \n 2.Insercion\n");
    int metOrdenamiento = Integer.parseInt(sc.nextLine());

    System.out.println("Criterio de ordenamiento: \n 1.Nombre \n 2.Fecha de Creacion \n 3.Ventas \n 4.Numero de Clientes\n");
    int criterio = Integer.parseInt(sc.nextLine());

    if(criterio == 2) {
        System.out.println("Valor de fecha a tomar: \n 1. Dia \n 2. Mes \n 3. Año \n");
        int tipoFecha = Integer.parseInt(sc.nextLine());
    }
    System.out.println("Ordenar de forma descendente? \n 1.si \n 2.no");
    int descendente = Integer.parseInt(sc.nextLine());
    boolean des = false;
    if(descendente == 1) {
        des = true;
    }

    switch (criterio) {
        case 1:
            this.ordenar(nombres, metOrdenamiento, des);
            break;
    
        default:
            break;
    }
    
    
    }
    
    
}
