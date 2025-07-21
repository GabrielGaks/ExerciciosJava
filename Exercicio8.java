package estudos.java.introducao.exercicios;
import java.util.*;
public class Exercicio8 {

    public static void main(String[] args) {
        ArrayList<Character> Letras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua frase: ");
        String frase = sc.nextLine();
        int controlador=1;

        String frase1="";
        for(char c : frase.toCharArray()){
            Letras.add(c);
        }
        for(Character c : Letras){
            if(c !=' '){
               char target = c;
                for(char d='A'; d<='Z'; d++){
                    switch(controlador){
                        case 1:
                            System.out.print(frase1);
                            break;
                        case 2:
                            break;
                    }
                    if(target==d){
                        System.out.print(d);
                        frase1=frase1+d;
                        controlador=2;
                        break;
                    }else{
                        System.out.println(d);
                        controlador=1;
                        try {
                            Thread.sleep(75);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }else{
                System.out.print(" ");
                frase1=frase1+" ";
                controlador=2;
            }


            }





            }
            }









