package estudos.java.introducao.exercicios;

import java.util.ArrayList;

public class Exercicio13 {
    public static void main(String[] args) {
        String[] operacao = {"5","2","C","D","+"};
        System.out.println(calPoints(operacao));
    }
    public static int calPoints(String[] operations) {
        int resultado = 0;
        ArrayList<Integer> lista = new ArrayList<>();
    for(int i = 0; i < operations.length; i++){
        switch(operations[i]){
            case "+":
                lista.add(lista.get(lista.size()-1)+ lista.get(lista.size()-2));
                break;
            case "C":
                lista.remove(lista.size()-1);
                break;
            case "D":
                lista.add(lista.get(lista.size()-1) *2);
                break;
            default:
                lista.add(Integer.parseInt(operations[i]));
        }

        }
    for(Integer i : lista){
        resultado += i;
    }
    return resultado;
    }
    }



