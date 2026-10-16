/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionpractica;

/**
 *
 * @author labesp
 */
public class Venta {
//Atributos
    String nombreCliente, tipoProducto;
    Double precioProducto;
    Integer cantidadProductos;

    public Venta() {
    }

    public Venta(String nombreCliente, String tipoProducto, Double precioProducto, Integer cantidadProductos) {
        this.nombreCliente = nombreCliente;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
        this.cantidadProductos = cantidadProductos;
    }

    //Metodos
    public Double calcularTotalVenta() {
        return precioProducto * cantidadProductos;
    }

    public void calcularDescuento() {
        Double totalVenta = calcularTotalVenta();
        Double porcentaje = 0.0;

        if (totalVenta >= 100) {
            porcentaje = 0.20;
        } else if (totalVenta >= 50 && totalVenta <= 99) {
            porcentaje = 0.10;
        } else if (totalVenta >= 1 && totalVenta <= 49) {
            porcentaje = 0.05;
        }

        Double descuento = totalVenta * porcentaje;
        Double totalFinal = totalVenta - descuento;

        System.out.println("--- CALCULO DE DESCUENTO ---");
        System.out.println("Total de venta: $" + totalVenta);
        System.out.println("Descuento aplicado (" + (porcentaje * 100) + "%): $" + descuento);
        System.out.println("Total final a pagar: $" + totalFinal);
    }

    public void mostrarDetalle() {
        Double totalVenta = calcularTotalVenta();
        Double porcentaje = 0.0;

        if (totalVenta >= 100) {
            porcentaje = 0.20;
        } else if (totalVenta >= 50 && totalVenta <= 99) {
            porcentaje = 0.10;
        } else if (totalVenta >= 1 && totalVenta <= 49) {
            porcentaje = 0.05;
        }

        Double descuento = totalVenta * porcentaje;
        Double totalFinal = totalVenta - descuento;

        System.out.println("=== DETALLE DE LA VENTA ===");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Categoria del Producto: " + tipoProducto);
        System.out.println("Precio Unitario: $" + precioProducto);
        System.out.println("Cantidad Adquirida: " + cantidadProductos);
        System.out.println("Total de la Venta: $" + totalVenta);
        System.out.println("Descuento Aplicado: $" + descuento);
        System.out.println("Total Final a Pagar: $" + totalFinal);
    }
}
