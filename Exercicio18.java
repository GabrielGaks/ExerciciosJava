package estudos.java.introducao.exercicios;

public class Exercicio18 {
    public static void main(String[] args) {
    System.out.print(rotateString("abcde","abced"));
    }
    public static boolean rotateString(String s, String goal) {
        String palavra =s+s;
        boolean resultado=false;
        for(int i=0;i<s.length();i++){
            String subPalavra=palavra.substring(i,i+s.length());
            if(goal.length()==s.length() && goal.equals(subPalavra)){
                return resultado=true;
            }else{

            }

        }
        return resultado;
    }

}
