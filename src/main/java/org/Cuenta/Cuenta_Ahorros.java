package org.Cuenta;
/*Clase Cuenta de Ahorros (hereda de Cuenta):
Atributo: cuenta_activa (booleano, depende del saldo).
Métodos:
//Consignar: solo si la cuenta está activa.
//Retirar: solo si la cuenta está activa.
//Extracto mensual: considera comisión adicional si hay más de 4 retiros.
Nuevo método imprimir: saldo, comisión mensual, número de transacciones.
* */
public class Cuenta_Ahorros extends Cuenta {
    private boolean estado;

    public Cuenta_Ahorros(float saldo,float cantidades)
    {
        super(saldo,cantidades);
        estado = true;
        if(saldo<=10){
            estado = false;
        }else {
            estado = true;
        }
    }
    //Retirar: solo si la cuenta está activa.
    @Override
    public void retirar() {
        if(cantidades>saldo) {
            System.out.println("El retiro no puede ser mayor al saldo");

        }else {
            if(estado){
                super.retirar();
                nuevosaldo2=(saldo-cantidades);
                trasaciones++;
                System.out.println("Saldo Actual: "+nuevosaldo2);
            }else {
                estado = false;
            }
        }

    }
    //Consignar: solo si la cuenta está activa.
    @Override
    public void cosignaciones(){
        if (estado) {
            super.cosignaciones();
            saldo+=cantidades;
            trasaciones++;
            System.out.println("Su saldo nuevo es"+nuevosaldo);
        }else {
            System.out.println("No puede cosginar ya que no tiene activado la cuenta");
        }
    }
    //Extracto mensual: considera comisión adicional si hay más de 4 retiros.
    public void extractomensual(){
                comisionmensual+=(trasaciones-4);
                 super.extractomensual();
                 trasaciones++;
        System.out.println("Su saldo nuevo es : "+saldo);
    }
}
