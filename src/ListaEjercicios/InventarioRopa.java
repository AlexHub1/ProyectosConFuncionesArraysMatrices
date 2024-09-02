
package ListaEjercicios;

import javax.swing.*;


class Ropa{
    
    String tipoRopa;
    int stock;
    double precio;
    
    public Ropa(String ropaT, int cantidad, double precio){
        
      this.tipoRopa = ropaT;
      this.stock = cantidad;
      this.precio = precio;
    }
    
    @Override
    public String toString() {
        
        return String.format("%-20s %-10d %-10.2f", tipoRopa, stock, precio);
    }

    
}

public class InventarioRopa {
    
   public static Ropa [] productos = new Ropa[6];
    
    public static void main(String[] args) {
        
        
        /*Ejercicio 24: Desarrolla un programa en Java que permita gestionar el inventario de una
        tienda de ropa. El programa debe:
        1. Declarar e inicializar un array de productos con información sobre tipo de
        ropa, cantidad en stock y precio.
        2. Implementar funcionalidades para mostrar el inventario, agregar nuevas
        unidades, vender productos, buscar productos y ordenar el inventario por
        precio. */
        
        
       servicios(); 
    }
    
    public static void servicios(){
        
       String [] servicios = {"Mostrar el inventario","Agregar nuevas unidades","vender productos","buscar productos","ordenar el inventario por precio"};
        String eleccionServicios = (String) JOptionPane.showInputDialog(null,"Seleccione el servicio que desea","SERVICIOS",JOptionPane.QUESTION_MESSAGE,null,servicios,servicios[0]);
        
        
        productos [0] = new Ropa ("Camisa Snake",10,50000.20);
        productos [1] = new Ropa ("Falda en cuero", 9, 110000.50);
        productos [2] = new Ropa ("Camisa Animalprint",10,50000.30);
        productos [3] = new Ropa ("Vestido azul claro", 5, 80000.60);
        productos [4] = new Ropa ("Camisa Blanca",10,50000.00);
        productos [5] = new Ropa ("Camiseta Negra", 9, 110000.0);
        
        switch (eleccionServicios) {
            case "Mostrar el inventario":
                mostrarI();
                break;
            case "Agregar nuevas unidades":
                agregarN(nombresProducto());
                break;   
            case "vender productos":
                vender(nombresProducto());
                break; 
            case "buscar productos":
                buscarP(nombresProducto());
                break; 
            case "ordenar el inventario por precio":
                ordenar();
                break; 
            default:
                throw new AssertionError();
        } 
    }
    
    public static void vender(int posicion){
      int cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a vender del producto"));
        if (cantidadVendida>0) {
            
            productos[posicion].stock -=cantidadVendida;
            JOptionPane.showMessageDialog(null,"Stock Actualizado");
        }else{
            JOptionPane.showMessageDialog(null,"Debe ser mayor a cero");
        }
         mostrarI();
        
    }
    
    public static void ordenar(){
        
        for (int i = 0; i < productos.length-1; i++) {
          
            if(productos[i].precio > productos[i+1].precio){
                
                Ropa precioM = productos[i]; 
                productos[i] = productos[i+1];
                productos[i+1] =precioM;            
            }  
        }
        mostrarI();
        servicios(); 
    }
    
    public static void buscarP(int posicion){
        
      JOptionPane.showMessageDialog(null,productos[posicion]);  
      servicios(); 
    }
    
    public static int nombresProducto(){
        
        String [] productosN = new String [productos.length];
        for (int i = 0; i < productos.length; i++) {
            productosN[i] = productos[i].tipoRopa;
        }
        
        String eleccion = (String) JOptionPane.showInputDialog(null,"Seleccione el producto","PRODUCTOS",JOptionPane.QUESTION_MESSAGE,null,productosN,productosN[0]);
        int posicion = -1; 
        for (int i = 0; i < productosN.length; i++) {
            if (productosN[i].equals(eleccion)) {
               posicion = i;   
            } 
        }
        return posicion;
    }
    
    public static void agregarN(int poscion){
        
        int cantidadUnidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de unidades a agregar"));
        
        productos[poscion].stock +=cantidadUnidades;
        JOptionPane.showMessageDialog(null, "Cantidad agregada con exito");
        mostrarI();
        
    }
    
    public static void mostrarI(){
        
        StringBuilder inventario = new StringBuilder();
        
        inventario.append("********* INVENTARIO *********\n");
//        inventario.append("\033[31m PRODUCTO \033[0m" + "----------" + "\033[31m STOCK \033[0m" + "----------" + "\033[31m PRECIO \033[0m");
            // tipo / la variable que va a almacenar los datos / array donde se va a iterar
        for (Ropa p : productos ) {
            
            inventario.append(p).append("\n");
        }
        
        JOptionPane.showMessageDialog(null,inventario.toString(),"Inventario",JOptionPane.INFORMATION_MESSAGE);
        
        servicios(); 
    }
}
