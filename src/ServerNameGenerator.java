import java.util.Arrays;
public class ServerNameGenerator {

    public static String element(String[] array){

        return array[(int) (Math.random()* array.length)];
    }
    public static void main(String[] args) {
        String[] adjectives = {
                "awesome",
                "bright",
                "creative",
                "determined",
                "enthusiastic",
                "friendly",
                "graceful",
                "humorous",
                "intelligent",
                "joyful"
        };

        String[] nouns = {
                "apple",
                "banana",
                "cat",
                "dog",
                "elephant",
                "flower",
                "giraffe",
                "house",
                "island",
                "jacket"
        };
        System.out.println(element(adjectives));
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s",element(adjectives), element(nouns));
    }
}
