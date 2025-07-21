package estudos.java.introducao.exercicios;

import java.util.ArrayList;

public class Exercicio14 {
    public static void main(String[] args) {
        int[] lista = {5, 6, 7, 8, 9};
        System.out.print(findKthPositive(lista, 2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int maiorNumero = arr[arr.length - 1];
        //Variavel que pega o ultimo numero do array , ou seja o maior numero , para ser usado de referencia.

        ArrayList<Integer> ordemCorreta = new ArrayList<>();
        //Lista que ira amazenar a ordem correta dos elementos.

        ArrayList<Integer> ordemFaltantes = new ArrayList<>();
        //Lista que ira armazenar os numeros que estam faltando na ordem

        ArrayList<Integer> ordemIncorreta = new ArrayList<>();
        //transformar array em ArrayList para facilitar o processo e conseguir usar a funcao contains()

        for (int i = 0; i < arr.length; i++) {
            ordemIncorreta.add(arr[i]);
        }
        //looping responsavel por transformar o array original em ArrayList;

        for (int i = 1; i <= maiorNumero; i++) {
            ordemCorreta.add(i);
        }
        //looping que ira adicionar ao ArraList todos os numeros da ordem até chegar no maior numero da lista original.
        // ele esta usando o maior numero da lista como refenrecia de parada.


        for (int i = 0; i <= k; i++) {
            ordemCorreta.add(ordemCorreta.size());

            //Looping que ira continuar a ordem  do numero de  elementos dependendo do K
            //Essa parte ta um pouco gambiarra pq ele adiciona elementos independentemente se eles ja estao na ordem. Preciso melhorar

            for (Integer numero : ordemCorreta) {
                if (ordemIncorreta.contains(numero)) {

                } else {
                    ordemFaltantes.add(numero);
                }
            }
            //Condicional que adiciona os elementos que nao estao dentro da ordem incorreta nos de ordem faltante

        }
        return ordemFaltantes.get(k - 1);
    }
}