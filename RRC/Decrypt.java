import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Decrypt implements Chiper {

    public static HashMap<String, String> chiper(int seed) {
        Random r = new Random(seed);
        HashMap<String, String> alf = new HashMap<>();
        ArrayList<String> alfLower = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz" +
                ".,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXUZ 1234567890_+=<>$%^*()`").split("")));
        ArrayList<String> alfUpper = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz" +
                ".,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXUZ 1234567890_+=<>$%^*()`").split("")));
        alfUpper.forEach((n) -> {
            int ran = r.nextInt(alfLower.size());
            alf.put(n, alfLower.get(ran));
            alfLower.remove(alfLower.get(ran));
        });
        System.out.println(alf);
        return alf;
    }


    public static String decrypt(String text, int seed) {
        StringBuilder res = new StringBuilder();
        String[] n = text.split("");
        for (int i = 0; i < text.length(); i++) {
            res.append(Decrypt.chiper(seed).get(n[i]));
        }
        return res.toString();
    }
}
