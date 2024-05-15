package org.Cuenta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldo = 0;
        float saldo2;
        /*Crea instancias de cuenta de ahorros y cuenta corriente.
        Llama a los métodos correspondientes para cada una.*/
        System.out.println("Bienvenido");
        System.out.println("Menu Bancario");
        System.out.println("1:Cuenta Ahorros");
        System.out.println("2:Cuenta Corriente");
        System.out.println("3:salida");
        System.out.println("Elija su opcion");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenidos A Ahorros");
                System.out.println("Cuenta Ahorros");
                System.out.println("Ingrese su saldo");
                saldo = sc.nextFloat();
                System.out.println("Menu Bancario");
                System.out.println("1:deposito");
                System.out.println("2:retiro");
                System.out.println("3: Saber el interes mensual");
                System.out.println("Elija su opcion");
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                        case 1:
                            System.out.println("Depositar");
                            System.out.println("Ingrese el valor a depositar");
                            float cantidades = sc.nextFloat();
                            Cuenta_Ahorros cuenta = new Cuenta_Ahorros(saldo,cantidades);
                            cuenta.cosignaciones();
                            break;
                        case 2:
                            System.out.println("Retirar");
                            System.out.println("Ingrese la cantidad a retirar ");
                            cantidades = sc.nextFloat();
                            Cuenta_Ahorros cuenta2 = new Cuenta_Ahorros(saldo,cantidades);
                            cuenta2.retirar();
                            break;
                        case 3:
                            System.out.println("Saber el interes mensual");
                            cantidades=0;
                            Cuenta_Ahorros cuenta3 = new Cuenta_Ahorros(saldo,cantidades);
                            cuenta3.extractomensual();
                            break;
                        case 4:
                            System.out.println("Salir");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                }
                break;
            case 2:
                System.out.println("Cuenta Corriente");
                System.out.println("Bienvenidos a Corriente");
                System.out.println("Cuenta Corrientes");
                System.out.println("Ingrese su saldo");
                saldo = sc.nextFloat();
                System.out.println("Menu Bancario");
                System.out.println("1:deposito");
                System.out.println("2:retiro");
                System.out.println("Elija su opcion");
                int opcion3 = sc.nextInt();
                switch (opcion3) {
                    case 1:
                        System.out.println("Depositar");
                        System.out.println("Ingrese el valor a depositar");
                        float cantidades = sc.nextFloat();
                        Cuenta_Corriente cuenta22 = new Cuenta_Corriente(saldo,cantidades);
                        cuenta22.cosignaciones();
                        break;
                        case 2:
                            System.out.println("Retirar");
                            System.out.println("Ingrese la cantidad a retirar ");
                            cantidades = sc.nextFloat();
                            Cuenta_Corriente cuenta33 = new Cuenta_Corriente(saldo,cantidades);
                            cuenta33.retirar();
                }
                break;
                case 3:
                    System.out.println("salida");
                    break;
            default:
                System.out.println("Opcion no valida");
        }



    }
}