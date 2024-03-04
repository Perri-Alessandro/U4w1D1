import java.util.Arrays;
public class Esercizio1 {
    public static void main(String[] args) {

          int moltiplicationResult = moltiplication(5, 5);
        System.out.println("Multiplication Result: " + moltiplicationResult);
            String concatResult = concat("how", 7);
        System.out.println("Concatenation Result: " + concatResult);
                String[] arr = {"ciao", "ei","oo", "ma", "okk"};
                String[] newArr = array(arr,"sttt");
               System.out.println("New Array" + Arrays.toString(newArr) );
            }
        public static int moltiplication(int num1, int num2) {
            int result = num1 * num2;
            System.out.println(result);
            return result;
        }
        public static String concat(String str, int num) {
            String result = str + num;
            System.out.println(result);
            return result;

        }
        public static String[] array(String[] arr, String st) {
            String[] newArr = new String[arr.length + 1];
            for (int i = 0; i < 3; i++){
                newArr[i] = arr [i];
            }
            newArr[3] = st;
            newArr[4] = arr[3];
            newArr[5] = arr[4];
            return newArr;
        }
}
