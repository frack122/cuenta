package org.Cuenta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Crea instancias de cuenta de ahorros y cuenta corriente.
        Llama a los métodos correspondientes para cada una.*/
        Cuenta_Ahorros CA = new Cuenta_Ahorros(100,12);
        CA.cosignaciones(20);
        CA.retirar(5);
        CA.extractomensual(12);
        CA.imprimir();
        System.out.println();
        Cuenta_Corriente CO = new Cuenta_Corriente();
        CO.retirar(50);
        CO.retirar(30);
        CO.cosignaciones(40);
        CO.extractomensual(12);
        CO.imprimir();

    }
}