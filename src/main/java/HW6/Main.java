package HW6;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arr2 = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr3 = new int[]{1, 2, 1, 6, 2, 3, 8, 1, 7};
        int[] arr4 = new int[]{1, 4, 4, 1, 1, 1, 4, 1, 4};

        ArrayMy ArrObj = new ArrayMy();

        try {
            ArrObj.printArr(ArrObj.arrayCreator(new int[] {1, 2, 7, 4, 0, 3, 7, 1, 7}));
            ArrObj.printArr(ArrObj.arrayCreator(arr1));
            ArrObj.printArr(ArrObj.arrayCreator(arr2));
            ArrObj.printArr(ArrObj.arrayCreator(arr3));

        }catch (RuntimeException ex){
            System.out.println("Минимум в одном из массиввов нет четверки");
            ex.printStackTrace();
        }
        System.out.println(ArrObj.arrayBool(arr1));
        System.out.println(ArrObj.arrayBool(arr4));






    }


}
