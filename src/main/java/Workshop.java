import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // 1 Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
	//return 0;
    }

    // 2 Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
      if (a>= b && a >=c) return a;
    if (b>=c) return b;  
      return c;
    }

    // 3 Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) 
           { tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // 4 Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
           throw new IllegalArgumentException("No puede ser un negativo.");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    // 5 Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
               return false;
            }
        }
        return true;
    }

    // 6 Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
           throw new IllegalArgumentException("No pueden ser negativos.");
        }
        int[] arreglo = new int[n];
        if (n > 0) {
           arreglo[0] = 0;
        }
        if (n > 1) {
           arreglo[1] = 1;
        }
        for (int i = 2; i < n; i++) {
             arreglo[i] = arreglo[i - 1] + arreglo[i - 2];
        }
        return arreglo;
    }

    // 7 Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    // 8 Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
             suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }

    // 9 Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // 10 Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
             if (arreglo[i] < menor) {
                 menor = arreglo[i];
             }
        }
        return menor;
    }

    // 11 Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // 12 Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] volteado = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
             volteado[i] = arreglo.length[arreglo.length - 1 - i];
        }
        return volteado;
    }

    // 13 Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int f = 0; f < arreglo.length - 1 - i; f++) {
                if (arreglo[f] > arreglo[f + 1]) {
                   int mientras = arreglo[f];
                   arreglo[f] = arreglo[f + 1];
                   arreglo[f + 1] = mientras;
                }
            }
        }
        return arreglo;
    }

    // 14 Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temporal = new int[arreglo.length];
        int unicos = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;
            for (int f = 0; f < unicos; f++) {
                if (arreglo[i] == temporal[f]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temporal[unicos] = arreglo[i];
                unicos++;
            }
        }
        int[] resultado = new int[unicos];
        for (int i = 0; i < unicos; i++) {
            resultado[i] = temporal[i];
        }
        return resultado;
    }

    // 15 Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        int posicion = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            combinado[posicion] = arreglo1[i];
            posicion++;
        }
        for (int i = 0; i < arreglo2.length; i++) {
            combinado[posicion] = arreglo2[i];
            posicion++;
        }
        return combinado;
    }

    // 16 Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        int posicion = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            combinado[posicion] = arreglo1[i];
            posicion++;
        }
        for (int i = 0; i < arreglo2.length; i++) {
            combinado[posicion] = arreglo2[i];
            posicion++;
        }
        return combinado;
    }

    // 17 Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // 18 Método que invierte una cadena
    public String invertirCadena(String cadena) {
        String invertir = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertir = invertir + cadena.charAt(i);
        }
        return invertir;
    }

    // 19 Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        String invertir = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertir = invertir + cadena.charAt(i);
        }
        if (cadena.equals(invertida)) {
           return true;
        }
        else {
           return false;
        }
    }

    // 20 Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena.length() == 0) {
           return 0;
        }
        int palabras = 1;
        for (int i = 0; i < cadena.length(); i++) {
            palabras = palabras + 1;
        }
        return palabras;
    }

    // 21 Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // 22 Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // 23 Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // 24 Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // 25 Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        int arroba = correo.indexOf("@");
        int punto = correo.lastIndexOf(".");
        if (arroba > 0 && punto > arroba) {
            return true;
        }
        return false;
    }

    // 26 Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista.size() == 0) {
           return 0.0;
        }
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
             suma = suma + lista.get(i);
        }
        return suma/lista.size();
    }

    // 27 Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero == 0) {
           return "0";
        }
        String binario = "";
        while (numero > 0) {
              int residuo = numero % 2;
              binario = residuo + binario;
              numero = numero / 2;
        }
        return binario;
    }

    // 28 Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero == 0) {
            return "0";
        }
        String hexadecimal = "";
        char[] opciones = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while (numero > 0) {
              int residuo = numero % 16;
              hexadecimal = opciones[residuo] + hexadecimal;
              numero = numero / 16;
        }
        return hexadecimal;
    }

    // 29 Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        int aleatorio = (int) (Math.random() * 5);
        String eleccionComputadora = opciones[aleatorio];
        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate";
        }
        boolean ganaste = false;
        if (eleccionUsuario.equals("Piedra") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))) ganaste = true;
        if (eleccionUsuario.equals("Papel") && (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))) ganaste = true;
        if (eleccionUsuario.equals("Tijera") && (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))) ganaste = true;
        if (eleccionUsuario.equals("Lagarto") && (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel"))) ganaste = true;
        if (eleccionUsuario.equals("Spock") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra"))) ganaste = true;

        if (ganaste) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }

    // 30
    public String pptls2(String game[]) {
        String p1 = game[0];
        String p2 = game[1];
        if (p1.equals(p2)) {
            return "Empate";
        }
        boolean p1Gana = false;
        if (p1.equals("R") && (p2.equals("S") || p2.equals("L"))) p1Gana = true;
        if (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) p1Gana = true;
        if (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) p1Gana = true;
        if (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) p1Gana = true;
        if (p1.equals("V") && (p2.equals("S") || p2.equals("R"))) p1Gana = true;
        if (p1Gana) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    // 31
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // 32
    public String zoodiac(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Geminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";
        return "Fecha invalida";
    }


}

