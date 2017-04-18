package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by marco on 18/4/17.
 */
public class ListaCompra extends Articulo{
    /**
     * Método que sirve para mostrar la lista de la compra, imprimiendo el nombre y el precio del artículo.
     * @param lista
     */
    public static void mostrarCompra(ArrayList<Articulo> lista){
        int index = 0;
        for (Articulo articulo: lista){
            System.out.println((index) + " - " + articulo.getNombreArticulo() + " " + articulo.getPrecioArticulo() + " €");
            index++;
        }
    }

    /**
     * Método que sirve para añadir a nuestra lista de la compra tanto el producto introducido como su precio.
     * @param lista
     */
    public static void añadirCompra(ArrayList<Articulo> lista){
        Scanner input = new Scanner(System.in);
        Articulo añadir;

        String producto;
        double precio;

        do{
            System.out.println("Añada un nuevo producto:");
            producto = input.nextLine().trim().replaceAll("\\s+"," ");
        } while (producto.length() == 0);

        do{
            System.out.println("Introduzca el precio del producto:");
            precio = input.nextDouble();
        } while (precio <= 0);
        añadir = new Articulo(producto, precio);
        lista.add(añadir);
    }

    /**
     * Método que sirve para borrar un producto de nuestra lista de la compra introduciendo su índice.
     * @param lista
     */
    public static void borrarCompra(ArrayList<Articulo> lista){
        Scanner input = new Scanner(System.in);
        int index;
        mostrarCompra(lista);
        do {
            System.out.println("Introduzca el índice para borrar el producto deseado: ");
            index = input.nextInt();
        }while (!correctIndex(index, lista));

        lista.remove(index);

    }

    /**
     * Método que nos muestra el importe total de los productos añadidos.
     * @param lista
     */
    public static void consultarImporte(ArrayList<Articulo> lista){
        double resultado = 0;
        for(Articulo articulo: lista){
            resultado += articulo.getPrecioArticulo();
        }
        System.out.println("El importe total es de: " + resultado + " €");
    }

    /**
     * Método para mostrar tanto la compra realizada, como el importe total.
     * @param lista
     */
    public static void pagar(ArrayList<Articulo> lista){
        mostrarCompra(lista);
        consultarImporte(lista);
    }

    /**
     * Método boolean que nos permite controlar que el índice sea mayor o igual que cero y menor que el tamaño de la lista.
     * @param index
     * @param lista
     * @return
     */
    public static boolean correctIndex(int index, ArrayList<Articulo> lista){
        if(index >= 0 && index < lista.size()){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que nos muestra el menú de nuestro programa
     * @param lista
     * @return
     */
    public static int mostrarMenu(ArrayList<Articulo> lista){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> options = new ArrayList<>();
        int option;

        System.out.println("***********************************");
        System.out.println("* 1 - Añadir producto             *");
        options.add(1);
        if (lista.size() > 0) {
             System.out.println("* 2 - Eliminar producto           *");
             options.add(2);
             System.out.println("* 3 - Mostrar lista de artículos  *");
             options.add(3);
             System.out.println("* 4 - Consultar importe total     *");
             options.add(4);
             System.out.println("* 5 - Pagar                       *");
             options.add(5);
        }
        System.out.println("***********************************");
        do{
            System.out.println("Opción: ");
            option = input.nextInt();
            if (option > lista.size()){
                return option;
            }
        } while (option < 0 || option > options.size());
        return option;

    }

}
