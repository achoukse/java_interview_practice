import java.util.Arrays;

public class problem167 {
    public static void main(String[] args) {
        //mergeSort
        int [] arr ={41,62,23,46,2,9,89,25,15,65};
        problem167 pp = new problem167();
        pp.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int begin, int end) {
        if(begin<end){
            int middle =(begin+end)/2;
            sort(arr,begin,middle);//left
            sort(arr,middle+1,end);//right
            merge(arr,begin,middle,end);
        }
    }

    private void merge(int[] arr,int begin,int middle,int end) {
        int leftSize=middle-begin+1;
        int rightSize = end-middle;
        int[] leftArray= new int[leftSize];
        int[] rightArray = new int[rightSize];

        for(int i=0;i<leftSize;i++){
            leftArray[i]= arr[begin+i];

        }
        for(int j =0;j<rightSize;j++){
            rightArray[j]=arr[middle+1+j];
        }

        int i =0;
        int j=0;
        int k = begin;
        while (i<leftSize&& j<rightSize){
            if(leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;

            }else {
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<rightSize){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
}
