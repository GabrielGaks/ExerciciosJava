package estudos.java.introducao.exercicios;

import java.util.*;

public class Exercicio15 {
    public static void main(String[] args) {
        int[] aleatorio = {1,1,1};
        System.out.println(isMonotonic(aleatorio));
    }

    public static boolean isMonotonic(int[] lista) {
        int controlador = 0;
        boolean resposta = true;
       ArrayList<Integer> nums = new ArrayList<>();
       for(int i = 0; i < lista.length; i++){
           nums.add(lista[i]);
       }
        for (int i = 0; i < nums.size(); i++) {
            if(i == nums.size() - 1){}else{
            if(nums.get(i) > nums.get(i+1)){
                controlador=2;
            }else if(nums.get(i)<nums.get(i+1)){controlador=1;}else{
                nums.remove(i);
            }
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if(i == nums.size() - 1){}else {
                {
                   if(controlador == 1 ){
                    if (nums.get(i) > nums.get(i + 1) ) {
                    return resposta=false;
                    }}
                   else if(controlador == 2) {if(nums.get(i) < nums.get(i+1)){
                    return resposta=false;}
                }
                }
            }
        }
        return resposta;
    }
}