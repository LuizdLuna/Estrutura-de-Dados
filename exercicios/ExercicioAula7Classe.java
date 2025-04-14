import java.util.LinkedList;

class ExercicioAula7Classe {

    private class Pair {
        int key;
        String value;

        Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 100;
    private LinkedList<Pair>[] table;

    public ExercicioAula7Classe() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, String value) {
        int index = hash(key);
        for (Pair pair : table[index]) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        table[index].add(new Pair(key, value));
    }

    public String get(int key) {
        int index = hash(key);
        for (Pair pair : table[index]) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return null;
    }
}
