public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";  
        char charToRemove = 'l';       
        String result = removeCharacter(input, charToRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String input, char charToRemove) {
        return input.replaceAll(String.valueOf(charToRemove), "");
    }
}
