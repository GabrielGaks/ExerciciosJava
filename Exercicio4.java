package estudos.java.introducao.exercicios;
import java.util.*;
public class Exercicio4 {
    public static void main(String[] args) {
    int [][] numeros = {{1,2},{2,3}
        };

   System.out.println( findMissingAndRepeatedValues(numeros)[0]);



}
static public int[] findMissingAndRepeatedValues(int[][] grid){
ArrayList<Integer> Lista = new ArrayList<>();
HashSet<Integer> Lista2 = new HashSet<>();
int v =0;
int j =0;
int valorLength=0;
for(int i=0;i<grid.length;i++){
    for(int c=0;c<grid[i].length;c++){
    Lista.add(grid[i][c]);
    }
}
for(int i =0;i<Lista.size();i++){
    if(Lista2.add(Lista.get(i))){
    }else{j=Lista.get(i);}
}


for(int i =0;i<=Lista.size();i++){
    valorLength +=i;
}
for(int a:Lista){
    v += a;
}
v = v-j;
valorLength = valorLength-v;
    int [] Abdu={j,valorLength};
    return Abdu;

}}
