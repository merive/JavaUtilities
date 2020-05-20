import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Decrypt implements Chiper {

    public static HashMap<String, String> setChiper() {
        Random r = new Random(23);
        HashMap<String, String> alf = new HashMap<>();
        ArrayList<String> alfLower = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz.,!?&/ ".split("")));
        ArrayList<String> alfUpper = new ArrayList<>(Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXUZ:'-@#~ ".split("")));
        alfUpper.forEach((n) -> {
            int ran = r.nextInt(alfLower.size());
            alf.put(n, alfLower.get(ran));
            alfLower.remove(alfLower.get(ran));
        });
        System.out.println(alf.toString());
        return alf;
    }


//    public static String setReplace(String text) {
//        StringBuilder res = new StringBuilder();
//        String[] n = text.split("");
//       for(int i = 0; i < text.length(); i++) {
//            res.append(n[i].replace(n, setChiper().get()));
//        }
//        return res.toString();
//    }


}
