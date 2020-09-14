/**
 * @author Boyu Yuan
 * @date 2020/9/14 20:37
 */
public class BowlingGame {
    public int rolls[] = new int[30];
    public int rollIndex = 0;

    public void roll(int mark){
        rolls[rollIndex++] = mark;
    }


//    public int calculateScore() {
//        int score = 0;
//        for (int i = 0; i < rolls.length; i++){
//            score += rolls[i];
//        }
//        return score;
//    }
//
//
//    public int calculateFillInScore() {
//        int score = 0;
//        int index = 0;
//        for (int round = 0; round < 10; round++){
//            if (rolls[index]+rolls[index+1] == 10){
//                score += rolls[index+2]+10;
//                index = index + 2;
//            }else {
//                score += rolls[index] + rolls[index+1];
//                index = index + 2;
//            }
//        }
//        return score;
//    }

    public int score() {
        int score = 0;
        int index = 0;
        for (int round = 0; round < 10; round++){
            if (rolls[index] == 10){
                score += 10 + rolls[index+1] + rolls[index+2];
                index = index +1 ;
            }else if  (rolls[index]+rolls[index+1] == 10){
                score += rolls[index+2]+10;
                index = index + 2;
            }else {
                score += rolls[index] + rolls[index+1];
                index = index + 2;
            }
        }
        return score;
    }
}
