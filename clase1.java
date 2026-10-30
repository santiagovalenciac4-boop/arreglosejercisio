package parcial3;

public class clase1
{
    public  static void main(String args[])
    {
        {
                int[] numeros = new int[5];
                for (int i = 0; i <= 4; i++) {
                    numeros[i] = Reutilizacion.ingresarEntero("Ingrese el numero " + (i + 1) + ": ");
                }
                for (int i = 4; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println();
                int mayor = numeros[0];
                for (int i = 1; i <=4 ; i++) {
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }
                }
                System.out.println("El mayor es: " + mayor);
            }
        }

    }

