package ma.enset;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    private BowlingGame game ;

    @BeforeEach
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test 
   void get_zero_pins() {

    for (int i =0; i<20; i++){
        game.roll(0);
    }

    int score = game.score();
    assertThat(score).isEqualTo(0);
   }

   @Test
   void get_One_pin(){

    game.roll(1);
    for (int i =0; i<19; i++){
        game.roll(0);
    }

    int score = game.score();

    assertThat(score).isEqualTo(1);

   }

   @Test
   void get_spare_bonus(){
    game.roll(5);
    game.roll(5);
    game.roll(3);
    for(int i=0; i<17;i++){
        game.roll(0);
    }

   int score = game.score();


   assertThat(score).isEqualTo(16);
   }

   @Test
   void non_spare(){
    game.roll(1);
    game.roll(5);
    game.roll(5);
    game.roll(3);
    for(int i=0; i<16;i++){
        game.roll(0);
    }
    int score = game.score();

    assertThat(score).isEqualTo(14);
   }


   //@Test
    void get_strike_bonus(){
     game.roll(10);
     game.roll(2);
     game.roll(4);
     for(int i=0; i<16;i++){
          game.roll(0);
     }
     int score = game.score();
    
     assertThat(score).isEqualTo(22);
    }

   // @Test
    void two_stick_bonus(){
     game.roll(10);
     game.roll(10);
     game.roll(2);
     game.roll(4);
     for(int i=0; i<14;i++){
          game.roll(0);
     }
     int score = game.score();
    
     assertThat(score).isEqualTo(48);
    }

    //@Test
    void good_game(){
        for(int i=0; i<12;i++){
            game.roll(10);
        }
        int score = game.score();
        assertThat(score).isEqualTo(300);
    }
    

    
}
