
package ListaEjercicios;

import javax.swing.*;


public class Matrices {
   
    
    public static int cantidadLibros;
    public static int atributos = 5;
//    public String [] 
    //filas  columnas
    private static Object[][] inventario;
    private static int contadorLibros;
    static String [] servicios = {"Mostrar Inventario","Agregar Libros","Eliminar Libros","Valor Total Inventario","Valor Total de cada libro"};
    public static void main(String[] args) {
        
    /*Ejercicio 34:Desarrolla un programa en Java que permita gestionar el inventario de una
    librería. El programa debe:
    1. Solicitar la información básica de cada libro (título, autor, ISBN, precio,
    cantidad en stock).
    2. Permitir agregar y eliminar libros del inventario.
    3. Calcular el valor total del inventario.
    4. Mostrar la información detallada de cada libro, incluyendo el valor total de
    cada tipo de libro en stock.*/
    
    
        int numeroInicialLibros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de libros a ingresar"));
        cantidadLibros = numeroInicialLibros;
        
        inventario = new Object[cantidadLibros][atributos];
        
        for (int i = 0; i < cantidadLibros; i++) {
          
                String tituloL =(String)JOptionPane.showInputDialog("Ingrese el titulo del libro "+ (i+1));
                inventario[i][0] = tituloL;
                String autorL =(String)JOptionPane.showInputDialog("Ingrese el autor del libro "+ (i+1));
                inventario[i][1] = autorL;
                String ISBNL =(String)JOptionPane.showInputDialog("Ingrese el ISBN del libro "+ (i+1));
                inventario[i][2] = ISBNL;
                int precioL =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del libro "+ (i+1)));
                inventario[i][3] = precioL;
                int stock =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del libro "+ (i+1)));
                inventario[i][4] = stock;
                
                contadorLibros++;
        }
        servicios();
    }
                       
    public static void servicios(){
        
        String seleccionServicio= (String) JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","SERVICIOS",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]); 
       
       if(seleccionServicio != null){
            
            switch (seleccionServicio) {
                case "Mostrar Inventario":      
                    inventarioTotal();
                    break;
                case "Agregar Libros": 
                    agregarLibro();
                    break;
                case "Eliminar Libros":   
                   eliminarLibros();
                    break;  
                case "Valor Total Inventario":   
                    valorTotalInventario();
                    break;
                case "Valor Total de cada libro":   
                    valorTotalLibros();
                    break;
                default:
                    throw new AssertionError();
            }
        } 
       
    }
    
   
    
    public static void eliminarLibros(){
        
       int librosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros para eliminar")); 
       
       Object[][] nuevoInventario = new Object[cantidadLibros - librosA][atributos];
       
        Object [] nombresL = new String [contadorLibros];
        
        for (int i = 0; i < contadorLibros; i++) {
            nombresL[i]=inventario[i][0];
        }
        
        for (int i = 0; i < librosA; i++) {
            
            String seleccionLibro = String.valueOf(JOptionPane.showInputDialog(null,"Seleccione el libro a eliminar","ELIMINAR LIBROS",JOptionPane.QUESTION_MESSAGE,null,nombresL,nombresL[0])); 
            if (seleccionLibro!= null){
                for (int j = 0; j < cantidadLibros; j++) {
                    if(inventario[j][0].equals(seleccionLibro)){
                        int posicionL = j;
                        for (int m = 0, l = 0; m < cantidadLibros; m++) {
                           if (m != posicionL) {
                                for (int k = 0; k < atributos; k++) {
                                   nuevoInventario[l][k] = inventario[m][k];
                                }
                               l++;
                            }
                       }
                        
                        cantidadLibros-=librosA;
                        inventario = nuevoInventario;
                        JOptionPane.showMessageDialog(null, "Libro eliminado.");
                   } 
               }   
            }
        }
        
        inventarioTotal();

    }

    public static void inventarioTotal(){
       System.out.println("\033[33m **************** INVENTARIO ******************************\033[0m");    
       System.out.println("TITULO" + "\033[31m -------- \033[0m" + "AUTOR" + "\033[31m -------- \033[0m" + "ISBN" + "\033[31m -------- \033[0m" + "PRECIO" + "\033[31m -------- \033[0m" + "STOCK");
       
        for (int i = 0; i < cantidadLibros; i++) {
              
              System.out.println(inventario[i][0] + "\033[31m -------- \033[0m" + inventario[i][1]+ "\033[31m -------- \033[0m" + inventario[i][2] + "\033[31m -------- \033[0m" + inventario[i][3] + "\033[31m -------- \033[0m" + inventario[i][4]);  
        } 
        
        servicios();
    }
    
    public static void agregarLibro(){
        
      int librosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros para ingresar"));
     JOptionPane.showMessageDialog(null,cantidadLibros);

        if (librosA >0) {
            
            Object[][] nuevoInventario = new Object[cantidadLibros + librosA][atributos];
        
            // Copiar los libros existentes a la nueva matriz
            for (int i = 0; i < cantidadLibros; i++) {
                for (int j = 0; j < atributos; j++) {
                    nuevoInventario[i][j] = inventario[i][j];
                }
            }
             cantidadLibros += librosA;
            for (int i = 0; i < librosA; i++) {
 
                String tituloL =(String)JOptionPane.showInputDialog("Ingrese el titulo del libro "+ (i+1));
                nuevoInventario[contadorLibros][0] = tituloL;
                String autorL =(String)JOptionPane.showInputDialog("Ingrese el autor del libro "+ (i+1));
                nuevoInventario[contadorLibros][1] = autorL;
                String ISBNL =(String)JOptionPane.showInputDialog("Ingrese el ISBN del libro "+ (i+1));
                nuevoInventario[contadorLibros][2] = ISBNL;
                double precioL =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro "+ (i+1)));
                nuevoInventario[contadorLibros][3] = precioL;
                int stock =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del libro "+ (i+1)));
                nuevoInventario[contadorLibros][4] = stock; 
                
                contadorLibros++;
            }
            inventario = nuevoInventario;
        
            inventarioTotal();
        }else{
            JOptionPane.showMessageDialog(null, "Debe ser mayor a 0");
        }
        servicios();
    }
    
    public static void valorTotalInventario(){
        
        int totalInventario = 0 ;
        for (int i = 0; i < cantidadLibros; i++) {
           totalInventario+= (int) inventario[i][3] * (int) inventario[i][4];
        }
        JOptionPane.showMessageDialog(null, "El total del inventario es de $"+totalInventario);
        
        servicios();
    }
    
    public static void valorTotalLibros(){
        
        
        for (int i = 0; i < cantidadLibros; i++) {
           int costoLibro = (int) inventario[i][3] * (int) inventario[i][4];
           
           System.out.println("\033[33m **************** COSTO TOTAL LIBROS **************************\033[0m");   
           System.out.println("LIBRO" + "\033[31m -------- \033[0m" + "COSTO TOTAL");
            System.out.println(inventario[i][0] + "\033[31m -------- \033[0m" + " $"+ costoLibro);
        }
        servicios();
    }


}
    
    

