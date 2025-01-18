public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language.";
        String wordToReplace = "popular";
        String replacementWord = "widely-used";

        String result = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + result);
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
