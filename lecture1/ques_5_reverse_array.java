public class ques_5_reverse_array {
  public static void reverse(int i,int[] arr,int n){
    if(i>=n/2) return;
    swap(arr, i,n-i-1);
    reverse(i+1, arr, n);

  }

   // swap elements inside array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

  public static void main(String[] args) {
    int n=5;
    int[] arr={1,2,3,4,5};
   
   reverse(0, arr, n);
   for(int i=0;i<n;i++){
    System.out.println(arr[i]);
   }
  }
}
