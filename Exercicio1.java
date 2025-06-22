/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/


package estudos.java.introducao;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros0 = new ArrayList<>();
        int a = 0;
        while(a < 5){
            System.out.printf("Digite o %d numero: ",a);
            Integer n = scan.nextInt();
            if(numeros0.contains(n)){
                System.out.println("Digite outro numero, este já esta escolhido");
            }else{
                numeros0.add(n);
                a ++;
            }
        }
        int d = 0;
        System.out.print("Digite o seu target: ");
        int t = scan.nextInt();
        for(Integer n:numeros0){
            for(Integer m:numeros0){
                int b = n + m;
                if(b == t ){
                    d++;
                }
            }
        }
        if(d<3){
            for (Integer n : numeros0) {
                    for (Integer m : numeros0) {
                        int b = n + m;
                        if (b == t) {
                            System.out.printf("O seu target %d corresponde a soma entre %d e %d , nas respectivas posições do array %d e %d", t, n, m, numeros0.indexOf(n), numeros0.indexOf(m));
                            return;
                        }
                    }

            }
            System.out.println("Voce digitou uma lista de numeros que nao possuem uma combinação que chegue no seu target, logo digite novamente a lista ");
            estudos.java.introducao.Exercicio1.main(new String[0]);


        }else{
            System.out.println("Voce digitou uma lista de numeros que possui mais de uma solução , logo ela sera invalida ! ");
            estudos.java.introducao.Exercicio1.main(new String[0]);
        }        System.out.println("a");

    }}



