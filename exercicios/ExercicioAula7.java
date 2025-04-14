public class ExercicioAula7 {
    public static void main(String[] args) {
        ExercicioAula7Classe hashTable = new ExercicioAula7Classe();

        hashTable.put(54, "capivara");
        hashTable.put(26, "cachorro");
        hashTable.put(93, "lontra");
        hashTable.put(17, "tigre");
        hashTable.put(77, "aguia");
        hashTable.put(31, "peixe");
        hashTable.put(44, "zebra");
        hashTable.put(55, "leopardo");

        System.out.println("54: " + hashTable.get(54));
        System.out.println("17: " + hashTable.get(17));
        System.out.println("93: " + hashTable.get(93));
        System.out.println("44: " + hashTable.get(44));

        // Atualizar o valor da chave 44
        hashTable.put(44, "panda");
        System.out.println("44 (atualizado): " + hashTable.get(44));
    }
}
