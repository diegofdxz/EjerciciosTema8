/*
1. La guerra de dados
int numeroDeCaras;
    int ultimaCara;

    public Ej1(int numeroDeCaras) {
        this.numeroDeCaras = numeroDeCaras;
    }

    public Ej1() {
        this.numeroDeCaras = 6;
    }

    public int getNumeroDeCaras() {
        return numeroDeCaras;
    }

    public int getUltimaCara() {
        return ultimaCara;
    }

    public void setNumeroDeCaras(int numeroDeCaras) {
        this.numeroDeCaras = numeroDeCaras;
    }
    public static int tirarDado(int numeroDeCaras){
        return (int) (Math.random() * numeroDeCaras + 1);
    }

Dos jugadores se enfrentan en una guerra de dados: cada jugador tiene un dado de seis caras y diez fichas.

Cree una clase JugadorGuerra, que tenga como atributos de instancia el número de fichas, un dado (una instancia de la clase Dado) y el nombre del jugador. Agregue dentro de esta clase el resto de elementos necesarios. Cree un algoritmo principal usando esta clase.

Ejemplo de ejecución:

¿Nombre del jugador?

Jimena

¿Nombre del jugador?

Lucía

Jimena ha sacado un 4

Lucía ha sacado un 1

Jimena gana

Marcador: Jimena 11 - Lucía 9

Jimena ha sacado un 1

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 10 - Lucía 10

Jimena ha sacado un 5

Lucía ha sacado un 2

Jimena gana

Marcador: Jimena 11 - Lucía 9

Jimena ha sacado un 1

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 10 - Lucía 10

Jimena ha sacado un 3

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 9 - Lucía 11

Jimena ha sacado un 5

Lucía ha sacado un 6

Lucía gana

Marcador: Jeanne 8 - Lucía 12

Jimena ha sacado un 2

Lucía ha sacado un 2

empate

Marcador: Jimena 8 - Lucía 12

Jimena ha sacado un 6

Lucía ha sacado un 6

empate

Marcador: Jimena 8 - Lucía 12

Jimena ha sacado un 3

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 7 - Lucía 13

Jimena ha sacado un 1

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 6 - Lucía 14

Jimena ha sacado un 2

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 5 - Lucía 15

Jimena ha sacado un 3

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 4 - Lucía 16

Jimena ha sacado un 2

Lucía ha sacado un 3

Lucía gana

Marcador: Jimena 3 - Lucía 17

Lucía ha sacado un 5

Lucía gana

Marcador: Jimena 2 - Lucía 18

Jimena ha sacado un 1

Lucía ha sacado un 6

Lucía gana

Marcador: Jimena 1 - Lucía 19

Jimena ha sacado un 1

Lucía ha sacado un 2

Lucía gana

Marcador: Jimena 0 - Lucía 20

Lucía ha ganado
 */
import java.security.Principal;
import java.util.Scanner;
public class Ej1 {
    class Dado {
        int numeroDeCaras;
        int ultimaCara;
        public Dado(int numeroDeCaras) {
            this.numeroDeCaras = numeroDeCaras;
        }
        public Dado() {
            this.numeroDeCaras = 6;
        }
        public int getNumeroDeCaras() {
            return numeroDeCaras;
        }
        public int getUltimaCara() {
            return ultimaCara;
        }
        public void setNumeroDeCaras(int numeroDeCaras) {
            this.numeroDeCaras = numeroDeCaras;
        }
        public static int tirarDado(int numeroDeCaras){
            return (int) (Math.random() * numeroDeCaras + 1);
        }


        public void setUltimaCara(int tirarDado) {
            this.ultimaCara = tirarDado;

        }
    }
    class JugadorGuerra{
        int numeroDeFichas;
        Dado dado;
        String nombre;
        public JugadorGuerra(int numeroDeFichas, Dado dado, String nombre) {
            this.numeroDeFichas = numeroDeFichas;
            this.dado = dado;
            this.nombre = nombre;
        }
        public int getNumeroDeFichas() {
            return numeroDeFichas;
        }
        public void setNumeroDeFichas(int numeroDeFichas) {
            this.numeroDeFichas = numeroDeFichas;
        }
        public Dado getDado() {
            return dado;
        }
        public void setDado(Dado dado) {
            this.dado = dado;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int tirarDado(){
            return Dado.tirarDado(dado.getNumeroDeCaras());
        }
        public void ganarFicha(){
            numeroDeFichas++;
        }
        public void perderFicha(){
            numeroDeFichas--;
        }
        public boolean quedanFichas(){
            return numeroDeFichas > 0;
        }
        public void mostrar(){
            System.out.println(nombre + " ha sacado un " + dado.getUltimaCara());
        }



    }
    public void PrincipalDado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Nombre del jugador 1?");
        String nombre1 = sc.nextLine();
        System.out.println("¿Nombre del jugador 2?");
        String nombre2 = sc.nextLine();
        JugadorGuerra jugador1 = new JugadorGuerra(10, new Dado(), nombre1);
        JugadorGuerra jugador2 = new JugadorGuerra(10, new Dado(), nombre2);
        while (jugador1.quedanFichas() && jugador2.quedanFichas()){
            jugador1.dado.setUltimaCara(jugador1.tirarDado());
            jugador2.dado.setUltimaCara(jugador2.tirarDado());
            jugador1.mostrar();
            jugador2.mostrar();
            if (jugador1.dado.getUltimaCara() > jugador2.dado.getUltimaCara()){
                jugador1.ganarFicha();
                jugador2.perderFicha();
                System.out.println(jugador1.getNombre() + " gana");
            }else if (jugador1.dado.getUltimaCara() < jugador2.dado.getUltimaCara()){
                jugador1.perderFicha();
                jugador2.ganarFicha();
                System.out.println(jugador2.getNombre() + " gana");
            }else{
                System.out.println("empate");
            }
            System.out.println("Marcador: " + jugador1.getNombre() + " " + jugador1.getNumeroDeFichas() + " - " + jugador2.getNombre() + " " + jugador2.getNumeroDeFichas());
        }

    }
    public static void main(String[] args) {
        Ej1 ej1 = new Ej1();
        ej1.PrincipalDado();
    }
}
