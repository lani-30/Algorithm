import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changes = Math.min(countChanges(board, i, j, 'W'), countChanges(board, i, j, 'B'));
                minChanges = Math.min(minChanges, changes);
            }
        }

        bw.write(String.valueOf(minChanges));
        bw.flush();
        br.close();
        bw.close();
    }

    private static int countChanges(char[][] board, int startRow, int startCol, char startColor) {
        int changes = 0;
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if ((i + j) % 2 == 0 && board[i][j] != startColor) {
                    changes++;
                } else if ((i + j) % 2 != 0 && board[i][j] == startColor) {
                    changes++;
                }
            }
        }
        return changes;
    }
}
