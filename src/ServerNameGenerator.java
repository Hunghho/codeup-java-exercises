public class ServerNameGenerator {
    public static String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};
    public static String[] nouns = {"people", "history", "way", "art", "information", "map", "family", "government", "system", "computer"};

    public static String getRandomString(String[] strings){
        int randomString = (int) (Math.random() * strings.length);
        return strings[randomString];
    }

    public static void main(String[] args) {
        String randomAdjectives = getRandomString(adjectives);
        String randomNouns = getRandomString(nouns);

        System.out.printf("Here is your server name:%n%s-%s", randomAdjectives, randomNouns);
    }
}
