package edu.edeny;

public class Guthrie {

    public static void main(String[] args) {
        System.out.println(f(new int [] {1,15,2,14,3,13,4,12,5,11,6,10,7,18,8,9   ,17,16}));
    }
    static int f(int a[]) {

        int count ;
        int sum = 0;

        if (a.length % 2 == 0) {

            for (int i = 1; i <=a.length; i++) {
                count = 0;
                for (int j=0;j<a.length;j++) {
                    if (a[j] == i)
                        count++;

                    if(count!=1)
                    return 0;

                }
            }
        }
            for (int k = 0; k < a.length - 1; k++) {
                if(sum==a[k]+a[k+1])
                if(isSquare(sum)==0)
                    return 0;
            }
            return 1;
        }
       static int isSquare(int n){
        if(n>=0)
      for(int i=0;i<+n;i++){
            if(i*i==n)
                return 1;
      }
      return 0;
    }

    }