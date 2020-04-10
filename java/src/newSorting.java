public class newSorting {
    public void newSorting(int[] array, int size){
        if (array.length <= size){
            quickSort(array);  //calls quick sort once the array length is less than or equal to size//
        }
        else{
            int mid = array.length / 2;
            int[] left = new int[mid];                      //creates two arrays (left and right) to split the array in half//
            int[] right = new int[array.length - mid];
            for (int i = 0; i < left.length; i++){          //populates left array//
                left[i] = array[i];
            }
            for (int i = 0; i < right.length; i++){         //populates right array//
                right[i] = array[i + mid];
            }
            newSorting(left, size);                         //recursively calls newSorting with left and right array//
            newSorting(right, size);
            mergeSortedHalves(array, left, right);          //merges the two sorted halves//
        }
    }

    public void quickSort(int[] array){                 //starts calling the other quick sort to do the work//
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high){
        if (high <= low){                //once the size of the array is 1 or less it returns//
            return;
        }
        else{
            int pivot = partition(array, low, high);        //calls partition to get the number for the pivot//
            quickSort(array, low, pivot - 1);         //calls quick sort recursively with the left and right side of the arrays//
            quickSort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high){
        int i = low + 1;
        int pivot = array[low];     //makes the pivot the first element in the array//
        for (int j = low + 1; j <= high; j++){
            if (array[j] < pivot){      //if the current element is less than the pivot it switches it with the the element at i//
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[low];          //switches the pivot with the last element that was less than the pivot//
        array[low] = array[i - 1];
        array[i - 1] = temp;
        return i - 1;
    }

    private void mergeSortedHalves(int[] array, int[] left, int[] right){
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < array.length; i++){          //goes through array comparing the elements at the left and right index//
            if (leftIndex < left.length && rightIndex < right.length){      //if the element in the left is less than the right it is put in array and left index is updated//
                if (left[leftIndex] < right[rightIndex]){
                    array[i] = left[leftIndex];
                    leftIndex++;
                }
                else{        //if the element in the left is less than the right it is put in array and left index is updated//
                    array[i] = right[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < left.length){
                array[i] = left[leftIndex];
                leftIndex++;
            }
            else if(rightIndex < right.length){
                array[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }

}
