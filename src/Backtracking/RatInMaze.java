package Backtracking;

import Array.Array;

import java.util.Scanner;

public class RatInMaze {

    private static int noOfPath(int strR , int strC , int endR , int endC){

        if (strR == endR || strC == endC) return 1;
        if (strR > endR || strC > endC) return 0;

        int rightPath = noOfPath(strR , strC + 1 , endR , endC);
        int downPath = noOfPath(strR + 1 , strC , endR , endC);

        return rightPath + downPath;
    }

    private static void printPaths(int strR , int strC , int endR , int endC , String str){
        if (strR > endR || strC > endC) return;
        if (strR == endR && strC == endC) System.out.println(str);

        // GO DOWN
        printPaths(strR + 1 , strC , endR , endC , str+"D");

        // GO RIGHT
        printPaths(strR , strC + 1 , endR , endC , str+"R");

    }

    private static void printpathIn4Direction(int strR , int strC , int endR , int endC , String str , boolean [][] isVisited){
        if (strR < 0 || strC < 0) return;
        if (strR > endR || strC > endC) return;
        if (strR == endR && strC == endC) {
            System.out.println(str);
            return;
        }
        if (isVisited[strR][strC]) return;

        isVisited[strR][strC] = true;

        // GO RIGHT
        printpathIn4Direction(strR , strC + 1 , endR , endC , str + "R" , isVisited);

        // GO LEFT
        printpathIn4Direction(strR , strC - 1 , endR , endC , str + "L" , isVisited);

        // GO TOP
        printpathIn4Direction(strR - 1 , strC , endR , endC , str + "U" , isVisited);

        // GO DOWN
        printpathIn4Direction(strR + 1 , strC , endR , endC , str + "D" , isVisited);

        isVisited[strR][strC] = false;

    }

    private static void printParthInBlockedMazeIn2Directions(int strR , int strC , int endR , int endC , String s , int [][] maze){

        if (strR > endR || strC > endC) return;
        if (strR == endR && strC == endC){
            System.out.println(s);
            return;
        }
        if (maze[strR][strC] == 0) return;

        printParthInBlockedMazeIn2Directions(strR , strC+1 , endR , endC , s+"R" , maze);
        printParthInBlockedMazeIn2Directions(strR+1 , strC , endR , endC , s+"D" , maze);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last Row : ");
        int endR = sc.nextInt();
        System.out.print("Enter the last Column : ");
        int endC = sc.nextInt();

//        boolean [][] isVisited = new boolean[endR][endC];
        int [][] blockedMaze = {
                { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 }
        };


//        System.out.println(noOfPath(1 , 1 , endR , endC));
//        printPaths(1 , 1 , endR , endC , "");

//        printpathIn4Direction(0 , 0 , endR-1 , endC-1 , "" , isVisited);

        printParthInBlockedMazeIn2Directions(0 , 0 , endR-1 , endC-1 , "" , blockedMaze);
    }

}
