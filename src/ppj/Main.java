package ppj;

public class Main {


    public static void main(String[] args) {

        int n = 10;

        int[][] triangleTable = new int[n][];

        for (int o = 0; o < n; o++){
            triangleTable[o]= new int[o+1];
        }

        for (int i = 0; i < triangleTable.length; ++i) {
            for (int u = 0; u <= i; ++u) {
                triangleTable [i][u] = u+1;
            }
        }

        for (int i = 0; i < triangleTable.length; ++i) {
            for (int u = 0; u < triangleTable[i].length; ++u) {
                System.out.print(triangleTable[i][u] + ", ");
            }
            System.out.println();
        }
    }
}