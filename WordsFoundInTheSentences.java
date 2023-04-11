public class WordsFoundInTheSentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int wordCount = 0;
        for(String str : sentences) {
            int count = str.split(" ").length;
            if(count > wordCount) {
                wordCount = count;
            }
        }
        return wordCount;
    }
}
