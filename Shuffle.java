import java.util.Random;
import java.util.ArrayList;

public class Shuffle {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr0 = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            int randomNumber = rand.nextInt(100);
            arr0.add(randomNumber);
        }

    }
}
