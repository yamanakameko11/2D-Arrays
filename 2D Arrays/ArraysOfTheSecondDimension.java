
/**
 * Write a description of class ArraysOfTheSecondDimension here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysOfTheSecondDimension
{
    int[] array;
    int[][] twoDimensionalArray;
    int[][][][][][][][][][] tenD;
    
    public ArraysOfTheSecondDimension() {
        array = new int[10];
        twoDimensionalArray = new int[5][10];
        // Two Dimensional Arrays are ALWAYS in 
        // row-major format.
        int num = 0;
        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int col = 0; col < twoDimensionalArray[0].length; col++) { // opens up a single row in array to find # of columns
                twoDimensionalArray[row][col] = num;
                num++;
            }
        }
    }
}
