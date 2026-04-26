public class PromedioArreglo {
    public static void main(String[] args) {
        int[] numeros = {200, 32, 120, 257, 164, 89, 45, 78, 150, 300}; // Arreglo de números
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}