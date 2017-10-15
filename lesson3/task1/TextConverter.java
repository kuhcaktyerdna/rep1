
package task1;


public class TextConverter {
    
    private String text;
    
    public String[] convertString(String text){
        this.text=text;
        String[] words=findWordsInString(text);
        return words;
    }
    
    private String[] findWordsInString(String text){
        String[] words = text.trim().split("[,;:.!?\\s]+");
        return words;
    }
}
