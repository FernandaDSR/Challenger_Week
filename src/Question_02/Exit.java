package Question_02;

public class Exit {

    public static int countEmotions(String text, String emojis){

        int count = 0;
        int index = text.indexOf(emojis);

        while(index != -1){
            count++;
            index = text.indexOf(emojis, index + emojis.length());

        }
        return count;
    }

    public static String determineFeeling(int funCount, int upsetCount){
        if(funCount == upsetCount){
            return  "Neutral";
        }else if (funCount > upsetCount){
            return "Fun";
        }else{
            return "Upset";
        }
        
    }

}
