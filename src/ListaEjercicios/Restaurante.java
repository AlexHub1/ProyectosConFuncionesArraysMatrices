
package ListaEjercicios;

import javax.swing.*;

public class Restaurante {
    
    static String [] mesas = {"PremiumXS","PremiumS","PremiumM","PremiumL","Normal"};
    static int [] capacidad = {10,13,18,22,4};
    static String [] disponibilidad = {"Disponible","Disponible","Disponible","Disponible","Disponible"};
    static String [] servicios = {"Mostrar Disponibilidad","Reserva","Cancelar Reserva","Buscar Mesa","Ordenar Mesas por capacidad"};
    
    
    public static void main(String[] args) {
        
        /*Ejercicio 23:  Desarrolla un programa en Java que permita gestionar las reservas en un
        restaurante. El programa debe:
        1. Declarar e inicializar un array de mesas con información sobre su
        disponibilidad y capacidad.
        2. Implementar funcionalidades para mostrar la disponibilidad, realizar nuevas
        reservas, cancelar reservas, buscar mesas y ordenar las mesas por
        capacidad.*/   
        
        servicios();
    }
    
    public static void servicios(){
        
       String seleccionServicio= (String) JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","SERVICIOS",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]); 
       
       if(seleccionServicio != null){
            
            switch (seleccionServicio) {
                case "Mostrar Disponibilidad":      
                    disponibilidad();
                    break;
                case "Reserva": 
                    reserva(nombreMesa());
                    break;
                case "Cancelar Reserva":   
                    cancelarReserva(nombreMesa());
                    break;  
                case "Buscar Mesa":   
                    buscarMesa(nombreMesa());
                    break;
                case "Ordenar Mesas por capacidad":   
                    ordenarListaVehiculos();
                    break;
                default:
                    throw new AssertionError();
            }
        } 
    }
    
    public static void disponibilidad(){
       
      int mesasDisponibles = 0;  
      System.out.println("MESA" + "\033[31m -------- \033[0m" + "CAPACIDAD" + "\033[31m -------- \033[0m" + "DISPONIBILIDAD");
        for (int i = 0; i < mesas.length; i++) {
            if (disponibilidad[i].equals("Disponible")) 
            {
               mesasDisponibles=1;
               System.out.println(mesas[i] + "\033[31m -------- \033[0m"+ capacidad[i] + "\033[31m -------- \033[0m" + disponibilidad[i]); 
            } 
        }
        if(mesasDisponibles !=1 ){
            System.out.println("NO HAY MESAS DISPONIBLES");
        }
        servicios();
    }
    
    public static int nombreMesa(){
        
       String mesa= (String) JOptionPane.showInputDialog(null,"Seleccione la mesa que desea","MESAS",JOptionPane.QUESTION_MESSAGE,null,mesas,mesas[0]); 
       int posicionM = 0;
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i].equals(mesa)) {
                posicionM = i;
            }  
        }
       return posicionM; 
    }
    
    public static void reserva(int numeroMesa){
      
      
            if (disponibilidad[numeroMesa].equals("Disponible")) 
            {
                
                JOptionPane.showMessageDialog(null, "Mesa reservada exitosamente");
                System.out.println("\033[33m ****************RESERVACION******************************\033[0m");   
                System.out.println("MESA" + "\033[31m -------- \033[0m" + "CAPACIDAD" + "\033[31m -------- \033[0m" + "DISPONIBILIDAD");
                disponibilidad[numeroMesa] = "NO Disponible";
                System.out.println(mesas[numeroMesa] + "\033[31m -------- \033[0m"+ capacidad[numeroMesa] + "\033[31m -------- \033[0m" + disponibilidad[numeroMesa]); 
            }else{
                
                JOptionPane.showMessageDialog(null, "Mesa NO Disponible");
               
            }
        servicios();
    }
    
    public static void cancelarReserva(int numeroMesa){
        
        
            if (disponibilidad[numeroMesa].equals("NO Disponible")) 
            {
                JOptionPane.showMessageDialog(null, "Cancelacion Exitosa");
                System.out.println("\033[33m ****************CANCELACION RESERVA******************************\033[0m");   
                System.out.println("MESA" + "\033[31m -------- \033[0m" + "CAPACIDAD" + "\033[31m -------- \033[0m" + "DISPONIBILIDAD");
                disponibilidad[numeroMesa] = "Disponible";
                System.out.println(mesas[numeroMesa] + "\033[31m -------- \033[0m"+ capacidad[numeroMesa] + "\033[31m -------- \033[0m" + disponibilidad[numeroMesa]); 
            }else{
                
                JOptionPane.showMessageDialog(null, "Esta mesa no tiene una reserva para cancelar");
                
            }
       servicios();
    }
    
    public static void buscarMesa(int numeroMesa){
      System.out.println("\033[33m ****************BUSQUEDA******************************\033[0m");   
      System.out.println("MESA" + "\033[31m -------- \033[0m" + "CAPACIDAD" + "\033[31m -------- \033[0m" + "DISPONIBILIDAD");
      System.out.println(mesas[numeroMesa] + "\033[31m -------- \033[0m"+ capacidad[numeroMesa] + "\033[31m -------- \033[0m" + disponibilidad[numeroMesa]);     
      
      servicios();
    }
    
    
    public static void ordenarListaVehiculos(){
        
        for (int i = 0; i < mesas.length-1; i++) {
            
            for (int j = 0; j < mesas.length-1-i; j++) {
                
                if(capacidad[j]> capacidad[j+1]){
                    
                    String mesa = mesas[j];
                    mesas[j] = mesas[j+1];
                    mesas[j+1] = mesa;
 
                    int cap = capacidad[j];
                    capacidad[j] = capacidad[j+1];
                    capacidad[j+1] = cap;
                    
                    String dispo = disponibilidad[j];
                    disponibilidad[j] = disponibilidad[j+1];
                    disponibilidad[j+1] = dispo;
                }
            }
        }  
        listaMesas();
    }
    
    public static void listaMesas(){
       
        
        System.out.println("\033[36m ****************MESAS ORGANIZADAS******************************\033[0m");   
        System.out.println("MESA" + "\033[31m -------- \033[0m" + "CAPACIDAD" + "\033[31m -------- \033[0m" + "DISPONIBILIDAD");
        for (int i = 0; i <mesas.length; i++) {
          
            System.out.println(mesas[i] + "\033[31m -------- \033[0m"+ capacidad[i] + "\033[31m -------- \033[0m" + disponibilidad[i]);     
        }
        servicios();
    }
}
