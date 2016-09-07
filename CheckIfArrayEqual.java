package checkifarrayequal;

public class CheckIfArrayEqual {

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4};
        int arr2[] = {1, 3, 4};
        boolean equalOrNot = true;
        if(arr1.length == arr2.length) {
            for(int i = 0; i <= arr1.length - 1; i++) {
                if(arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }
            }
        }
        else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays Are Equal");
        }
        else {
            System.out.println("Two Arrays Are Not equal");
        }
    }
    
}
