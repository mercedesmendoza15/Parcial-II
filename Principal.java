/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mercedes Mendoza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner ( System.in);
        
        List<FacturaEncabezado> datosFac = new ArrayList();
        
       int serie;
       int numero;
       String fecha;
       String nombre;
       String direccion;
       int nit;
       char ingresar = 'n';
       int opcion = 0;
       
       do {
           System.out.println("Bienvenido esta en el registro de Factura");
           System.out.println("Seleccione una opcion");
           System.out.println("-----------------------------------------");
           System.out.println("1.Grabar Datos");
           System.out.println("2.Mostrar Datos");
           System.out.println("------------------------------------------");
           opcion = input.nextInt();
           
           switch (opcion) {
           case 1:
           System.out.println("-------------------------------------------------");
           System.out.println("Ingrese Datos del Registro Nuevo");
               System.out.println("---------------------------------------------");
               do {
                   System.out.println("Serie:");
                   serie = input.nextInt();
                   System.out.println("Numero de la Factura");
                   numero = input.nextInt();
                   System.out.println("Fecha:");
                   fecha = input.next();
                   System.out.println("Nombre:");
                   nombre = input.next();
                   System.out.println("Direccion:");
                   direccion = input.nextLine(); 
                   System.out.println("Ingresar Nit");
                   nit = input.nextInt();
                   
                   datosFac.add(new FacturaEncabezado(serie, numero, fecha, nombre, direccion, nit));
                   
                   System.out.println("Desea agregar otro Dato si/no");
                   ingresar = input.next().charAt(0);
               } while (ingresar == 's');
               break;
           case 2:
               System.out.println("-------------------------------");
               System.out.println("Datos de Facturas Ingresadas");
               System.out.println("-------------------------------");
               
               
               System.out.println("serie\t"+"No Factura\t"+"Fecha\t"+"Nombre\t"+"Direccion\t"+"Nit\t");
               for (FacturaEncabezado facturaEncabezado: datosFac);{
               
               System.out.println(FacturaEncabezado.getSerie()+"\t"+FacturaEncabezado.getNumero()+"\t"+FacturaEncabezado.getfecha()+"\t"+FacturaEncabezado.getNombre()+"\t"+FacturaEncabezado.getDireccion()+"\t"+FacturaEncabezado.getNit()+"\t");
               
               break;
           }
       }   

    
    
    

