

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                System.out.println("Digite seu peso e sua altura");
                Scanner teclado = new Scanner(System.in);
                int peso = teclado.nextInt();
                double altura = teclado.nextDouble();
                double imc = peso /(altura*altura);
                System.out.println(imc);

                String msg;
                Scanner teclado1 = new Scanner (System.in);
                System.out.println("Digite seu palpite : ");
                int palpite = teclado1.nextInt();
                int valorcorreto = 10000;

                while (palpite != valorcorreto){
                        msg = palpite > valorcorreto ? "Um pouco menos..." : "Um pouco mais...";
                        System.out.println(msg);

                        System.out.print("Tente de novo: ");
                        palpite = teclado.nextInt();
                }
                        /*if ( palpite > valorcorreto){
                                System.out.println("UM pouco menos");
                                System.out.println("Digite outro palpite : ");
                                palpite = teclado.nextInt();
                        }
                        else{
                                System.out.println("Um pouco mais");
                                System.out.println("Digite outro palpite : ");
                                palpite = teclado.nextInt();
                        }*/
                        System.out.println("End");
                }

        }



