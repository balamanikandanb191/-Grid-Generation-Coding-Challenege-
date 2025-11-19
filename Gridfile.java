import java.util.Scanner;
import java.util.Random;

public class GridTask
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int n = 0;

        while (true) {
        System.out.print("Enter grid size (N): ");
        String temp = sc.nextLine();
          try
{
            n = Integer.parseInt(temp);
            if (n > 0) {
                    break;
                } else {
                    System.out.println("N must be greater than 0");
                }
            }
catch (Exception ex)
{
                System.out.println("Please enter a valid number.");
            }
        }

        int[][] arr = new int[n][n];

        for (int r = 0; r < n; r++)
{
            for (int c = 0; c < n; c++) 
{
                int val = (ran.nextInt(10) + 1) * 2;
                arr[r][c] = val;
            }
        }

        System.out.println("\nStep 1:\n");
        for (int r = 0; r < n; r++)
{
            for (int c = 0; c < n; c++) 
{
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int find = 0;
        while (true) {
            System.out.print("\nChoose any even number from 2 to 20: ");
            String t = sc.nextLine();
            try
{
                find = Integer.parseInt(t);
                if (find >= 2 && find <= 20 && find % 2 == 0)
{
                    break;
                } 
else
{
                    System.out.println("Please enter a valid even number.");
                }
            } 
catch (Exception ex) 
{
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("\nStep 2:\n");

        int count = 0;

        for (int r = 0; r < n; r++) 
{
            for (int c = 0; c < n; c++) 
{

                if (arr[r][c] == find)
{
                    System.out.print("[" + arr[r][c] + "] ");
                    count++;
                }
else
{
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nThe number " + find + " appeared " + count + " time(s).");

    }
}
