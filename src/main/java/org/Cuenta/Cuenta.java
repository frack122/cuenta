package org.Cuenta;
/*Nombre : Rafael Posligua
* Curso:3 A
* Version : 1
* Fecha : 13-05-2024
* Constructor que inicializa los atributos (tasa anual, saldo).
*Métodos:
//Consignar: añade una cantidad al saldo.
//Retirar: resta una cantidad del saldo.
//Calcular interés mensual: actualiza el saldo.
//Extracto mensual: actualiza saldo, restando comisión mensual y calculando interés.
//Imprimir: muestra los valores de los atributos.
*  */
public class Cuenta {

    protected float saldo;
    protected int numerodecosignaciones=0;
    protected int numeroderetiros=0;
    protected float tasaanual=0.12f;
    protected float comisionmensual=0;
    protected int trasaciones;
    protected float cantidades;
    protected float nuevosaldo;
    protected float nuevosaldo2;
   protected float nuevosaldo3;
   protected float nuevosaldo4;
    public Cuenta(float saldo,float cantidades)
    {
        this.saldo=saldo;
        this.cantidades=cantidades;
    }
    //Consignar: añade una cantidad al saldo.
    public void cosignaciones(){
        nuevosaldo  = (saldo+cantidades);
        saldo+=cantidades;
        trasaciones++;
    }
    //Retirar: resta una cantidad del saldo.
    public void retirar(){
        if(saldo>0){
            nuevosaldo2=(saldo-cantidades);
            trasaciones++;
        }else {
            System.out.println("No puede retirar el saldo");
        }
    }
    //Calcular interés mensual: actualiza el saldo.
    public void interesmensual(){
         float tasamensual = saldo /12;
        comisionmensual = tasamensual * saldo /100;
    }
    //Extracto mensual: actualiza saldo, restando comisión mensual y calculando interés.
    public void extractomensual(){
        interesmensual();
        System.out.println("Extractomensual : "+comisionmensual);
        trasaciones++;
    }
}
