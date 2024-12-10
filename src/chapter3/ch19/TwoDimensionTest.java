package chapter3.ch19;

public class TwoDimensionTest {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
//        System.out.println(arr.length); // 행에 몇개가 들어가있는지
//        System.out.println(arr[0].length); //열에 몇개가 들어가있는지
        int[][] arr = {{1,2,3},{4,5,6,7}};
        
//        int i,j;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
