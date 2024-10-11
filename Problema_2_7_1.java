import java.util.*;

public class Problema_2_7_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        int p = 4;

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        zSet.addAll(x);
        zSet.retainAll(y); 
        xMinusY.addAll(x);
        xMinusY.removeAll(y); 

        for (Integer element : xPlusY) {
            if (element <= p) {
                xPlusYLimitedByP.add(element);
            }
        }

        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("Lista xPlusY: " + xPlusY);
        System.out.println("Set zSet (valori comune): " + zSet);
        System.out.println("Lista xMinusY: " + xMinusY);
        System.out.println("Lista xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}
