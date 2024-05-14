package org.Cuenta;
/*Nombre : Rafael Posligua
* Curso:3 A
* Version : 1
* Fecha : 13-05-2024
* Constructor que inicializa los atributos (tasa anual, saldo).
*Métodos:
Consignar: añade una cantidad al saldo.
Retirar: resta una cantidad del saldo.
Calcular interés mensual: actualiza el saldo.
Extracto mensual: actualiza saldo, restando comisión mensual y calculando interés.
Imprimir: muestra los valores de los atributos.
*  */
public class Cuenta {

    protected float saldo;
    protected int numerodecosignaciones=0;
    protected int numeroderetiros=0;
    protected float tasaanual;
    protected float comisionmensual=0;
    protected int trasaciones;

    float tasamensual ;
    float nuevosaldo;
    float novosaldo ;
    float nuevosaldo3 ;
    float nuevosaldo2;
    public Cuenta(float saldo, float tasaanual)
    {
        this.saldo=saldo;
        this.tasaanual=tasaanual;
    }
    public Cuenta(){

    }
    public void cosignaciones(float cantidades){
         nuevosaldo  = (saldo+cantidades);
        trasaciones++;
    }
    public void retirar(float cantidades){
         nuevosaldo3 = (saldo-cantidades);
        if(nuevosaldo>0){
            saldo-=cantidades;
            trasaciones++;
        }else {
            System.out.println("No puede retirar el saldo");
        }
    }
    public void interesmensual(){
         tasamensual = saldo /12;
        comisionmensual = tasamensual * saldo;
         novosaldo = (saldo+comisionmensual);
    }
    public void extractomensual(float cantidades){
        nuevosaldo2 = (saldo-comisionmensual);
        interesmensual();
        trasaciones++;
    }

    public void imprimir(){
        System.out.println("Saldo: "+saldo);
        System.out.println("Tasaanual: "+tasaanual);
        System.out.println("Comisionmensual: "+novosaldo);
        System.out.println("Trasaciones: "+trasaciones);
    }
}
