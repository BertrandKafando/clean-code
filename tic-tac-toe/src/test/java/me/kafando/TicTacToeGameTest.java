package me.kafando;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TicTacToeGameTest {
   private TicTacToeGame game;
    @BeforeEach
     void set_up(){
        game = new TicTacToeGame();
     }

    @Test 
    void get_player_choix(){

        game.play('X',1,2);
        char result = game.get_case_valeu(1, 2);
       assertThat(result).isEqualTo('X');
    }

    @Test

    void get_X_winner(){
        game.play('X', 0, 0);
        game.play('X', 1, 0);
        game.play('X', 2, 0);

        char result = game.winner();

        assertThat(result).isEqualTo('X');
    }

    @Test
    void get_Y_winner(){
        game.play('Y', 0, 0);
        game.play('Y', 1, 0);
        game.play('Y', 2, 0);

        char result = game.winner();

        assertThat(result).isEqualTo('Y');
    }

    @Test
    void get_X_winner_on_row(){

        game.play('X', 1, 0);
        game.play('X', 1, 1);
        game.play('X', 1, 2);

        char result = game.winner();

        assertThat(result).isEqualTo('X');
    }

    @Test
    void get_Y_winner_on_column(){
        game.play('Y', 0, 2);
        game.play('Y', 1, 2);
        game.play('Y', 2, 2);

        char result = game.winner();

        assertThat(result).isEqualTo('Y');
    }


    @Test
    void get_X_winner_on_diagonal(){
        game.play('X', 0, 0);
        game.play('X', 1, 1);
        game.play('X', 2, 2);

        char result = game.winner();

        assertThat(result).isEqualTo('X');
    }

    @Test
    void get_X_winner_on_diagonal2(){
        game.play('X', 0, 2);
        game.play('X', 1, 1);
        game.play('X', 2, 0);

        char result = game.winner();

        assertThat(result).isEqualTo('X');
    }





    
}