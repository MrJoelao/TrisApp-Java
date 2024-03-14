/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrisPackage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author joels,ricpi,NicMuso,AlePini
 */
public class TrisClass {
    private char[][] tabella;
    private char giocatore_corrente;
    public TrisClass() {
        tabella = new char[3][3];
        giocatore_corrente = 'X'; 
        inizializza();
    }
    private void inizializza() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabella[i][j] = '-';
            }
        }
    }
    private void Switch_giocatore() {
        giocatore_corrente = (giocatore_corrente == 'X') ? 'O' : 'X';
    }
    public void Muovi(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && tabella[row][col] == '-') {
            tabella[row][col] = giocatore_corrente;
            Switch_giocatore();
        }
    }
    public char getGiocatore_corrente() {
        return giocatore_corrente;
    }
    public boolean checkWinner() {
        // Controllo righe
        for (int i = 0; i < 3; i++) {
            if (tabella[i][0] != '-' && tabella[i][0] == tabella[i][1] && tabella[i][1] == tabella[i][2]) {
                return true;
            }
        }

        // Controllo colonne
        for (int i = 0; i < 3; i++) {
            if (tabella[0][i] != '-' && tabella[0][i] == tabella[1][i] && tabella[1][i] == tabella[2][i]) {
                return true;
            }
        }

        // Controllo diagonali
        if (tabella[0][0] != '-' && tabella[0][0] == tabella[1][1] && tabella[1][1] == tabella[2][2]) {
            return true;
        }
        if (tabella[0][2] != '-' && tabella[0][2] == tabella[1][1] && tabella[1][1] == tabella[2][0]) {
            return true;
        }

        return false;
    }

    
    
    
    
    
    
    
    
    
    
    
}
