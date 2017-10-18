/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author admin_semag
 */
public class OrdenadorBurbuja implements Ordenador {
  // se crea un constructor

  public OrdenadorBurbuja() {
  }

  @Override
  public void ordenador(int arreglo[]) {
    int i, j;
    for (i = 1; i < arreglo.length; i++) {
      for (j = (arreglo.length) - 1; j >= i; j--) {
        if (arreglo[j] < arreglo[j - 1]) {
          int temp = arreglo[j];
          arreglo[j] = arreglo[j - 1];
          arreglo[j - 1] = temp;
        }
      }
    }
  }

  @Override
  public void solucion(int arreglo[]) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }
}
