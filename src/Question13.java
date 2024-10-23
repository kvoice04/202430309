public class Question13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum+=matrix[i][j];
            }
            System.out.println("행 "+i+"의 합: "+rowSum);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int colSum = 0;
            for(int j = 0; j < matrix.length; j++) {
                colSum+=matrix[j][i];
            }
            System.out.println("열 "+i+"의 합: "+colSum);
        }
    }
}

