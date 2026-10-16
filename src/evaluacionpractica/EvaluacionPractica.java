/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionpractica;

/**
 *
 * @author labesp
 */
import java.util.Scanner;
public class EvaluacionPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Venta venta = null;
        int op = 0;

        do {
            System.out.println("=== MENU DE VENTAS ===");
            System.out.println("1. Registrar Venta");
            System.out.println("2. Calcular Total de Venta");
            System.out.println("3. Calcular Descuento");
            System.out.println("4. Mostrar Detalle de Venta");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("--- REGISTRO DE VENTA ---");
                    System.out.print("Nombre del Cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Tipo de Producto: ");
                    String tipo = sc.nextLine();
                    System.out.print("Precio del Producto: ");
                    Double precio = sc.nextDouble();
                    System.out.print("Cantidad de Productos: ");
                    Integer cantidad = sc.nextInt();

                    venta = new Venta(nombre, tipo, precio, cantidad);
                    System.out.println("Venta registrada con exito!");
                    break;

                case 2:
                    if (venta != null) {
                        System.out.println("Total de la venta: $" + venta.calcularTotalVenta());
                    } else {
                        System.out.println("Primero debe registrar una venta!!");
                    }
                    break;

                case 3:
                    if (venta != null) {
                        venta.calcularDescuento();
                    } else {
                        System.out.println("Primero debe registrar una venta!!");
                    }
                    break;

                case 4:
                    if (venta != null) {
                        venta.mostrarDetalle();
                    } else {
                        System.out.println("Primero debe registrar una venta!!");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida!!");
            }
        } while (op != 5);

        sc.close();
    }
}

