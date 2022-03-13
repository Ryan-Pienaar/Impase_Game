// Notes on using this skeleton:
// - The names of variables and functions (both those given in the skeleton and those made by yourself) are up to you, as long as they are sensible.
// - You should document your code well with comments and (as stated above) sensible & logical names.
// - You are free to delete the comments typed in this skeleton.
// - Remember to follow the code specifications given in the project description.


// Replace "xxxxxxxx" below with your student number.  Remember to rename this file accordingly.
public class main {

    // No global variables or constants allowed.
    public static int genSeq(int diffColor)
    {
        int n = 2;
        int m = 8;

        for (int i = 2; i < diffColor ; i++)
        {
            n++;
            m = m * n + 2 * n;
        }
        return m;
    }

    // For the first hand-in, it is possible and highly recommended to code the entire program within the main function.
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = genSeq(n);
        String open = ".";
        String closed = "*";
        String[][] gameBoard = new String[m][m];

        //Filling gameBoard array
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (j != 0)
                {
                    gameBoard[i][j] = closed;
                }
                else {
                    gameBoard[i][j] = open;
                }
            }
        }

        //for checking the gameBoard state
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(gameBoard[i][j]);
            }
                System.out.println();
        }

        // Handle program arguments (with validation). Arguments can be referenced through the "args" parameter above.
        // The arguments appear in "args" in the order that they were passed into the program on execution.

        // Setup game state variables. Important considerations: How will you store your board? How will you reference the currently selected square?
    
        //boolean gameIsRunning = true;
        // "gameIsRunning" is an example of a game state variable. Add more as you see fit.

        // Enter the game loop. What will happen if you initialize gameIsRunning to false?
        //while (gameIsRunning) {
            //StdOut.println("We have entered the Game Loop!");
            //gameIsRunning = false;
        //}
        // What will happen if you remove the "gameIsRunning = false" statement inside the While loop? 

        // After the game is concluded, report the score by printing the state of the game to the terminal. 
        //StdOut.println("Game ended!");
    }
    
    // For the second hand-in, you must use functions effectively wherever possible. Put these functions here.


}

