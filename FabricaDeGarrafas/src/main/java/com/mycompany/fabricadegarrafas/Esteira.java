package com.mycompany.fabricadegarrafas;
        
import javax.swing.JOptionPane;

public class Esteira {
    
    public boolean estado = false;
    
    public void ligar() {
        estado = true;
        estado();
    }
    
    public void desligar() {
        estado = false;
        estado();
    }
    
    public void estado() {
        JOptionPane.showMessageDialog(null, "A esteira está " + (estado ? "ligada" : "desligada"));
    }
}