public class DibujarLetraU {
    public static void main(String[] args) {
        int filas = 7;
        int columnas = 5;

        // Paso 1: Crear la matriz de caracteres
        char[][] matriz = new char[filas][columnas];

        // Paso 2: Rellenar la matriz con espacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }

}
        for(int i=0; i<6; i++){
            matriz[i][0] = '*';

        }

        for(int i=0; i<5; i++){
            matriz[i][columnas - 1] = '*';
        }

            matriz[5][3] = '*';
            matriz[6][2] = '*';
            matriz[6][1] = '*';
        


        // Paso 3: Dibujar los lados verticales de la letra U
        // COMPLETA AQUÍ: usa bucles para poner '*' en la primera y última columna
        // excepto en la última fila
        // Ejemplo: matriz[i][0] = '*'; matriz[i][columnas - 1] = '*';

        // Paso 4: Dibujar la base de la U (última fila)
        // COMPLETA AQUÍ: pon '*' en las columnas centrales de la última fila

        // Paso 5: Mostrar la matriz en consola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}

/*

0   1   2   3   4   <- columnas (j)
0 [* ,  ,  ,  , *]     <- fila 0 (i=0)
1 [* ,  ,  ,  , *]     <- fila 1 (i=1)
2 [* ,  ,  ,  , *]     <- fila 2 (i=2)
3 [* ,  ,  ,  , *]     <- fila 3 (i=3)
4 [* ,  ,  ,  , *]     <- fila 4 (i=4)
5 [* ,  ,  , *,  ]     <- fila 5 (i=5)
6 [  , *, *,  ,  ]     <- fila 6 (i=6)  */


