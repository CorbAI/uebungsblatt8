public class CollatzVermutungRecursive {

    private static final int ZIELWERT = 1;

    public static void calculateCollatzNumbers(int n){
        int a = n;
        System.out.println(a);
        if(a==ZIELWERT){
            return;
        }
        if(a%2==0){
            a = a/2;
        }
        else{
            a = 3*a+1;
        }
        calculateCollatzNumbers(a);

    }

    public static void main(String[] args) {
        calculateCollatzNumbers(55);;
    }
    
}
