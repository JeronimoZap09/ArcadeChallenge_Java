public class ArcadeChallenge {
    static void main(String[] args) {

        String[] Nombres = new String[3];

        Nombres[0] = "Jerónimo Zapata";
        Nombres[1] = "Mariana Franco";
        Nombres[2] = "Andres Taborda";

        int[] Edades = new int[3];

        Edades[0] = 18;
        Edades[1] = 23;
        Edades[2] = 14;

        double[] Puntajes = new double[3];

        Puntajes[0] = 764;
        Puntajes[1] = 765;
        Puntajes[2] = 694;

        String[] Estado = new String[3];

        Estado[0] = "NO";
        Estado[1] = "SI";
        Estado[2] = "NO";

        System.out.println();
        System.out.println("==== Arcade Challenge ====");
        System.out.println();

        System.out.println("Nombre: " + Nombres[0]);
        System.out.println("Edad: " + Edades[0]);
        System.out.println("Puntaje: " + Puntajes[0]);
        System.out.println("Estado VIP: " + Estado[0]);

        System.out.println();

        System.out.println("Nombre: " + Nombres[1]);
        System.out.println("Edad: " + Edades[1]);
        System.out.println("Puntaje: " + Puntajes[1]);
        System.out.println("Estado VIP: " + Estado[1]);

        System.out.println();

        System.out.println("Nombre: " + Nombres[2]);
        System.out.println("Edad: " + Edades[2]);
        System.out.println("Puntaje: " + Puntajes[2]);
        System.out.println("Estado VIP: " + Estado[2]);


        int [][] Tabla = new int[3][3];

        Tabla[0][0] = 764;
        Tabla[0][1] = 765;
        Tabla[0][2] = 694;
        Tabla[1][0] = 699;
        Tabla[1][1] = 312;
        Tabla[1][2] = 124;
        Tabla[2][0] = 999;
        Tabla[2][1] = 864;
        Tabla[2][2] = 756;

        System.out.println();
        System.out.println("==== Tabla de Puntuaciones ====");
        System.out.println();

        System.out.println("Jugador\t\t\tCarrera\tInvasores\tRobots");

        for (int i = 0; i < 3; i++) {
            System.out.print(Nombres[i] + "\t\t");

            for (int j = 0; j < 3; j++) {
                System.out.print(Tabla[i][j] + "\t\t");
            }

            System.out.println();
        }


        int[][][] campeonato = new int[2][2][3];

        // DIA 1 - RONDA 1
        campeonato[0][0][0] = 541;
        campeonato[0][0][1] = 242;
        campeonato[0][0][2] = 885;

        // DIA 1 - RONDA 2
        campeonato[0][1][0] = 458;
        campeonato[0][1][1] = 752;
        campeonato[0][1][2] = 135;

        // DIA 2 - RONDA 1
        campeonato[1][0][0] = 744;
        campeonato[1][0][1] = 755;
        campeonato[1][0][2] = 732;

        // DIA 2 - RONDA 2
        campeonato[1][1][0] = 645;
        campeonato[1][1][1] = 999;
        campeonato[1][1][2] = 457;


        for (int dia = 0; dia < 2; dia++) {
            System.out.println();
            System.out.println("==== DIA " + (dia + 1) + " ====");

            for (int ronda = 0; ronda < 2; ronda++) {
                System.out.println("--- Ronda " + (ronda + 1) + " ---");

                for (int jugador = 0; jugador < 3; jugador++) {
                    System.out.println(Nombres[jugador] + ": "
                            + campeonato[dia][ronda][jugador] + " puntos");
                }
            }
        }


        System.out.println();
        System.out.println("Consulta: " + campeonato[0][1][2] + " puntos");


        int totalJerónimo = 0;

        for (int dia = 0; dia < 2; dia++) {
            for (int ronda = 0; ronda < 2; ronda++) {
                totalJerónimo += campeonato[dia][ronda][0];
            }
        }

        System.out.println("Total del campeonato de " + Nombres[0] + ": " + totalJerónimo);


        System.out.println();
        System.out.println("==== RETO 4: ¿QUIEN ES EL CAMPEON? ====");

        int mayorPuntaje = 0;
        int[] Totales = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Totales[i] += Tabla[i][j];
            }

            System.out.println(Nombres[i] + ": " + Totales[i] + " puntos");

            if (Totales[i] > mayorPuntaje) {
                mayorPuntaje = Totales[i];
            }
        }

        // Mostrar el ganador o los jugadores empatados
        System.out.println();
        System.out.println("==== GANADOR ====");

        for (int i = 0; i < 3; i++) {
            if (Totales[i] == mayorPuntaje) {
                System.out.println(Nombres[i] + " es campeon con "
                        + mayorPuntaje + " puntos");
            }
        }

    }
}