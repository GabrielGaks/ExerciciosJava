package estudos.java.introducao.exercicios;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        heightChecker(numeros);
    }
    public static int heightChecker(int[] heights) {
        int Resultado=0;
        ArrayList<Integer> Arrumado = new ArrayList<>();
        for(Integer i : heights){
            Arrumado.add(i);
        }
        Collections.sort(Arrumado);
        for (int i = 0; i < heights.length; i++) {
            if(Arrumado.get(i)==heights[i]){

            }else{
                Resultado ++;
            }
        }
        return Resultado;
    }


}
