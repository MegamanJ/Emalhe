/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.util;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author MADAM
 */
public class Utilidade {

      public String separa(int n,String palavra) { //Se entrar com 1 pega o C�digo, se n�o pega o Nome

      //aqui ele pega a quantidade de carcteres que tem uma determinada vari�vel
      //e armazena numa INT para us�-la de contador
      int contador = palavra.length();

      //cria um for( para fazer uma varredura letra por letra at� encontrar
      for(int i = 0;i<contador;i++){
         //usamos substring pra pegar um caractere, passando como par�metro,
         //o primeiro caractere a ser pega, at� a ultima.
        //fiz um if para verificar se o caractere � igual a "#"
        if (palavra.substring(i,i+1).equals("#")){
           int posicao = i+1;
            //System.out.println("Est� na posi��o " + posicao);
            if (n == 1){
                return palavra.substring(0,posicao-2);
            }
            else
                return palavra.substring(posicao+1,palavra.length());
        }

      }
      return "nada";

}

    public int checarCkb(JCheckBox ckb) {
        if (ckb.isSelected()){
            return 1;
        }else
            return 0;
    }

    public int checarChb(JRadioButton chb) {
        if (chb.isSelected()){
            return 1;
        }else
            return 0;
    }


}
