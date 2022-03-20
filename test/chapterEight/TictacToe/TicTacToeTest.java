package chapterEight.TictacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.desktop.ScreenSleepEvent;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    public void setup(){
        ticTacToe = new TicTacToe();
    }
    @Test
     public void ticTacToeCanHaveAboard(){
        Board board = new Board(3);
        assertNotNull(board);
    }
    @Test
    public void boardHasSize(){
        Board board = new Board(3);
        assertEquals(board.getSize(),3);

    }
    @Test
    public void boardCanBeSetUp(){
        Board board = new Board(3);
        assertEquals(board.getGrid().length,3);
    }
    @Test
    public void boardSizeCannotBeLessThanThree(){
        try{
            Board board = new Board(2);
        }
        catch(InvalidSizeException e){
            assertEquals(e.getClass(),InvalidSizeException.class);
            assertEquals("size cannot be less than 3",e.getMessage());
        }
    }

    @Test
    void boardCanShowTest(){
        Board board = new Board(3);
        String actualBoard = board.display();
        System.out.println(actualBoard);
        String expectedBoard = """
                |   |  \s
             ---|---|---
                |   |  \s
             ---|---|---
                |   |  \s""";
        assertEquals(actualBoard,expectedBoard);
    }

}

