package estudos.java.introducao.exercicios;

public class Exercicio16 {
    public static void main(String[] args) {
    System.out.println(winningPlayer(1,1));

    }
    public static String winningPlayer(int x, int y) {
    int Controlador=1;
    String resposta="";
    int total=x * 75 + y *  10;
    while(Controlador != 0){
    switch (Controlador) {
        case 1:
            if(total  - 115 >=0 && x>=1 && y>=4){
                total = total-115;
                x-=1;
                y-=4;
                Controlador=2;
            }else{
                Controlador=0;
                return resposta="Bob";

            }
        case 2:
            if(total  - 115 >=0 && x>=1 && y>=4){
                total = total-115;
                x-=1;
                y-=4;
                Controlador=1;
            }else{
                Controlador=0;
                return resposta="Alice";
            }
    }
    }
    return resposta;
    }
}
