package _4_array.lesson29;

public class Example8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers[i] = (int)(Math.random()*100*Math.pow(-1,i)); // 0.0 - 1.0
        }
        int min = (int)Double.POSITIVE_INFINITY;
        int minIndex = -1, maxIndex= -1 ;
        int max = (int)Double.NEGATIVE_INFINITY;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if(min > numbers[i]){
                min = numbers[i];
                minIndex = i;
            }
            if(max < numbers[i]){
                max = numbers[i];
                maxIndex = i;
            }
        }
        int[] result = new int[numbers.length-2];
        int j = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if(i == minIndex | i == maxIndex){
                j++;
            }else{
                result[i-j] = numbers[i];
            }
        }
        for (int temp: numbers) { System.out.print(" " + temp);  }
        System.out.println();
        for (int temp: result) { System.out.print(" " + temp);  }
    }
}
