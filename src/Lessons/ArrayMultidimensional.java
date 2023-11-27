package Lessons;

public class ArrayMultidimensional {

    public static void main(String[] args) {

//        int[][] numbers = {{4,3,2,1},{5,6,7,8}};
//        numbers[1][2] = 89;
//        System.out.println(numbers[1][2]);
//        for(int i=0; i<numbers.length; i++){
//            for (int j=0; j<numbers[i].length; j++){
//                System.out.print(numbers[i][j] +" ");
//            }
//            System.out.println();
//        }

        int rows = 3;
        int columns = 4;

        int[][] metrics = new int[rows][columns];

        int x = 1;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                metrics[i][j] = x;
                x++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                System.out.print(metrics[i][j] +" ");
            }
            System.out.println();
        }
    }
}
