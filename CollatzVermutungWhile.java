public class CollatzVermutungWhile {

    public static void calculateCollatzNumbers(int n){
        System.out.println(n);

        while(n != 1){
            if(n%2==0){
                n = n/2;
            }
            else{
                n = 3*n+1;
            }
            System.out.println(n);
        }
    }
    //*
}
