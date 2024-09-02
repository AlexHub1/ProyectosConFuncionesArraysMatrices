
package ListaEjercicios;

import javax.swing.*;

class Proyectos{
    
    String nombreP;
    int duracion;
    String estado;
    
    public Proyectos(String nombreProyecto, int tiempo, String estado){
        
        this.nombreP = nombreProyecto;
        this.duracion = tiempo;
        this.estado = estado;
    }
    
}

public class gestionProyectos {
    
    public static Proyectos [] proyectosI = new  Proyectos[4];
 
    
    
    
    public static void main(String[] args) {
        
        
        /*25.Desarrolla un programa en Java que permita gestionar los proyectos en una
        empresa de desarrollo de software. El programa debe:
        1. Declarar e inicializar un array de proyectos con información sobre nombre
        del proyecto, duración en días y estado (completado o en progreso).
        2. Implementar funcionalidades para mostrar los proyectos, agregar nuevos
        proyectos, actualizar el estado de un proyecto, buscar proyectos y ordenar
        los proyectos por duración.*/
        
        proyectosI[0] = new Proyectos ("Siembra Arboles",10,"En progreso");
        proyectosI[1] = new Proyectos ("Creacion Quiosco",100,"En progreso");
        proyectosI[2] = new Proyectos ("Siembra Orquideas",102,"En progreso");
        proyectosI[3] = new Proyectos ("Construccion cancha",150,"En progreso");
        
        
        servicios();
    }
    
    public static void servicios(){
        
        String [] servicioss = {"mostrar los proyectos","Agregar nuevos proyectos","Actualizar estados","Buscar Proyecto","Ordenar por duracion"};
        String seleccionServicio = (String) JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","SERVICIOS",JOptionPane.QUESTION_MESSAGE,null,servicioss,servicioss[0]);
        
        switch (seleccionServicio) {
            case "mostrar los proyectos":
                mostrarProyectos();
                break;
            case "Agregar nuevos proyectos":
                
                break;
            case "Actualizar estados":
                
                break;
            case "Buscar Proyecto":
                
                break;
            case "Ordenar por duracion":
                
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    public static void mostrarProyectos(){
        
        System.out.println("\033[31mNombre Proyecto"+ "========="+ "\033[31mDias Duracion"+ "========="+"\033[31mEstado");
        for (int i = 0; i < proyectosI.length; i++) {
            System.out.println(proyectosI[i].nombreP + "========="+ proyectosI[i].duracion + "========="+ proyectosI[i].estado);  
        }
        servicios();
    }
}
