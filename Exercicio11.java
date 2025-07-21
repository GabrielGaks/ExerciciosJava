package estudos.java.introducao.exercicios;
import java.util.*;
public class Exercicio11 {
    public static void main(String[] args) {
    int[] numeros ={6,6,6,6,6,6};
        System.out.println(distributeCandies(numeros));
    }



    public static int distributeCandies(int[] candyType) {
        int Doces=0;
        int tamanho = candyType.length/2;
        HashSet<Integer> comandoNumeros=new HashSet<>();
        for(int doce:candyType){
            comandoNumeros.add(doce);
        }
      if(comandoNumeros.size()>tamanho){
          Doces=tamanho;
      }else{
          Doces=comandoNumeros.size();
      }
        return Doces;
    }




}
