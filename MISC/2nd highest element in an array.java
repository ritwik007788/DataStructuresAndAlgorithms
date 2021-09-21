class Main{
  public static void main(String args[]){
    int arr[] = {1,4,2,7,6,3};
    int max= Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>max) max = arr[i];
    }
    
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>secondMax && arr[i]!=max) secondMax = arr[i];
    }
    
    System.out.println(secondMax);
    
  }
}
