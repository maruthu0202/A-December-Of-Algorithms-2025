import java.util.*;

class Solution {
    static int R, C;
    static int[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();

        grid = new int[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int islands = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    islands++;
                    dfs(i, j);
                }
            }
        }

        System.out.println(islands);
    }

    static void dfs(int r, int c) {
      
        if (r < 0 || c < 0 || r >= R || c >= C) return;
        if (visited[r][c] || grid[r][c] == 0) return;

        visited[r][c] = true;

   
        dfs(r + 1, c); 
        dfs(r - 1, c); 
        dfs(r, c + 1); 
        dfs(r, c - 1); 
    }
}
