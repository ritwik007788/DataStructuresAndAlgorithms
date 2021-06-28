class Trial{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int s = 2;
        int start = 0;
        int end = arr.length - 1;
        int f = 0 ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]==s){
                System.out.println(arr[mid]+" is found at index "+mid+" .");
                f = 1;
                break;
            } 

            else if(arr[mid]>s){
                end = mid-1;
            }

            else {
                start = mid+1;
            }
        }
        if(f==0)
        System.out.println("Required number wasn't found !");
    }
}