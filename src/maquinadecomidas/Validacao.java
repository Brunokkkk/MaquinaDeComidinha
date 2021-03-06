/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomidas;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import maquinadecomida.tela.Produtos;

/**
 *
 * @author licac
 */
public class Validacao {

    public static boolean validaTexto(JTextField campo) {
        if (campo.getText().trim().isEmpty()) {
            Mensagens.msgErro(campo.getToolTipText());
            campo.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validaSenha(JPasswordField campo) {
        if (String.copyValueOf(campo.getPassword()).trim().isEmpty()) {
            Mensagens.msgErro(campo.getToolTipText());
            campo.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validaPreco(JTextField campo) {
        try {
            float valor = Float.valueOf(campo.getText());
            if (valor != 0 && valor >= 2) {
                return true;
            } else {
                Mensagens.msgErro("Valor inválido");
                return false;
            }
        } catch (Exception e) {
            Mensagens.msgErro(campo.getToolTipText());
            return false;
        }
    }

}
