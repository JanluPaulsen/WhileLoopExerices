public class Main {
    public static void main(String[] args) {
        int i = 5;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                totalEvenNumbers++;
                if (totalEvenNumbers == 5) {
                    break;
                }
            }else {
                totalOddNumbers++;
            }
            i++;
        }
        System.out.println(totalEvenNumbers);
        System.out.println(totalOddNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}