import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

       int []newArr= insert(arr,99,1);
        for(int ele:newArr){
            System.out.println(ele);
        }



    }
    public static int [] insert(int arr[],int value,int postion){
        int arrIndex=arr.length-1;
        int tempIndex=arr.length;
        int tempArr[] =new int [tempIndex+1];
        boolean isInserted=false;
        if(postion==0){
            tempArr[0]=value;
            for(int i=1;i<tempArr.length;i++){
                tempArr[i]=arr[i-1];
            }
        }
        else {
            tempArr[postion]=value;
            for(int j=0;j<postion;j++){
                tempArr[j]=arr[j];
            }
            for(int k=postion+1;k<tempArr.length;k++){
                tempArr[k]=arr[k-1];
            }
            tempArr[postion]=value;
        }
    return tempArr;

    }

}