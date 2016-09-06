package AppClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayala-hurtado
 */

public class Sorting {

    //Time: O(n^2)
    //Space: O(1)
    public int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {

            for(int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
        
    }
    
    //Time: O(n^2)
    //Space: O(1)
    public int[] insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        return arr;
    }
    
   
    
    //Time: O(nlgn)
    //Space: O(n)
    public int[] mergeSort(int[] arr) {
        if(arr.length <= 1) return arr;
        int[] arr1 = copyArray(arr, 0, (arr.length/2));
        int[] arr2 = copyArray(arr, (arr.length/2), arr.length);
        
        return merge(mergeSort(arr1), mergeSort(arr2));
        
        
    }
    
    public int[] copyArray(int[] arr, int s, int e) {
        int[] newArr = new int[(e-s)];
        for(int j = s; j < e; j++) {
            newArr[j-s] = arr[j];
        }
        return newArr;
    }
    
    public int[] merge(int[] arr1, int[] arr2) {
        
        int i = 0;
        int j = 0;
        int[] res = new int[arr1.length + arr2.length];
        int n = 0;
        while(n < res.length){
            
            if(i >= arr1.length) {
                res[n++] = arr2[j];
                j++;
                
            } else if(j >= arr2.length) {                
                res[n++] = arr1[i];
                i++;
            } else if(arr1[i] < arr2[j]) {
                res[n++] = arr1[i++];
            } else {
                res[n++] = arr2[j++];
            }        
            
            
        }    
        return res;
        
    }
    
    
    //Time: O(nlgn)
    //Space: O(n)   
    public void QuickSort(int[] arr) {
        
        quickSort(arr, 0, arr.length);
        
    }
    
    
    public void quickSort(int[] arr, int start, int end) {
     
        if(end <= start) return;
        
        
        int pivot = (end+start)/2;
        int temp = arr[end-1];
        arr[end-1] = arr[pivot];
        arr[pivot] = temp;
        
        
        int j = 0;
        for(int i = 0; i < end -1; i++) {
            
            if(arr[i] < arr[end-1]){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j++] = tmp;
            } 
            
        }
        
        temp = arr[j];
        arr[j] = arr[end-1];
        arr[end-1] = temp;
        
        
        quickSort(arr, 0, pivot);
        quickSort(arr, pivot + 1, end);  
        
    }
    
    

    
}
