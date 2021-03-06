import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;


public class Maze {
	private int[][] maze;
	private int[][] visited;
	private boolean exitFound;
	private int size;

	public Maze() throws Exception {
		exitFound = false;
		Scanner file = new Scanner(new File("H:\\APCS\\Unit14_2016\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		while (file.hasNextInt()) {
			int size = file.nextInt();
			maze = new int[size][size];
			visited = new int[size][size];
			System.out.println(size);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					maze[i][j] = file.nextInt();
					System.out.print(maze[i][j]);
					visited[i][j] = 0;
				}
				System.out.println();
			}
			hasExitPath(0, 0);
			printExitfound();
		}

	}

	public int[][] testing() {
		return maze;
	}

	public void printExitfound() {
		System.out.println(exitFound);
	}

	public void hasExitPath(int r, int c) {
		if (!(r < maze.length && r >= 0 && c < maze.length && c >= 0))
			return;
		if (maze[r][c] == 0 || visited[r][c] == 1)
			return;
		if (c == maze.length) {
			exitFound = true;
			return;
		}
		visited[r][c] = 1;
		hasExitPath(r - 1, c);
		hasExitPath(r + 1, c);
		hasExitPath(r, c - 1);
		hasExitPath(r, c + 1);
	}

	public String toString() {
		String output = "";
		return output;
	}
}
