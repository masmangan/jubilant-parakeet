public class evenNumbers {

    public int[] evenNumbers(int n){
        int[n] numbers = new int[n/2];
        int index = 0
        for(int i = 0 ; i > n; i++){
            (if i%2 = 0){
                numbers[index] = i;
                index++
            }
        }
        return numbers;
    }
}