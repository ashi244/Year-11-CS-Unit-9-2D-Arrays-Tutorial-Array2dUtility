
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int [][] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                count += array[i][j];
            }
        }
        return count;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int [][] array){
        double sum = sum(array);
        double average = sum / (array.length * array[0].length);
        return average;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int [][] array){
        int minimum = 100000;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < minimum){
                    minimum = array[i][j];
                }
            }
        }
        return minimum;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int [][] array){
        int maximum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > maximum){
                    maximum = array[i][j];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int [][] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    count+= 1;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int [][] array){
        int count = 0;
        for (int [] row: array){
            for (int num : row){
                if (num % 2 == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < 0){
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int [][] array){
        int [] sums = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sums[i] = rowSum(array, i);
        }
        return sums;
    }
    public static int rowSum(int [][] array, int rowIndex){
        int sum = 0;
        for (int num: array[rowIndex]){
            sum += num;
        }
        return sum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int [][] array){
        int colNum = array[0].length;
        int [] sums = new int[colNum];
        for (int i = 0; i < colNum; i++){
            sums[i] = colSum(array, i);
        }
        return sums;
    }
    public static int colSum(int [][] array, int colIndex){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][colIndex];
        }
        return sum;
    }
}
