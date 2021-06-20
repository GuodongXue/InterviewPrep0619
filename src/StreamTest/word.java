package StreamTest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class word {
    @Test
    public void words(){
        List<String> words = new ArrayList<>();
        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");

        Map<String, ArrayList<String>> map= new HashMap<>();
        words.stream().map(word -> {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            return newWord;

        }).collect(Collectors.toSet()).forEach(val -> map.putIfAbsent(val, new ArrayList<String>()));
        System.out.println(map.toString());
    }
}
