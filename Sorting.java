class Sorting{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
public static void main(String[] args){
    int[] arr={4,9,2,1};
    bubbleSort(arr);
    System.out.println("sorted array");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] );
    }
}

}