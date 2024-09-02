
package ListaEjercicios;

import javax.swing.*;


public class Vehiculos {
    
    static String [] vehículos = {"Toyota Camry","Ford Mustang","Chevrolet Silverado","Honda Civic","BMW Serie 3","Audi Q5"};
    static String [] modelo = {"LE","Shelby GT500","High Country","EX-L","M340i","Premium Plus"};
    static String [] matrícula = {"ABC 1234","XYZ 5678","LMN 9012","PQR 3456","STU 7890","VWX 1234"};
    static int [] precio = {200000,320000,300000,180000,360000,400000};
    static String [] disponibilidad = {"Disponible","Disponible","Disponible","Disponible","Disponible","Disponible"};
    
    static String [] servicios = {"Mostrar la lista de vehiculos","Alquilar Vehiculo","Devolver Vehiculo","Buscar Vehiculo","Ordenar Inventario por precio"};
    
    
    public static void main(String[] args) {
        
        
        /*Ejercicio 22: Desarrolla un programa en Java que permita gestionar el alquiler de
        vehículos en una agencia de alquiler de coches. El programa debe:
        1. Declarar e inicializar un array de vehículos con información básica (modelo,
        matrícula, precio por día, disponibilidad).
        2. Implementar funcionalidades para mostrar la lista de vehículos, alquilar un
        vehículo, devolver un vehículo, buscar un vehículo y ordenar la lista por
        precio.*/
        
        servicios();
    }
    
    public static void servicios(){
       String seleccionar = (String)JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","servicio",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]);
        
        if(seleccionar != null){
            
            switch (seleccionar) {
                case "Mostrar la lista de vehiculos":      
                    mostrarListaVehiculos();
                    break;
                case "Alquilar Vehiculo": 
                    alquilarVehiculo(nombreVehiculo());
                    break;
                case "Devolver Vehiculo":   
                    devolverVehiculo(nombreVehiculo());
                    break;  
                case "Buscar Vehiculo":   
                    imprimirInfoVehiculo(nombreVehiculo());
                    servicios();
                    break;
                case "Ordenar Inventario por precio":   
                    ordenarListaVehiculos();
                    break;
                default:
                    throw new AssertionError();
            }
        } 
    }
    
    public static void mostrarListaVehiculos(){
      
        System.out.println("\033[36m **********************************************\033[0m"); 
        System.out.println("\033[31m VEHICULO "+" ------ "+" MODELO "+" ------ "+" MATRICULA "+" ------ "+ "PRECIO"+" ------ "+ "DISPONIBILIDAD \033[0m");
        for (int i = 0; i <vehículos.length; i++) {
          
            System.out.println(vehículos[i]+" ------ " + "\033[31m" + modelo[i]  + "\033[0m" +" ------ "+ matrícula[i] +" ------ "+ "\033[31m" + precio[i]  + "\033[0m" +" ------ "+ disponibilidad[i]);
        }
        servicios();
    }
    public static int nombreVehiculo(){
        String nombreV = (String)JOptionPane.showInputDialog(null,"Seleccione el vehiculo","Vehiculos",JOptionPane.QUESTION_MESSAGE,null,vehículos,vehículos[0]);
        int posicionVehiculo = 0;
        for (int i = 0; i < vehículos.length; i++) {
            
            if(nombreV.equals(vehículos[i])){
               posicionVehiculo = i; 
               break;
            }
        }
        return posicionVehiculo;
    }
    
    public static void alquilarVehiculo(int posicionVehiculo){
       
        imprimirInfoVehiculo(posicionVehiculo);
        
        if(disponibilidad[posicionVehiculo].equals("Disponible")){
          int confirmacion = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si desea alquilar el vehiculo y 0 si no"));
            if (confirmacion>0) {
               JOptionPane.showMessageDialog(null, "Vehiculo Alquilado Exitosamente");
               disponibilidad[posicionVehiculo]= "NO Disponible";
               imprimirInfoVehiculo(posicionVehiculo);
            }
        }else{
            JOptionPane.showMessageDialog(null, "EL VEHICULO NO ESTA DISPONIBLE");
        }
       
        servicios();
    }
    
    public static void devolverVehiculo(int posicionV){
        
        if(disponibilidad[posicionV].equals("NO Disponible")){
            
            JOptionPane.showMessageDialog(null, "Vehiculo Devuelto Exitosamente");
            disponibilidad[posicionV]= "Disponible";
        }else{
            JOptionPane.showMessageDialog(null, "Vehiculo sin estado para devolver");
        }
        
       servicios(); 
    }
    
    public static void ordenarListaVehiculos(){
        
        for (int i = 0; i < vehículos.length-1; i++) {
            
            for (int j = 0; j < vehículos.length-1-i; j++) {
                
                if(precio[j]> precio[j+1]){
                    String vehiculo = vehículos[j];
                    vehículos[j] = vehículos[j+1];
                    vehículos[j+1] = vehiculo;
                    
                    String modeloV = modelo[j];
                    modelo[j] = modelo[j+1];
                    modelo[j+1] = modeloV;
                    
                    String mat = matrícula[j];
                    matrícula[j] = matrícula[j+1];
                    matrícula[j+1] = mat;
                    
                    int prec = precio[j];
                    precio[j] = precio[j+1];
                    precio[j+1] = prec;
                    
                    String dispo = disponibilidad[j];
                    disponibilidad[j] = disponibilidad[j+1];
                    disponibilidad[j+1] = dispo;
                }
            }
        }
        
        mostrarListaVehiculos();
    }
    
    
    public static void imprimirInfoVehiculo(int posicionV){
     System.out.println("\033[33m **********************************************");   
     System.out.println("\033[31m VEHICULO "+" ------ "+" MODELO "+" ------ "+" MATRICULA "+" ------ "+ "PRECIO"+" ------ "+ "DISPONIBILIDAD \033[0m");
     System.out.println(vehículos[posicionV]+" ------ " + "\033[31m" + modelo[posicionV]  + "\033[0m" +" ------ "+ matrícula[posicionV] +" ------ "+ "\033[31m" + precio[posicionV]  + "\033[0m" +" ------ "+ disponibilidad[posicionV]);
    }
}
