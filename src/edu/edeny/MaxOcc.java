package edu.edeny;

public class MaxOcc {

    public static void main(String[] args) {
        System.out.println(f(new int []{5,3,1,4,5,3,5}));
    }
    static int f(int a[]){

        int MaxValue=a[0];
        int count;
        int MaxCount=1;

        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=0;j<a.length;j++){
                if (a[i] == a[j])
                    count++;
                } if(count>MaxCount)
                    MaxValue=a[i];
            MaxCount=count;
            }return MaxValue;
        }


    }



