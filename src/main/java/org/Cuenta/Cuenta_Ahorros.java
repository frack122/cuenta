package org.Cuenta;
/*Clase Cuenta de Ahorros (hereda de Cuenta):
Atributo: cuenta_activa (booleano, depende del saldo).
Métodos:
Consignar: solo si la cuenta está activa.
Retirar: solo si la cuenta está activa.
Extracto mensual: considera comisión adicional si hay más de 4 retiros.
Nuevo método imprimir: saldo, comisión mensual, número de transacciones.
* */
public class Cuenta_Ahorros extends Cuenta {
    private boolean estado;

    public Cuenta_Ahorros(float saldo , float tasaanual)
    {
        super(saldo, tasaanual);
        estado = true;
        if(saldo<=10){
            estado = false;
        }else {
            estado = true;
        }
    }

    @Override
    public void retirar(float cantidades) {
        float nuevosaldo = (saldo-cantidades);
        if(estado)
        {
          saldo-=cantidades;
            super.retirar(cantidades);
            trasaciones++;
        }
        else{
            System.out.println("No puede retirar ya que no tiene activado la cuenta");
        }

    }
    @Override
    public void cosignaciones(float cantidades){
        if (estado) {
            super.cosignaciones(cantidades);
            saldo+=cantidades;
            trasaciones++;
        }else {
            System.out.println("No puede cosginar ya que no tiene activado la cuenta");
        }
    }

    public void extractomensual(float cantidades){


                comisionmensual+=(trasaciones-4);
                 super.extractomensual(cantidades);
                 trasaciones++;

    }

    public void imprimir(){
        System.out.println("Saldo: "+saldo);
        System.out.println("comisicion mensual: "+comisionmensual);
        System.out.println("numero de transaciones"+(trasaciones));
    }

}
