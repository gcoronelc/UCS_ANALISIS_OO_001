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
public class OrdenadorInsecion implements Ordenador {

  public OrdenadorInsecion() {

  }

  @Override
  public void ordenador(int arreglo[]) {
    int i, j, temp;
    for (i = 1; i < arreglo.length; i++) {
      temp = arreglo[i];
      for (j = i - 1; j >= 0 && temp < arreglo[j]; j--) {
        arreglo[j + 1] = arreglo[j];
      }
      arreglo[j + 1] = temp;
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
