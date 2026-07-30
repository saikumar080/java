import java.util.*;
public class Bingo {
   
    public static int[][] generateCards( int row, int col) {
        Random rand = new Random();
        int[][] cards=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cards[i][j] = rand.nextInt(100); // Random number between 0 and 99
            }
        }
        return cards;
        // for (int i = 0; i < numPlayers; i++) {
        //     System.out.println("Player " + (i + 1) + "'s card:");
        //     for (int j = 0; j < row; j++) {
        //         for (int k = 0; k < col; k++) {
        //             System.out.print(rand.nextInt(100) + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    }
    public static void checkBingo(int[][] card, int row, int col) {
        // Check rows
        for (int i = 0; i < row; i++) {
            boolean bingo = true;
            for (int j = 0; j < col; j++) {
                if (card[i][j] != -1) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                System.out.println("Bingo in row " + (i + 1));
                return;
            }
        }

        // Check columns
        for (int i = 0; i < col; i++) {
            boolean bingo = true;
            for (int j = 0; j < row; j++) {
                if (card[j][i] != -1) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                System.out.println("Bingo in column " + (i + 1));
                return;
            }
        }

        // Check diagonals
        boolean bingo = true;
        for (int i = 0; i < row; i++) {
            if (card[i][i] != -1) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            System.out.println("Bingo in diagonal from top-left to bottom-right");
            return;
        }

        bingo = true;
        for (int i = 0; i < row; i++) {
            if (card[i][row - 1 - i] != -1) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            System.out.println("Bingo in diagonal from top-right to bottom-left");
            return;
        }

        System.out.println("No Bingo yet.");
    }
    public static void markNumber(int[][] card, int number) {
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                if (card[i][j] == number) {
                    card[i][j] = -1; // Mark the number as called
                }
            }
        }
    }
    public static void printCard(int[][] card) {
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                if (card[i][j] == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print(card[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void playGame(int[][] card) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to mark (or -1 to quit):");
            int number = sc.nextInt();
            if (number == -1) {
                break;
            }
            markNumber(card, number);
            printCard(card);
            checkBingo(card, card.length, card[0].length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int numPlayers = sc.nextInt();
        System.out.println("Enter the number of cards per player:");
        int numCards = sc.nextInt();
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < numCards; j++) {
                int[][] card = generateCards(row, col);
                System.out.println("Card " + (j + 1) + ":");
                printCard(card);
                playGame(card);
            }
        }
        System.out.println("Game Over!");
        sc.close();
    }

} 