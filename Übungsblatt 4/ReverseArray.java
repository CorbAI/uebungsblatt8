public class ReverseArray {
    public static void main(String args[]) {
        int test[] = { 1, 2, 3, 4 };
        reverse(test);

    }

    public static int[] reverse(int[] givenArr) {

        if(givenArr == null){
            return null;
        }
        // Länge des givenArr wird in neuer Variable lengthArr festgehalten
        int arrLength = givenArr.length;

        int index = arrLength - 1;
        int outputArr[] = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            outputArr[i] = givenArr[index];
            index--;

        }
        //getArr(outputArr);
        return outputArr;

    }

    public static void getArr(int[] givenArr) {
        for (int i = 0; i < givenArr.length; i++) {
            System.out.println(i + ":" + givenArr[i]);
        }
    }
}
