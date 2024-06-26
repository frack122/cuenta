package org.Cuenta;
/* Clase Cuenta Corriente (hereda de Cuenta):
Atributo: sobregiro (inicializado en 0).
Métodos:
//Retirar: permite retirar más del saldo, generando sobregiro.
//Consignar: reduce el sobregiro si lo hay.
//Extracto mensual: igual al de la clase padre.
Nuevo método imprimir: saldo, comisión mensual, número de transacciones, sobregiro.
* */
public class Cuenta_Corriente extends Cuenta {

   private double sobregiro ;
   float sg1 ;
   public Cuenta_Corriente(float saldo,float cantidades) {
      super(saldo,cantidades);
      sobregiro=0;
      sg1 = saldo * 0.10f;
   }
   //Retirar: permite retirar más del saldo, generando sobregiro.
   public void retirar() {

     if (cantidades>saldo){
        System.out.println("El retiro no puede ser mayor al saldo");
     }else {
        if (sg1 <= saldo+saldo*0.10) {
           if (cantidades > saldo) {
              sobregiro+=cantidades-saldo*0.10;
              System.out.println("su cuenta se ha sobregirado con un 10% : "+sobregiro);
              saldo=0;
           }else {
              saldo -= cantidades;
           }
        }
        else
        {
           trasaciones ++;
        }
     }
   }
   //Consignar: reduce el sobregiro si lo hay.
   public void cosignaciones() {
      super.cosignaciones();
      if (sg1 <= saldo+saldo*0.10) {
         if(cantidades <= sg1) {
            sobregiro+=cantidades+saldo;
            trasaciones++;
            System.out.println("su cuenta se ha sobregirado"+sobregiro);
         }else{
            saldo+=(cantidades-saldo);
            sobregiro=0;
            System.out.println("su cuenta no se ha sobregirado");
         }
      }
   }
   //Extracto mensual: igual al de la clase padre.
   public void extractomensual() {
      super.extractomensual();
   }

}
