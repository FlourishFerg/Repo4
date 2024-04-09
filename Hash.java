import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("cat","animal");
        dictionary.put("promiscuous","prostitute");
        System.out.println(dictionary);
        int count = 1;
        for (String word: dictionary.keySet()){
            System.out.println(count+"."+word);
            count++;
        }
    }
}
