package HW6;

public class ArrayMy {




    public int[] arrayCreator(int[] arr) throws RuntimeException{
        int[] j;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] == 4){
                j = new int[arr.length-1-i];
                i++;
                for (int k = 0; k < j.length; k++) {
                    j[k] = arr[i++];
                }
                return j;
            }
        }
        throw new RuntimeException();

    }

    public boolean arrayBool(int[] array){
        for (int i: array) {
            if(i != 1 && i != 4) return false;
        }
        return true;
    }

    public void printArr(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
