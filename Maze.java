import java.util.Scanner;

public class Maze
{
    public static final int EMPTY = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int END = 3;
    public static final int VISITED = 4;
    
    public static final char NORTH = 'n';
    public static final char EAST = 'e';
    public static final char SOUTH = 's';
    public static final char WEST = 'w';

    public static void main(String[] args)
    {
        int[][] grid = {
            { WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL, WALL},
            {END, EMPTY,  WALL,  WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, WALL},
            { WALL, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, EMPTY,  WALL, WALL},
            { EMPTY,  WALL,  WALL,  WALL, EMPTY,  WALL, EMPTY,  WALL, EMPTY, WALL},
            { WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL, EMPTY, EMPTY, EMPTY, WALL},
            { WALL,  WALL, EMPTY,  WALL,  WALL, EMPTY, EMPTY,  WALL, EMPTY, WALL},
            { EMPTY,  WALL, EMPTY, EMPTY, EMPTY, EMPTY,  WALL,  WALL, EMPTY,  END},
            { WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL,  WALL, WALL},
        };
                
       GridViewer.view(grid);
        
        String solution;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find a solution to get from ^^ to $$, using the characters " 
            + "'" + NORTH + "', '" + EAST + "', '" + SOUTH + "' and '" + WEST + "'"
            + " (for north, east, south and west).");
        System.out.print("Your solution: ");
        solution = sc.nextLine();
        
        int currentRow = 1;
        int currentCol = 0;
        boolean done = false;
        boolean solved = false;
        int charIndex = 0;
        int solutionLength = solution.length();
        
        while(!done && charIndex < solutionLength)
        {
            char direction = solution.charAt(charIndex);
            System.out.println("Location: (" + currentRow + ", " + currentCol 
                + "), next direction: '" + direction + "'");
            
            switch(direction)
            {
                case NORTH:
                    CurrentRow--;
                    break;
                
                case EAST:
                    CurrentCol++;
                    break;
                    
                case SOUTH:
                    CurrentRow++;
                    break;
                    
                case WEST:
                    currentCol--;
                    break;
            
                default:
                    System.out.println("MESSAGE 1"); // you have no idea where you going.
            }
            
            if(row < 0 || col < 0
                || row >= grid.length || col >= grid[row].length)
            {
                done = true;
                System.out.println("MESSAGE 2"); // you fall into the chasm of doom.
            }
<<<<<<< HEAD
            else
            {
                if(grid[row][col] == EMPTY)
                {
                    grid[row][col] = VISITED;
                }
                else if(grid[row][col] == WALL)
                {
                    done = true;
                    System.out.println("MESSAGE 3"); // You stumble blindly into a solid concrete wall.
                }
                else if(grid[row][col] == END)
                {
                    done = true;
                    solved = true;
                    System.out.println("MESSAGE 4"); // Solved.
                }
                else
                {} // Do nothing
=======
            switch(grid[currentRow][currentCol])
{
case Maze.EMPTY:
grid[currentRow][currentCol] = Maze.VISITED;
break;
case Maze.WALL:
done = true;
System.out.println("You stumble blindly into a solid concrete wall.");
break;
case Maze.END:
done = true;
solved = true;
System.out.println("SOLVED!");
break;
default:
// Do nothing


>>>>>>> if_replace
            }
            
            charIndex++;
        }
        
        if(!solved)
        {
            System.out.println("MESSAGE 5"); // You have failed to escape.Future archeologists gaze upon your remains in bafflement.
        }
        
       GridViewer.view(grid);
}
