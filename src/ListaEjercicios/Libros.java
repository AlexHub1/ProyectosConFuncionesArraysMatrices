
package ListaEjercicios;

import javax.swing.*;

public class Libros {
    
    static String [] libros = {"Cien años de soledad","1984","Don Quijote de la Mancha","Crimen y castigo","Orgullo y prejuicio","El Gran Gatsby"};
    static String [] autores = {"Gabriel García Márquez","George Orwell","Miguel de Cervantes","Fiódor Dostoyevski","Jane Austen","F. Scott Fitzgerald"};
    static int [] cantidadStock = {50,20,15,31,22,9};
    static String [] servicios = {"Mostrar el inventario","Agregar nueva copia","Solicitar prestamo","Buscar Libro","Ordenar Inventario por titulo"};
      
        
    
    public static void main(String[] args) {
        
        /*Ejercicio 21: Desarrolla un programa en Java que permita gestionar el inventario de una
        biblioteca. El programa debe:
        • Declarar e inicializar un array de libros con información básica (título,
        autor, cantidad en stock).
        • Implementar funcionalidades para mostrar el inventario, agregar
        nuevas copias de libros, prestar libros, buscar libros y ordenar el
        inventario por título.*/
        
        servicios(); 
    }
    
    public static void servicios(){
       String seleccionar = (String)JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","servicio",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]);
        
        if(seleccionar != null){
            
            switch (seleccionar) {
                case "Mostrar el inventario":      
                    mostrarInventario();
                    break;
                case "Agregar nueva copia": 
                    agregarCopia(nombreLibro());
                    break;
                case "Solicitar prestamo":   
                    prestamo(nombreLibro());
                    break;  
                case "Buscar Libro":   
                    imprimirInfo(nombreLibro());
                    servicios();
                    break;
                case "Ordenar Inventario por titulo":   
                    ordenarInventario();
                    break;
                default:
                    throw new AssertionError();
            }
        } 
    }
    
    public static int nombreLibro(){
        String nombreL = (String)JOptionPane.showInputDialog(null,"Seleccione el titulo del libro","Libros",JOptionPane.QUESTION_MESSAGE,null,libros,libros[0]);
        int posicionLibro = 0;
        for (int i = 0; i < libros.length; i++) {
            
            if(nombreL.equals(libros[i])){
               posicionLibro = i; 
               break;
            }
        }
        return posicionLibro;
    }
    public static void mostrarInventario(){
        System.out.println("\033[36m **********************************************\033[0m"); 
        System.out.println("\033[31m TITULO LIBRO "+" ------ "+" AUTOR "+" ------ "+" STOCK \033[0m");
        for (int i = 0; i <libros.length; i++) {
          
            System.out.println(libros[i]+" ------ " + "\033[31m" + autores[i]  + "\033[0m" +" ------ "+ cantidadStock[i]);
        }
        servicios();
    }
    
    public static void agregarCopia(int nombreLibro){
        
     imprimirInfo(nombreLibro);
     int numeroCopias=Integer.parseInt(JOptionPane.showInputDialog("Cuantas copias desea agregar del libro"));
     cantidadStock[nombreLibro]+=numeroCopias;
     imprimirInfo(nombreLibro);
     servicios();
    }
    
    public static void prestamo(int nombreLibro){
 
     imprimirInfo(nombreLibro);
     int confirmacion = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si desea solicitar el prestamo del libro y 0 si no"));
     if(confirmacion>0){
        cantidadStock[nombreLibro]-=1; 
     }
     imprimirInfo(nombreLibro);
     servicios();
    }
    public static void ordenarInventario(){
        
        for (int i = 0; i < libros.length-1; i++) {
            
            for (int j = 0; j < libros.length-1-i; j++) {
                //b>b = 0   b>f =-1  b>a = 1
                if(libros[j].compareTo(libros[j+1])>0){
                    String libro = libros[j];
                    libros[j] = libros[j+1];
                    libros[j+1] = libro;
                    
                    String autor = autores[j];
                    autores[j] = autores[j+1];
                    autores[j+1] = autor;
                    
                    int stock = cantidadStock[j];
                    cantidadStock[j] = cantidadStock[j+1];
                    cantidadStock[j+1] = stock;
                }
            }
        }
        
        mostrarInventario();
    }
    
    public static void imprimirInfo(int tituloL){
     System.out.println("\033[33m **********************************************");   
     System.out.println("\033[31m TITULO LIBRO ------ AUTOR ------ STOCK \033[0m");
     System.out.println(libros[tituloL]+" ------ " + "\033[31m" + autores[tituloL]  + "\033[0m" +" ------ "+ cantidadStock[tituloL]);
    }
    
}
