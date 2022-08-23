package co.edu.unbosque.model;

import co.edu.unbosque.view.Mensajes;

import java.util.ArrayList;

public class Operaciones {
    ArrayList<Integer> calculoDivisores = new ArrayList<>();
    Mensajes msg = new Mensajes();
    public void calculoDeDivisores(int divisible){
        String output = "";
        for(int i=1; i <= divisible; i++){
            if(divisible % i == 0){
                calculoDivisores.add(i);
            }
        }
        msg.mostarMsg("Los divisores de "+divisible+" son: "+calculoDivisores.toString());
    }

    public int calculoFactoresPrimos(int a, int b){

        int maximoComunDivisor = 1;
        int i = 2;

        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                maximoComunDivisor = maximoComunDivisor * i;
                a = a / i;
                b = b / i;
            } else {
                i++;
            }
        }

        return maximoComunDivisor;
    }

    public int euclides(int a, int b){

        int dividiendo;
        int divisor;
        int cociente;
        int resto;

        if (a > b) {
            dividiendo = a;
            divisor = b;
        } else {
            dividiendo = b;
            divisor = a;
        }

        do {
            cociente = dividiendo / divisor;
            resto = dividiendo - (divisor * cociente);
            dividiendo = divisor;
            divisor = resto;

        } while (resto != 0);

        return dividiendo;

    }


    public ArrayList<Integer> getCalculoDivisores() {
        return calculoDivisores;
    }

    public void setCalculoDivisores(ArrayList<Integer> calculoDivisores) {
        this.calculoDivisores = calculoDivisores;
    }
}
