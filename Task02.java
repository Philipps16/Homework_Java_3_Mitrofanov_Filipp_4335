package Homework_Java_3_Mitrofanov_Filipp_4335;

public class Task02 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            printArray("Данн массив:", array);
     
            array = deleteEvenElement(array);
            printArray("Результат:", array);
     
        }
     
        public static void printArray(String text, int[] array) {
            System.out.print(text + " [");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[array.length - 1] + "]");
        }
     
        public static int[] deleteEvenElement(int[] array) {
            int[] result = new int[array.length];
            int i, j;
            for (i = 0, j = 0; j < array.length; i++, j += 2) {
                if (array[j]/2!= 0);
                result[i] = array[j];
            }
            return result;
        }
    }
