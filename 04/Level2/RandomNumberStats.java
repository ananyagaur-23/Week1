public class RandomNumberStats{
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000; // range: 1000–9999
        }
        return numbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / (double) numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Y12 rs = new Y12();
        int[] numbers = rs.generate4DigitRandomArray(5);

        System.out.print("Generated Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = rs.findAverageMinMax(numbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
