package estudos.java.introducao.exercicios;
import java.util.*;
import java.util.Arrays;

public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        Character resultado = 'a';
        ArrayList<Character> sArray = new ArrayList<>();
        ArrayList<Character> tArray = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sArray.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            tArray.add(t.charAt(i));
        }
        Collections.sort(sArray);
        Collections.sort(tArray);

        sArray.add(' ');
        for (int i = 0; i < tArray.size(); i++) {
            if (sArray.get(i) == tArray.get(i)) {

            } else {
                resultado = tArray.get(i);
                break;
            }
        }
        return resultado;
    }

    }

