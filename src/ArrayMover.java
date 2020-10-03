public class ArrayMover{

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {9, 10 , 11, 12, 13}
        };
        int maxHeight = arr.length, maxWidth = 0;
        for(int[] row : arr){
            int columnsCount = 0;
            for(int column : row){
                columnsCount++;
            }
            if(columnsCount > maxWidth){
                maxWidth = columnsCount;
            }
        }
        int[][] arrRes = new int[maxWidth][maxHeight];
        int rowIndex = 0;
        for(int a = 0;a<arr.length+2;a++) {
            for (int i = arr.length-1; i >= 0; i--) {
                try {
                    arrRes[rowIndex][arr.length - 1 - i] = arr[i][rowIndex];
                }catch (Exception e){

                }
            }
            rowIndex++;
        }
        for(int[] row : arrRes){
            for(int column : row){
                System.out.print(column + ", ");
            }
            System.out.println();
        }
    }

}
