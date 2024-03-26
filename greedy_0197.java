import java.util.*;

public class greedy_0197 {
    public static void main(String[] args) {
        int numberOfobject;
        ArrayList<Float> valueOfobject = new ArrayList<Float>();
        ArrayList<Float> weight = new ArrayList<Float>();
        ArrayList<Float> valuePerweight = new ArrayList<Float>();
        float holditem = 0;
        float valuehave = 0;
        float weightOfbag;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your object ");
        numberOfobject = sc.nextInt();
        for (int i = 0; i< numberOfobject; i++){
            System.out.println("enter your value of object " + i + 1 );
            valueOfobject.add(sc.nextFloat());
            System.out.println("enter your weight of object " + i + 1 );
            weight.add(sc.nextFloat());
        }
        System.out.println("enter your weight that bag can hold");
        weightOfbag = sc.nextFloat();
        sc.close();
        
        for (int i = 0; i< numberOfobject; i++){
            valuePerweight.add(i, (valueOfobject.get(i) / weight.get(i)));
        }
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numberOfobject; i++) {
            indices.add(i);
        }

        indices.sort(Comparator.comparingDouble(valuePerweight::get).reversed());

        System.out.println("Sorted values:");
        for (int i : indices) {
            System.out.println("Value: " + valueOfobject.get(i) + ", Weight: " + weight.get(i));
        }

        for (int i : indices) {
            if (holditem + weight.get(i) <= weightOfbag) {
                holditem += weight.get(i);
                valuehave += valueOfobject.get(i);
            } else {
                float remainingWeight = weightOfbag - holditem;
                valuehave += (remainingWeight / weight.get(i)) * valueOfobject.get(i);
                break;
            }
        }

        System.out.println("Greedy max value have = " + valuehave);


    }
}
