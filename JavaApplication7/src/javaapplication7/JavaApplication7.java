/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nagae
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner teclado = new Scanner(System.in);
        Date today = new Date();

        // Variables para los productos
        String nombre1, nombre2, nombre3, nombre4, nombre5;
        int cantidad1, cantidad2, cantidad3, cantidad4, cantidad5;
        double precio1, precio2, precio3, precio4, precio5;
        int categoria1, categoria2, categoria3, categoria4, categoria5;
        double totalConDescuento1, totalConDescuento2, totalConDescuento3, totalConDescuento4, totalConDescuento5;

        // Datos del primer producto
        System.out.println("Ingrese el nombre del producto #1:");
        nombre1 = teclado.nextLine();
        
        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        cantidad1 = teclado.nextInt();
        
        System.out.println("Ingrese el precio unitario del producto #1:");
        precio1 = teclado.nextDouble();
        
        System.out.println("Ingrese la categoría del producto #1 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria1 = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea

        double total1 = cantidad1 * precio1;
        String formato = """
                         ****************************************************
                                  BIENVENIDOS A LA BODEGA #######
                         ****************************************************
                              Producto:                 %S
                              Cantidad:                 %d
                              Precio unitario:          S/.%.2f
                              Precio sin descuento:     S/.%.2f
                              Precio con descuento:     S/.%.2f
                         ****************************************************
                         """;
        totalConDescuento1 = (cantidad1 > 100) ? total1 * 0.80 : (cantidad1 > 50) ? total1 * 0.90 : total1;
        System.out.printf(formato,nombre1,cantidad1,precio1,total1,totalConDescuento1);

        if (cantidad1 > 100) {
            System.out.println("Descuento aplicado: 20% (Cantidad mayor a 100)");
        } else if (cantidad1 > 50) {
            System.out.println("Descuento aplicado: 10% (Cantidad mayor a 50)");
        } else {
            System.out.println("Descuento aplicado: No hay descuento (Cantidad menor o igual a 50)");
        }
        switch (categoria1) {
            case 1 -> System.out.println("Producto electrónico. Revisar garantía.");
            case 2 -> System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
            case 3 -> System.out.println("Producto de ropa. Revisar tallas disponibles.");
        }

        // Datos del segundo producto
        System.out.println("\nIngrese el nombre del producto #2:");
        nombre2 = teclado.nextLine();
        
        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        cantidad2 = teclado.nextInt();
        
        System.out.println("Ingrese el precio unitario del producto #2:");
        precio2 = teclado.nextDouble();
        
        System.out.println("Ingrese la categoría del producto #2 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria2 = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea

        double total2 = cantidad2 * precio2;
        totalConDescuento2 = (cantidad2 > 100) ? total2 * 0.80 : (cantidad2 > 50) ? total2 * 0.90 : total2;
        System.out.printf("\nProducto: %s\n", nombre2);
        System.out.printf("Cantidad: %d\n", cantidad2);
        System.out.printf("Precio unitario: %.2f\n", precio2);
        System.out.printf("Valor total antes de descuentos: %.2f\n", total2);
        System.out.printf("Valor total después de descuentos: %.2f\n", totalConDescuento2);
        if (cantidad2 > 100) {
            System.out.println("Descuento aplicado: 20% (Cantidad mayor a 100)");
        } else if (cantidad2 > 50) {
            System.out.println("Descuento aplicado: 10% (Cantidad mayor a 50)");
        } else {
            System.out.println("Descuento aplicado: No hay descuento (Cantidad menor o igual a 50)");
        }
        switch (categoria2) {
            case 1 -> System.out.println("Producto electrónico. Revisar garantía.");
            case 2 -> System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
            case 3 -> System.out.println("Producto de ropa. Revisar tallas disponibles.");
        }

        // Datos del tercer producto
        System.out.println("\nIngrese el nombre del producto #3:");
        nombre3 = teclado.nextLine();
        
        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        cantidad3 = teclado.nextInt();
        
        System.out.println("Ingrese el precio unitario del producto #3:");
        precio3 = teclado.nextDouble();
        
        System.out.println("Ingrese la categoría del producto #3 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoria3 = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea

        double total3 = cantidad3 * precio3;
        totalConDescuento3 = (cantidad3 > 100) ? total3 * 0.80 : (cantidad3 > 50) ? total3 * 0.90 : total3;
        System.out.printf("\nProducto: %s\n", nombre3);
        System.out.printf("Cantidad: %d\n", cantidad3);
        System.out.printf("Precio unitario: %.2f\n", precio3);
        System.out.printf("Valor total antes de descuentos: %.2f\n", total3);
        System.out.printf("Valor total después de descuentos: %.2f\n", totalConDescuento3);
        if (cantidad3 > 100) {
            System.out.println("Descuento aplicado: 20% (Cantidad mayor a 100)");
        } else if (cantidad3 > 50) {
            System.out.println("Descuento aplicado: 10% (Cantidad mayor a 50)");
        } else {
            System.out.println("Descuento aplicado: No hay descuento (Cantidad menor o igual a 50)");
        }
        switch (categoria3) {
            case 1 -> System.out.println("Producto electrónico. Revisar garantía.");
            case 2 -> System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
            case 3 -> System.out.println("Producto de ropa. Revisar tallas disponibles.");
        }

        // Cálculo del valor total del inventario
        double valorTotalInventario = totalConDescuento1 + totalConDescuento2 + totalConDescuento3;

        // Resumen del inventario
        System.out.println("\n---\nResumen del inventario:");
        System.out.printf("1. %s - Valor total después de descuentos: %.2f\n", nombre1, totalConDescuento1);
        System.out.printf("2. %s - Valor total después de descuentos: %.2f\n", nombre2, totalConDescuento2);
        System.out.printf("3. %s - Valor total después de descuentos: %.2f\n", nombre3, totalConDescuento3);
        System.out.printf("\nEl valor total del inventario es: %.2f soles.\n", valorTotalInventario);

        // Advertencia si el valor total supera los 500 soles
        if (valorTotalInventario > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }else{
            System.out.println("El precio esta dentro del rango permitido");
        }
    }
}
    
    

