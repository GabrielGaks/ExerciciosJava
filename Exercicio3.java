package estudos.java.introducao.exercicios;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> Numeros = new ArrayList<>();
        int[] nums = new int[] {12,2,3,5,1,4,5,76,23,634,123,98};
        int key=4;
        int k = 2;
        System.out.print(findKDistantIndices(nums,key,k));

    }
public static List<Integer> findKDistantIndices(int[] nums, int key,int k){
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> Maximos = new ArrayList<>();
        ArrayList<Integer> Minimos = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> resultado = new HashSet<>();
        for(int x=0;x<nums.length;x++){
           if(nums[x]==key){
               lista.add(x);
           }
        }
    for(int D=0;D<lista.size();D++){
        Maximos.add(lista.get(D)+k);
        Minimos.add(lista.get(D)-k);
    }
for(int x=0;x < lista.size();x++){
    for(int D=0;D<nums.length;D++){
        if(Minimos.get(x)<=D && Maximos.get(x)>=D || D == lista.get(x)){
            resultado.add(D);
        }
    }
    }
for(int i:resultado){
    result.add(i);
}
    Collections.sort(result);
    return result;
    }

}
