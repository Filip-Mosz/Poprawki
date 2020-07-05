import java.util.*;

public class Main {
    public static void main(String[] args) {
        //kolejki, stosy itd
//        Queue<String> queueOfStrings = new ArrayDeque<String>();
//        System.out.println(queueOfStrings);

        MyStack myStack = new MyStack();
        Integer first = 1;
        Integer second = 3;
        Integer third = 6;
        Integer fourth = 9;

        myStack.push(first);
        myStack.push(second);
        myStack.push(third);
        myStack.push(fourth);


        try {
            System.out.println(myStack.peek());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.peek());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println("Tu powinien być wyjtek");
            System.out.println(myStack.pop()); //WYJĄTEK
        } catch (MyStackException e) {
            System.out.println("Stos jest pusty");
        }

        myStack.push(first);
        myStack.push(second);
        myStack.push(third);
        myStack.push(fourth);
        myStack.push(first);
        myStack.push(second);
        myStack.push(third);
        myStack.push(fourth);
        System.out.println("Weszło 12 elementów");

        boolean zadanie1 = Zadanie.balancedParents("((()))");

        boolean zadanie2 = Zadanie.balancedParents("())(())");
        System.out.println(zadanie1 + "TRUE" + "\n" + zadanie2 + "FALSE");

        boolean zadanie3 = Zadanie.balancedParents("({[(())]})");

        boolean zadanie4 = Zadanie.balancedParents("(){)}((])");
        System.out.println(zadanie3 + "TRUE" + "\n" + zadanie4 + "FALSE");


        Deque<Integer> flip = new ArrayDeque<>();
        flip.add(1);
        flip.add(2);
        flip.add(3);
        flip.add(4);
        flip.add(5);
        flip.add(6);
        flip.add(7);

        System.out.println("\nOdwrócenie Kolekcji");
        Zadanie.reverseQueue(flip);
        System.out.println(flip.pop());
        System.out.println(flip.pop());
        System.out.println(flip.pop());
        System.out.println(flip.pop());
        System.out.println(flip.pop());
        System.out.println(flip.pop());
        System.out.println(flip.pop());

        System.out.println("\nBinary search");
        int[] tab = new int[25];
        for (int i = tab.length - 1; i > 0; i--) {
            tab[i] = 50 - (i * 2);
        }

        System.out.println(MyBinarySearch.search(tab, 15));
        System.out.println(MyBinarySearch.search(tab, 16));
        System.out.println(MyBinarySearch.search(tab, 51));

        System.out.println("\nbuildIn " + Arrays.binarySearch(tab, 16));

        System.out.println("\nSort");


        System.out.println("Nie posortowane " + Arrays.toString(tab));
        System.out.println("Posortowane " + Arrays.toString(MySelectionSort.sort(tab)));

        tab[12] = 20;
        tab[11] = 20;
        tab[3] = 20;
        System.out.println("\nCountSort\n" + Arrays.toString(MyCountSort.sort(tab)));


        Person one = new Person(52, "Jacek", "Kaczmarski");
        Person two = new Person(19, "Jan", "Kowalski");
        Person three = new Person(39, "Janina", "Kułak");
        Person four = new Person(39, "Janina", "Kołeczek");

        List<Person> listOfPersons = Arrays.asList(one, two, four, three);

        Collections.sort(listOfPersons);

        System.out.println(listOfPersons);

        four.setSurname("Brzeczyszczykiewicz");
        four.setSurname("u"); //tak ma być

    }

}//10 mln 10b liczb O(N)
