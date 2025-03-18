public class ExercicioAula4 {
    public static void main(String[] args) {
        DoublyLinkedBase<Integer> list = new DoublyLinkedBase<>();
        
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        System.out.print("Lista após inserções: ");
        list.printList();
            
        list.removeFirst();
        System.out.print("Lista após remover o primeiro elemento: ");
        list.printList();
            
        System.out.println("A lista está vazia? " + list.isEmpty());
            
        list.addFirst(5);
        list.addLast(40);
        System.out.print("Lista após novas inserções: ");
        list.printList();
    }
}
