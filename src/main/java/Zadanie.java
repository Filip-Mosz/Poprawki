import java.util.Deque;

public class Zadanie {
    public static boolean balancedParents(String input) {

        String[] nawiasy = input.split("");
        MyStack<String> roundBracket = new MyStack<>();
        MyStack<String> squareBracket = new MyStack<>();
        MyStack<String> clampBracket = new MyStack<>();

        for (int i = 0; i < nawiasy.length; i++) {
            if ("(".equals(nawiasy[i])) {
                roundBracket.push(nawiasy[i]);
            } else if (")".equals(nawiasy[i])) {
                if (roundBracket.getSize() == 0) {
                    return false;
                }
                roundBracket.pop();
            } else

            if ("[".equals(nawiasy[i])) {
                squareBracket.push(nawiasy[i]);
            } else if ("]".equals(nawiasy[i])) {
                if (squareBracket.getSize() == 0) {
                    return false;
                }
                squareBracket.pop();
            } else

            if ("{".equals(nawiasy[i])) {
                clampBracket.push(nawiasy[i]);
            } else if ("}".equals(nawiasy[i])) {
                if (clampBracket.getSize() == 0) {
                    return false;
                }
                clampBracket.pop();
            }
        }

        if (clampBracket.getSize() != 0
                || roundBracket.getSize() != 0
                || squareBracket.getSize() != 0) {
            return false;
        }
        return true;
    }

    public static  <T> void IllegalReverseQueue(Deque<T> deque) { //nie tak :D
        T[] support = (T[]) new Object[deque.size()];

        for (int i = 0; i < support.length; i++) {
            support[i] = deque.pop();
        }

        for (int i = support.length - 1; i >= 0; i--) {
            deque.offer( support[i]);
        }
    }

    public static  <T> void reverseQueue(Deque<T> deque){

        for (int i = 0; i < deque.size(); i++) {

        }
    }
}
