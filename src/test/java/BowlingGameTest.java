import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    BowlingGame game = new BowlingGame();
    @Test
    void should_return_sum_when_the_score_includes_all_in(){
        for (int i = 0; i < 12; i++){
            game.roll(10);
        }
        assertEquals(300,game.calculateAllInScore());


    }
    @Test
    void should_return_sum_when_all_zero_score(){
        for (int i = 0; i < 20; i++){
            game.roll(0);
        }
        assertEquals(0,game.calculateScore());
    }
    @Test
    void should_return_sum_when_the_score_includes_fill_in(){
        game.roll(7);
        game.roll(3);
        for (int i = 0; i < 18; i++){
            game.roll(1);
        }
        assertEquals(29,game.calculateFillInScore());
    }



}
