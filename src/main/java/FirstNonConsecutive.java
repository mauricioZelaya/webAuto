class FirstNonConsecutive {
    /*my solution*/
    static Integer find(final int[] array) {
        boolean flag = false;
        int nonConsecutiveValue = array[0];
        if(array.length >= 2){
            for (int i = 0; i < array.length-1; i++){
                if (array[i+1] == array[i] + 1){
                    flag = true;
                }
                else {
                    flag = false;
                    nonConsecutiveValue = array[i+1];
                    break;
                }
            }
            if(flag){
                return null;
            }
            else{
                return nonConsecutiveValue;
            }
        }
        return nonConsecutiveValue;
    }

    /*better solution*/
    static Integer find1(final int[] array) {
        for(int i = 1; i < array.length; ++i)
        {
            if(array[i] - array[i - 1] != 1)
            {
                return array[i];
            }
        }
        return null;
    }
}
