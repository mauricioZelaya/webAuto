public class orderArray {
    public static int[] sortArray(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2!=0){
                for (int j = i+1; j < array.length; j++){
                    if(array[j] % 2 != 0){
                      if(array[i]  > array[j]){
                          aux = array[j];
                          array[j] = array[i];
                          array[i] = aux;
                      }
                    }
                }
            }
        }
        return array;
    }
}

