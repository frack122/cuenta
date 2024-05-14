package org.Cuenta;
/* Clase Cuenta Corriente (hereda de Cuenta):
Atributo: sobregiro (inicializado en 0).
Métodos:
Retirar: permite retirar más del saldo, generando sobregiro.
Consignar: reduce el sobregiro si lo hay.
Extracto mensual: igual al de la clase padre.
Nuevo método imprimir: saldo, comisión mensual, número de transacciones, sobregiro.
* */
public class Cuenta_Corriente extends Cuenta {

   private double sobregiro ;

   public Cuenta_Corriente() {
      super();
      sobregiro=0;
   }

   public void retirar(float cantidades) {
       if (cantidades <= (saldo + sobregiro)) {
          if (cantidades > sobregiro) {
             sobregiro += (cantidades - saldo);
             saldo=0;
          }else {
             saldo -= cantidades;
          }
       }else {
          trasaciones ++;
       }
   }

   public void cosignaciones(float cantidades) {
      super.cosignaciones(cantidades);
      if (sobregiro>0) {
         if(cantidades <= sobregiro) {
            sobregiro-=cantidades;
            trasaciones++;
         }else{
            saldo+=(cantidades-sobregiro);
            sobregiro=0;
         }
      }
   }

   public void extractomensual(float cantidades) {
      super.extractomensual(cantidades);
   }

   public void imprimir(){
      System.out.println("comision mensual"+comisionmensual);
      System.out.println("el numero de tracciones"+trasaciones);
      System.out.println("el sobregiro"+sobregiro);
   }
}
