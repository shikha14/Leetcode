package array;

/**
 * Created by Shikha on 10/04/18.
 * You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

 Note:
 You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 Example 1:

 Given input matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 Example 2:

 Given input matrix =
 [
 [ 5, 1, 9,11],
 [ 2, 4, 8,10],
 [13, 3, 6, 7],
 [15,14,12,16]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [15,13, 2, 5],
 [14, 3, 4, 1],
 [12, 6, 8, 9],
 [16, 7,10,11]
 ]
 */
public class RotateImage {
    public static void rotate(int[][] matrix) {
        int length= matrix.length;

        for(int i=0;i<length/2;i++)
            for(int j=i;j<length-i-1;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[length-j-1][i];
                matrix[length-j-1][i]=matrix[length-i-1][length-j-1];
                matrix[length-i-1][length-j-1]=matrix[j][length-i-1];
                matrix[j][length-i-1]=temp;
            }

    }


    public static void main(String[] args){
        int mat[][] =
                {
                        {5, 1, 9, 11},
                        {2, 4, 8, 10},
                        {13, 3, 6, 7},
                        {15, 14, 12, 16}
                };
        displayMatrix(mat);
        rotate(mat);
        displayMatrix(mat);

        int mat1[][] =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };

        displayMatrix(mat1);
        rotate(mat1);
        displayMatrix(mat1);
    }

    public static void displayMatrix(int matrix[][]){
        int length = matrix.length;
        System.out.print("\nMatrix:\n");
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(matrix[i][j]+" \t");
            }
            System.out.print("\n");
        }

    }
}
