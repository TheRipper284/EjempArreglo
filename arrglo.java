package ejemploArrglo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class arrglo {

    // Para abrir un bufer de entrada global
    public static BufferedReader bufer =  new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    public static double[] leerPromedios( int n) throws IOException {
        double[] proms = new double[n];
        System.out.println("Introducción de los promedios individuales de cada estudiante");
        for(int i=0; i<n; i++){
            System.out.println("Escribe el promedio individual del estudiante con el id "+i+ ":");
            entrada = bufer.readLine();
            proms[i]=Double.parseDouble(entrada);
        }
        return proms; // Regresa todos los elementos del arreglo proms
    }
    // Regresa UN double, y recibe un arrglo de double como párametro
    public static double calcularPromedioGrupo(double[]p){
        double suma = 0;
        for (int i=0; i<p.length;i++)
            suma=suma+p[i];

        return suma / p.length;
    }

    //Método que no regresa valores y recibe un arreglo
    public static void imprimirPromedios(double[] proms ) {
        int i= 0;
        System.out.println("Promedios individuales del grupo");
        System.out.println("  IdAlumno              Promedio Individual");
        System.out.println("-------------------------------------------------");
        for(double prom : proms ){
            System.out.println("          "+i+"           "+prom);
            i++;
        }
    }

    public static void main(String[]ars)  throws IOException {
        final int T= 5; // declaro una constante
        double promedioGrupo;
        
        // DEclarando y construyendo arreglo
        int[] arreglo = new int [5];

        // Un arreglo de chars
        char[] caracteres = new char[T];

        //declaración, construir e inicilizar un arreglo de double
        // double[] promedios = {9.1, 8.6, 7.4, 5.3, 9.2, 6.5};

        double[] promedios;

        //Declaración de un arreglo de valores booleanos
        boolean[] datos;
        int t; // Tamaño variable de arreglos

        double[] decimal = new double [T];

        // inicializamos todas las casillas del arreglo en 0
        for (int i=0; i<5; i++)
        arreglo[i] = 0;

        // Asi no se puede imprimir el contenido de un arreglo
        // System.out.println("Arreglo:");
        // System.out.println(arreglo);
        
        // Asi se imrpime el contenido de un arreglo
        System.out.println("Contenido del Arreglo");
        for(int i= 0; i < arreglo.length; i++)
        System.out.println("arreglo["+i+"] = " + arreglo[i]);

        // Leer los valores del arreglo caracteres
        System.out.println("Escribe los valores del arreglo caracteres");
        for (int i = 0; i <T; i++ ){
            System.out.println("Escribe el valor [" + i+ "]:");
            
            entrada = bufer.readLine();
            caracteres[i] = entrada.charAt(0);
        }

        System.out.println("Contenido del Arreglo caracteres");
        for(int i= 0; i < caracteres.length; i++)
        System.out.println("caracteres["+i+"] = " + caracteres[i]);

        System.out.println("Escribe el tamaño del arreglo de datos: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        datos = new boolean[t]; // Construimos el arreglo de datos con el tamaño t

        // Rellenar los datos con valores booleanos
        for (int i=0; i < t; i++)  {
            System.out.println("Escribe el valor ["+i+"] de datos" );
            entrada = bufer.readLine();
            datos[i] = Boolean.parseBoolean(entrada);
        }
        // Mostrando los valores del arreglo datos, usaando for extendido
        for (boolean unDato: datos )
        System.out.println("Valor"+ unDato);


        System.out.println("Escribe el tamaño del arreglo de datos: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        for (int i=0; i < t; i++)  {
            System.out.println("Escribe el valor ["+i+"] de datos" );
            entrada = bufer.readLine();
            decimal[i] = Double.parseDouble(entrada);
        }

        for (double decimales : decimal) {
            if (decimales != 0) {
            System.out.println("Valores " + decimales);
            }
        }


        // Calular el promedio de un grupo
        System.out.println();
        System.out.println("Escribe el tamaño del grupo: ");
        entrada=bufer.readLine();
        t = Integer.parseInt(entrada); // t es el tamaño del grupo

        promedios=leerPromedios(t);
        imprimirPromedios(promedios);
        promedioGrupo = calcularPromedioGrupo(promedios);
        System.out.println("El promedio del grupo es: " + promedioGrupo);
        
    }
}