package estudos.java.introducao.exercicios;
import java.util.*;
public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println(isHappy2(2));
    }
    public static boolean isHappy(int n) {
    String numeroString=Integer.toString(n);
    HashSet<Integer> colecaoDeNumeros = new HashSet<>();
    ArrayList<Integer> listaDeNumeros = new ArrayList<>();
    int numeroAtual=0;
    while(numeroAtual !=1){
        for(int i=0;i<numeroString.length();i++){
            int aleatoria = Integer.parseInt(numeroString.charAt(i)+"");
            listaDeNumeros.add(aleatoria);
        }
        numeroAtual=0;
        for(int i=0;i<listaDeNumeros.size();i++){
            numeroAtual+=listaDeNumeros.get(i) * listaDeNumeros.get(i);
        }
        if(colecaoDeNumeros.add(numeroAtual)){

        }else{return false;
        }
        listaDeNumeros.clear();
        numeroString=String.valueOf(numeroAtual);
    }
return true;

    }
    //Resolução sem a conversao
    public static boolean isHappy2(int n) {
        HashSet<Integer> colecaoNumeros = new HashSet<>() ;
        int numeroAtual=0;
        while(numeroAtual !=1){
            numeroAtual=0;
            while(n !=0) {
            int m=n % 10;
            numeroAtual += m *m;
            n /=10;
            }
            if(colecaoNumeros.add(numeroAtual)){
            }
            else{
                return false;
            }
            n=numeroAtual;
        }
    return true;
    }
}