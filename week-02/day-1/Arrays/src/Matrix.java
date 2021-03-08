public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0, 0},
                          {0, 1, 0, 0},
                          {0, 0, 1, 0},
                          {0, 0, 0, 1}};

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
            }

            System.out.println();
        }
    }

}
   // private static void printmatrix (int array[][]) {
       // for (int row = 0; row < array.length; row++) { //start of row for loop
           // for (int column = 0; column < array[row].length; column++) { //start of column for  loop
                //System.out.print(array[row][column] + " ");
            //}// end of column for loop
            //System.out.println();
        //}
    //}

//end of class


// - Create a two dimensional array dynamically with the following content.
//   Note that a two dimensional array is often called matrix if every
//   internal array has the same length.
//   Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
//   Its length should depend on a variable
//
// - Print this two dimensional array to the output