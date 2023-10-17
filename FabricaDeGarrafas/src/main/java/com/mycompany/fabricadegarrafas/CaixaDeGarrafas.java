
package com.mycompany.fabricadegarrafas;

import javax.swing.JOptionPane;

public class CaixaDeGarrafas {
    
    public int qtdGarrafas;
    
    Esteira esteira1 = new Esteira();
    
    public void addGarrafas() {
    
        qtdGarrafas++;
        JOptionPane.showMessageDialog(null, "Você adicionou uma garrafa, existem " + qtdGarrafas + " na caixa");
        
        if (qtdGarrafas == 3) {
            esteira1.ligar();
            esteira1.desligar();
            qtdGarrafas = 0;
            JOptionPane.showMessageDialog(null, "A próxima caixa foi adicionada, com 0 garrafas dentro");
        }
        
    }
    
}
