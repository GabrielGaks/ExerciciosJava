package estudos.java.introducao.exercicios;

import java.util.ArrayList;

public class Exercicio17 {
    public static void main(String[] args) {
    System.out.print(getEncryptedString("abcdef",2));
    }
    public static String getEncryptedString(String s, int k) {
        String resultado="";
        for(int i=0;i<s.length();i++){
            int lugar=(k+i)/s.length();
            lugar=((k+i)-s.length()*lugar);
            resultado+=s.charAt(lugar);
        }

        return resultado;
    }
}
