import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Esteban Andres Ruiz Novoa

        //papel =1
        //tijera=2
        //piedra=3

        System.out.println("PIEDRA PAPEL O TIJERA");

        int winplayer1=0;
        int winplayer2=0;
        int empate=0;



        while (winplayer2>=0 && winplayer2<3 || winplayer1 <3 && winplayer1>=0) {
                int jugador1 = (int) (Math.random() * 3 + 1);
                System.out.println("Jugador 1: ");
                System.out.println(jugador1);

                int jugador2 = (int) (Math.random() * 3 + 1);
                System.out.println("Jugador2: ");
                System.out.println(jugador2);
                if (jugador1 == 1 && jugador2 == 1) {
                    empate++;
                    winplayer2=winplayer2;
                    winplayer1=winplayer1;
                }

                if (jugador1 == 1 && jugador2 == 2) {
                    winplayer2 ++;
                    winplayer1=winplayer1;
                }

                if (jugador1 == 1 && jugador2 == 3) {
                    winplayer1 ++;
                    winplayer2=winplayer2;
                }

                if (jugador1 == 2 && jugador2 == 3) {
                    winplayer2 ++;
                    winplayer1=winplayer1;
                }
                if (jugador1 == 2 && jugador2 == 1) {
                    winplayer1 ++;
                    winplayer2=winplayer2;
                }
                if (jugador1 == 2 && jugador2 == 2) {
                    empate++;
                }

                if (jugador1 == 3 && jugador2 == 2) {
                    winplayer2++;
                    winplayer1=winplayer1;
                }

                if (jugador1 == 3 && jugador2 == 3) {
                    empate++;
                }
                int jugadas = winplayer1+winplayer2+empate;
                System.out.println("Juegos jugados = "+jugadas);

            if (winplayer1 == 2 || winplayer2 == 2) {
                break;
            }

        }
        if (winplayer1 > winplayer2) {
            System.out.println("Jugador 1 gana el juego");
            System.out.println("El jugador 1 gano: "+winplayer1+" Y el jugador 2 ganó: "+winplayer2);
            System.out.println("Hubo "+empate+" empates");
        } else {
            System.out.println("Jugador 2 gana el juego");
            System.out.println("El jugador 1 gano: "+winplayer1+" Y el jugador 2 ganó: "+winplayer2);
            System.out.println("Hubo "+empate+" empates");
        }

    }
}