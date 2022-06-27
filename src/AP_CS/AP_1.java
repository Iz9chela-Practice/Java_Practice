package AP_CS;

public class AP_1 {
    public static void main(String[] args) {
//        scoresIncreasing(new int[]{1,3,4});
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] < scores[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for(int i = 0; i < scores.length - 1;i++){
            if(scores[i] == 100 && (scores[i] == scores[i+1])){
                return true;
            }
        }
        return false;
    }

}
