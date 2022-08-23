package co.edu.unbosque.controller;

import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.view.Mensajes;

import javax.swing.*;

public class Controller {
    Mensajes msg = new Mensajes();
    Operaciones op = new Operaciones();

    public Controller(){
        funcionar();
    }

    public void funcionar(){
        boolean salir = false;

        try{
            do{
                int menu = Integer.parseInt(msg.leerDato("Ingrese la opcion que desea realizar " +
                        "\n 1. Calculo de divisores " +
                        "\n 2. Descomponer en factores primos " +
                        "\n 3. Algoritmo de Euclides " +
                        "\n 4. Salir"));

                switch (menu) {
                    case 1:
                        int numeroDivisores = Integer.parseInt(msg.leerDato("Ingrese el numero que desea comprobar"));
                        op.calculoDeDivisores(numeroDivisores);
                        break;
                    case 2:
                        int aPrimos = Integer.parseInt(msg.leerDato("Ingrese el primer numero"));
                        int bPrimos = Integer.parseInt(msg.leerDato("Ingrese el segundo numero"));

                        JOptionPane.showMessageDialog(null, "el mcd por el metodo de descomposicion es: "+op.calculoFactoresPrimos(aPrimos,bPrimos));
                        break;
                    case 3:
                        int aEuclides = Integer.parseInt(msg.leerDato("Ingrese el primer numero"));
                        int bEuclides = Integer.parseInt(msg.leerDato("Ingrese el segundo numero"));

                        JOptionPane.showMessageDialog(null,"el mcd por metodo de euclides es: "+op.euclides(aEuclides,bEuclides));

                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Ingrese una opcion correcta");
                        break;
                }

            } while (!salir);
        } catch (Exception e){

        }
    }
}
