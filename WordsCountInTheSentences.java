public class WordsCountInTheSentences {
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

    public static int mostWordsFound2(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            char[] charArray = sentence.toCharArray();
            int count = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == ' ') {
                    count++;
                }
            }
            if (count > maxWords) {
                maxWords = count;
            }
        }
        maxWords += 1; // Only space was considered. So 1 is added to get max number of words
        return maxWords;
    }



}
