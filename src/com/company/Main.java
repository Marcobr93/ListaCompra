package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Articulo> compra = new ArrayList<Articulo>();
        int option;

        while ( (option = ListaCompra.mostrarMenu(compra)) != 0){
            switch (option){
                case 1:
                    // Añadir compra
                    ListaCompra.añadirCompra(compra);
                    break;

                case 2:
                    // Borrar compra
                    ListaCompra.borrarCompra(compra);
                    break;
                case 3:
                    // Mostar lista de la compra
                    ListaCompra.mostrarCompra(compra);
                    break;
                case 4:
                    // Consultar importe total
                    ListaCompra.consultarImporte(compra);
                    break;
                case 5:
                    // Pagar
                    ListaCompra.pagar(compra);
                    System.exit(0);
                    break;
                default:
            }
        }
    }


}
