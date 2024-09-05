public class quick {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public staic void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdx =partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=0; j<=eiSSSSs)
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
    }

    
}
