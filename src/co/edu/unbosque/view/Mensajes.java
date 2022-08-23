package co.edu.unbosque.view;

import javax.swing.*;

public class Mensajes {

    public void mostarMsg(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }

    public String leerDato(String msg){
        String aux = JOptionPane.showInputDialog(null,msg);
        return aux;
    }

}
