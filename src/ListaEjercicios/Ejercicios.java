
package ListaEjercicios;

import javax.swing.*;

public class Ejercicios {
   
    public static void main(String[] args) {
        
        
            /* FUNCIONES

    Ejercicio 1: La empresa GlobalTech necesita un programa en Java para calcular el
    salario anual y la deducción de retención en la fuente de un empleado. El
    programa debe incluir una función que reciba el salario mensual de un
    empleado y el porcentaje de retención en la fuente, y devuelva el salario
    anual total y el monto de la deducción de retención en la fuente.*/
    
//    int salarioMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario mensual"));
//    int porcentaje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje de retención en la fuente"));
//    
//    //valor que se extrae
//    double valorDeduccion = salarioMensual * (porcentaje/100.00);
//    double salarioNeto = (salarioMensual-valorDeduccion)*12;
//   
//    JOptionPane.showMessageDialog(null, "El salario anual del empleado es de $" + salarioNeto + " y el monto de la deducción de retención en la fuente es de $" + valorDeduccion*12);
//    
    
    /*EJERCICIO 2:La tienda SuperMart necesita un programa en Java para determinar el nivel
    de stock de productos, con una función que recibe las cantidades de varios
    productos y el nivel mínimo requerido de stock, y determina si es necesario
    realizar un pedido para cada producto */
    
//    String [] productos = {"FRESAS", "LECHE", "SUAVITEL", "HELADOS"};
//    
//        for (int i = 0; i < productos.length; i++) {
//            
//          int cantidadActualP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad actual de " + productos[i])); 
//          int cantidadMinimaP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad minima requerida de stock de " + productos[i])); 
//          
//          if(cantidadActualP < cantidadMinimaP ){
//             JOptionPane.showMessageDialog(null, "Debe realizar pedido de " + productos[i] + " tiene "+ cantidadActualP+ " y debe tener MINIMO " + cantidadMinimaP);
//          }
//          
//        }
//        
    /*Ejercicio 3:Una fábrica necesita un programa en Java para calcular el costo total de
    producción, con una función que recibe los costos de materiales, mano de
    obra y gastos generales, y devuelve el costo total de producción. */ 
    
    
//    int costosMateriales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en los costos de materiales"));
//    int manObra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en mano de obra"));
//    int gastosGenerales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en gastos generales"));
//   
//    int costoTotal = costosMateriales+manObra+gastosGenerales;
//    JOptionPane.showMessageDialog(null, "El costo total de produccion es de $"+costoTotal );
//    
    /*Ejercicio 4: La corporación FinTech necesita un programa en Java para evaluar el
    rendimiento trimestral de departamentos, con una función que recibe las
    ganancias trimestrales de varios departamentos y determina cuál tuvo el
    mejor rendimiento. */
    
//    String [] departamentos ={"ADMINISTRACION", "GERENCIAL", "MEDICO"};
//    int [] gananciasTrimestrales = new int[departamentos.length];
//    for (int i = 0; i < departamentos.length; i++) {
//            
//          gananciasTrimestrales[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ganancia trimestal de  " + departamentos[i])); 
//    }
//    int mayorGanancias = gananciasTrimestrales[0];
//    String departamentoM = departamentos[0];
//    for (int i = 1; i < gananciasTrimestrales.length; i++) {
//            
//       if (gananciasTrimestrales[i] > mayorGanancias){
//           
//           mayorGanancias = gananciasTrimestrales[i];
//           departamentoM = departamentos[i];
//           
//           JOptionPane.showMessageDialog(null, "El departamento con mayor ganancia trimestral es " + departamentoM );
//           
//       }else if (gananciasTrimestrales[i] == mayorGanancias){
//           
//          JOptionPane.showMessageDialog(null, "El departamento de "+ departamentoM +" tiene las mismas ganancias que el departamento de "+ departamentos[i]);
//
//       }
//    }
    
    /*Ejercicio 5:Una empresa de tecnología necesita un programa en Java para calcular la
    depreciación anual de un activo, con una función que recibe el valor inicial,
    el valor residual y la vida útil de un activo, y devuelve la depreciación anual
    utilizando el método de línea recta*/

    
//    double valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor Inicial"));
//    double valoResidual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor Residual"));
//    double vidaUtil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida Util del producto"));
//    
//    double depreciaciónAnual = (valorInicial-valoResidual)/vidaUtil;
//    JOptionPane.showMessageDialog(null, "La depreciacion anual del producto es $"+depreciaciónAnual);
    
  /*Ejercicio 6: Un asesor financiero necesita un programa en Java para calcular la
    rentabilidad de una inversión, con una función que recibe el capital inicial, la
    tasa de interés anual y el número de años, y devuelve el valor futuro de la
    inversión utilizando interés compuesto.*/
    
//    double capitalInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital inicial"));
//    double tasaInteres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tasa de interes anual"));
//    int anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de años para la inversion"));
//    
//    double valorFututro = 1+(tasaInteres/100);
//    double potencia = Math.pow(valorFututro, anos);
//    double valorFinal = capitalInicial*potencia;
//    
//    JOptionPane.showMessageDialog(null, "El valor futuro de la inversion es de $"+ valorFinal);
//    
    /*Ejercicio 7: La empresa WorkHours Inc. necesita un programa en Java para generar un
    informe de horas extras trabajadas por empleados, con una función que
    recibe los nombres de empleados y las horas extras trabajadas por cada
    uno, y genera un informe detallado de las horas extras*/
     
//    int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados"));
//    
//    String [] nombrEmpleados = new String [numEmpleados];
//    int [] horasExtras = new int [numEmpleados];
//    
//        for (int i = 0; i < numEmpleados; i++) {
//            
//            nombrEmpleados[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese el nombre del empleado"));
//            horasExtras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras trabajadas"));
//        }
//        System.out.println("NOMBRE EMPLEADO -------- HORAS EXTRAS TRABAJADAS");
//        
//        for (int i = 0; i < numEmpleados; i++) {
//          
//            System.out.println(nombrEmpleados[i]+" -------- "+ horasExtras[i]);
//        }
//  

    /*Ejercicio 8: Una constructora necesita un programa en Java para calcular el costo de
    un proyecto de construcción, con una función que recibe los costos de
    materiales, mano de obra y equipos, y devuelve el costo total del proyecto.*/
    
    
//    int costosMateriales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en los costos de materiales"));
//    int manObra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en mano de obra"));
//    int costoEquipos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en los costos de equipos"));
//
//    int costoTotal = costosMateriales+manObra+costoEquipos;
//    JOptionPane.showMessageDialog(null, "El costo total de produccion es de $"+costoTotal );

    
    /*Ejercicio 9: Una empresa de manufactura necesita un programa en Java para calcular
    la nómina semanal de los empleados, con una función que recibe las horas
    trabajadas y el salario por hora de varios empleados, y devuelve la nómina
    total de la semana.*/
    
//    int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados"));
//
//    double totalPagar = 0.0;
//    
//        for (int i = 1; i <= numEmpleados; i++) {
//          
//         int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajas esta semana del empleado "+ i)); 
//         double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora del empleado "+ i)); 
//         double nominas = horasTrabajadas*salarioHora;
//         totalPagar+= nominas;
//         JOptionPane.showMessageDialog(null,"la nomina total de la semana del empleado " +i+ " es de $" +nominas);
//        }
//        
//        JOptionPane.showMessageDialog(null,"El total de nominas que debe pagar $"+totalPagar);
    
    /*Ejercicio 10: Una empresa de mensajería necesita un programa en Java para calcular el
    tiempo estimado de entrega de un paquete, con una función que recibe la
    distancia y la velocidad promedio del vehículo de entrega, y devuelve el
    tiempo estimado de entrega.*/  
    
//    double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia promedio")); 
//    double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad promedio")); 
//    
//    
//    double tiempo = distancia/velocidad;
//    JOptionPane.showMessageDialog(null,"El tiempo estimado de entrega es de"+tiempo);
    
    /*Ejercicio 11: Una empresa de transporte necesita un programa en Java para calcular el
    consumo de combustible de una flota de vehículos, con una función que
    recibe la distancia recorrida y el combustible consumido por varios
    vehículos, y devuelve el consumo promedio de combustible de la flota.*/
         
//    int numVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos"));
//    
//    double distanciaT = 0.0;
//    double combustibleT = 0.0;
//    double promedio = distanciaT/combustibleT;
//        for (int i = 1; i <= numVehiculos; i++) {
//            
//           double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia del vehiculo "+ i)); 
//           double combustible = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el combustible consumido"));  
//           distanciaT+=distancia;
//           combustibleT+=combustible;
//        }
//        
//        JOptionPane.showMessageDialog(null,"El consumo promedio de combustible de la flota es de "+ promedio+ " km/L");
//        
      /*Ejercicio 12: Una liga deportiva necesita un programa en Java para determinar el equipo
        con más puntos en una liga, con una función que recibe los puntos de
        varios equipos y determina cuál tiene la mayor cantidad de puntos.*/  
    
      
//      String [] equipos ={"ALCONES", "ESPARTANOS", "GRL"};
//        int [] puntos = new int[equipos.length];
//        
//        for (int i = 0; i < equipos.length; i++) {
//            
//          puntos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos del equipo  " + equipos[i])); 
//    }
//    int mayorGanancias = puntos[0];
//    String equipoM = equipos[0];
//    
//    for (int i = 1; i < puntos.length; i++) {
//            
//       if (puntos[i] > mayorGanancias){
//           
//           mayorGanancias = puntos[i];
//           equipoM = equipos[i]; 
//       }else if (puntos[i] == mayorGanancias){
//           
//          JOptionPane.showMessageDialog(null, "El departamento de "+ equipoM +" tiene las mismas ganancias que el departamento de "+ equipos[i]);
//          
//       }
//    }
//       JOptionPane.showMessageDialog(null, "El equipo con mayor cantidad de puntos es " + equipoM );
      

    /*Ejercicio 13:  Una universidad necesita un programa en Java para calcular el rendimiento
    académico de un estudiante, con una función que recibe las calificaciones
    de un estudiante en varias asignaturas y devuelve su promedio.*/
       
//    int numAsignaturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Asignaturas"));
//    
//    double totalAsignaturas = 0.0;
//        for (int i = 1; i <= numAsignaturas; i++) {
//            
//          int notaAsignatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la NOTA de la Asignatura "+ i));  
//          totalAsignaturas+=notaAsignatura;
//        }
//       
//        JOptionPane.showMessageDialog(null, "La nota promedio de las calificaciones es de " + totalAsignaturas/numAsignaturas );
//       

    /*Ejercicio 14: Una tienda en línea necesita un programa en Java para determinar el mejor
    producto basado en las opiniones de los clientes, con una función que
    recibe las calificaciones de varios productos y determina cuál tiene la mejor
    calificación promedio.*/
    
//    int numPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que van a calificar"));
//    String [] productos = {"PASTEL DE POLLO","EMPANADA ESPECIAL","CAFE"};
//    double calificacionPP = 0;
//    double calificacionEE = 0;
//    double calificacionCF = 0;
//        for (int i = 1; i <= numPersonas; i++) {
//            
//            for (int j = 0; j < productos.length; j++) {
//                
//               int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion de "+ productos[j]));
//                if (productos[j].equals("PASTEL DE POLLO") ) {
//                   calificacionPP+= calificacion;
//                }else if (productos[j].equals("EMPANADA ESPECIAL")){
//                    calificacionEE+=calificacion; 
//                }else{
//                    calificacionCF+=calificacion;
//                }
//            }   
//        }
//        
//        double promedio1 = calificacionPP/numPersonas;
//        double promedio2 = calificacionEE/numPersonas;
//        double promedio3 = calificacionCF/numPersonas;
//        
//        double mejorPromedio = Math.max(promedio1, Math.max(promedio2, promedio3));
//        String mejorProducto = "null";
//        if (mejorPromedio == promedio1) {
//            mejorProducto = "PASTEL DE POLLO";
//        } else if (mejorPromedio == promedio2) {
//            mejorProducto = "EMPANADA ESPECIAL";
//        } else {
//            mejorProducto = "CAFE";
//        }
//        
//        JOptionPane.showMessageDialog(null, "La mejor calificacion promedio es de "+ mejorProducto);
//    

    /*Ejercicio 15: Un fabricante de electrodomésticos necesita un programa en Java para
    calcular la eficiencia energética de un electrodoméstico, con una función
    que recibe el consumo de energía y el rendimiento de varios
    electrodomésticos, y devuelve la eficiencia energética de cada uno.*/

//    String [] electrodomesticos = {"NEVERA","LAVADORA","MICROONDAS"};
//  
//        for (int i = 0; i < electrodomesticos.length; i++) {
//            
//         double consumoEnergia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el consumo de energia de "+electrodomesticos[i]));   
//         double rendimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rendimiento de "+electrodomesticos[i]));
//         double eficiencia = rendimiento/consumoEnergia;
//         JOptionPane.showMessageDialog(null, "La eficiencia de "+ electrodomesticos[i]+ " es de "+ eficiencia +" kWh");
//        }
        
    /*Ejercicio 16:Una empresa de organización de eventos necesita un programa en Java
    para calcular el costo de un evento corporativo, con una función que recibe
    los costos de alquiler, catering, entretenimiento y otros gastos, y devuelve el
    costo total del evento. */    
    
//    double costosAlquiler = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en los costos de Alquiler"));
//    double catering = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en catering"));
//    double entretenimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en el entretenimiento"));
//    double otrosGastos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total en otros gastos"));
//    
//    double costoTotal = costosAlquiler+catering+entretenimiento+otrosGastos;
//    JOptionPane.showMessageDialog(null, "El costo total del evento corporativo es de $"+costoTotal );
    
    
    /*Ejercicio 17: Un centro de atención al cliente necesita un programa en Java para
    determinar el nivel de satisfacción del cliente, con una función que recibe
    las puntuaciones de satisfacción de varios clientes y devuelve el promedio
    de satisfacción.*/
    
//    int numclientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que van a calificar"));
//    double calificaciones = 0.0;
//        for (int i = 0; i < numclientes; i++) {
//            
//          double calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nivel de satisfaccion"));
//          calificaciones+=calificacion;
//        }
//    
//    double promedio = calificaciones/numclientes;
//    JOptionPane.showMessageDialog(null, "El promedio de satisfaccion entre los clientes es de "+promedio );
    
    
    /*Ejercicio 18: Un departamento de ventas necesita un programa en Java para calcular el
    porcentaje de cumplimiento de metas, con una función que recibe la
    cantidad de metas cumplidas y el total de metas establecidas, y devuelve el
    porcentaje de cumplimiento.*/
    
//    int nuMetasE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas establecidas"));
//    int nuMetasC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas CUMPLIDAS"));
//    
//    int porcentaje = (nuMetasC/nuMetasE)*100;
//    
//    JOptionPane.showMessageDialog(null, "El porcentaje de cumplimiento es de " +porcentaje+ "%" );
    
    /*Ejercicio 19: Un centro de distribución necesita un programa en Java para determinar la
    capacidad restante de almacenamiento, con una función que recibe la
    capacidad total del almacén y la cantidad de espacio ocupado, y devuelve
    la capacidad restante.*/
    
    
//    int capacidadTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad total del almacen"));
//    int espaciOcupado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de espacio ocupado"));
//    
//    JOptionPane.showMessageDialog(null,"La capacidad de almacenamiento restante es de "+ (capacidadTotal-espaciOcupado));
    
    /*Ejercicio 20: Una empresa de taxis necesita un programa en Java para calcular el costo
    por kilómetro de un servicio de taxi, con una función que recibe la distancia
    recorrida y la tarifa total, y devuelve el costo por kilómetro del viaje.*/
    
    int distanciaRecorrida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad recorrida"));
    int tarifaTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarifa total"));
    
    JOptionPane.showMessageDialog(null,"El costo por kilometro del viaje es de $"+ (tarifaTotal/distanciaRecorrida));
//    


        
    }
    
    
    
}



