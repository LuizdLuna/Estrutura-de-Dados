public class ExercicioAula6{

    public static void main(String[] args) {
        int[] listaExercicio = {0, 3, 5, 9, 14, 17, 21, 33, 39};

        boolean resultado15s = sequentialSearch(listaExercicio, 15);
        System.out.println("Número 15 encontrado (busca sequencial)? " + resultado15s);

        boolean resultado39s = sequentialSearch(listaExercicio, 39);
        System.out.println("Número 39 encontrado (busca sequencial)? " + resultado39s);

        boolean resultado15b = binarySearch(listaExercicio, 15);
        System.out.println("Número 15 encontrado (busca binaria)? " + resultado15b);

        boolean resultado39b = binarySearch(listaExercicio, 39);
        System.out.println("Número 39 encontrado (busca binaria)? " + resultado39b);
    }


    public static boolean sequentialSearch(int[] lista, int item) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == item) {
                return true;
            }
        }
        return false;
    }


    public static boolean binarySearch(int[] lista, int item) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == item) {
                return true;
            } else if (item < lista[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return false;
    }
}