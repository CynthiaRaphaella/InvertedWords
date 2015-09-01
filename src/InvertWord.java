public class InvertWord {

    public String revert(String phrase){
        if(phrase != null){
            String[] wordsFromPhrase = phrase.split(" ");
            StringBuilder invertedPhrase = new StringBuilder();

            for (int i = wordsFromPhrase.length - 1; i >= 0; i--) {
                invertedPhrase.append(wordsFromPhrase[i]).append(" ");
            }
            return invertedPhrase.toString();
        }

        return phrase;
    }
}
