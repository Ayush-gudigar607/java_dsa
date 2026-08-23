package level3;

public class tilesPlace {

    public static int PlaceTiles(int n, int m) {

        if (n == m) {
            return 2; //there are mainly 2 ways 
        }

        if (n < m) {
            return 1;  //there are mainly 1 ways it can be placed horizontally
        }
        
        //vertical placement
        int verticalPlacement = PlaceTiles(n - m, m);

        //horizontal placement
        int horizontalPlacement = PlaceTiles(n - 1, m);

        return verticalPlacement + horizontalPlacement;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int NoOfWays = PlaceTiles(n, m);
        System.out.println(NoOfWays);
    }
}
