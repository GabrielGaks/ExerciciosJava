/*

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

*/


package estudos.java.introducao.exercicios;
import java.util.*;
public class Exercicio7 {
    public static void main(String[] args) {
        List<List<Integer>> lista = generate(5  );
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

    static public List<List<Integer>> generate(int numeroLinhas) {
//Prencher piramede de pascal com numeros randoms

        int vezesLopping = 0;

        List<List<Integer>> resultado = new ArrayList<>();

        while (vezesLopping < numeroLinhas) {
            resultado.add(new ArrayList<>());
            for (int i = 0; i <= vezesLopping; i++) {
                resultado.get(resultado.size() - 1).add(1);
            }
            vezesLopping++;
        }

        if (numeroLinhas <=2) {

        } else {
            int valorFrente1=0;
            List<Integer> posicaoArrayFrente;
            for (int posicaoArray = 1; posicaoArray < resultado.size(); posicaoArray++) {
                int Tamanho = resultado.get(posicaoArray).size()-1;
                if(posicaoArray < resultado.size()-1){
                    int Posicao1=1;
                    int posicaoNumero1=1;
                    for (int posicaoNumero = 0; posicaoNumero < Tamanho; posicaoNumero++) {

                    if(resultado.get(posicaoArray).indexOf(posicaoNumero) < Tamanho){
                        posicaoArrayFrente=resultado.get(posicaoArray+1);
                        valorFrente1=resultado.get(posicaoArray).get(posicaoNumero)+resultado.get(posicaoArray).get(posicaoNumero1);
                        posicaoArrayFrente.remove(Posicao1);
                        posicaoArrayFrente.add(Posicao1,valorFrente1);
                        posicaoNumero1++;
                        Posicao1++;
                    }}
                }
            }
        }

        return resultado;
    }


}