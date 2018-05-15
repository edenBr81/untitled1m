package edu.edeny;

public class Dalby {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 4, 8}));
    }

    static int f(int a[]) {
        if (a.length < 2)
            return 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;

            for (int j = 0; j < a.length; j++) {
                if(i!=j)
                sum += a[j];
            }
            if (a[i] == sum)
                return 0;
            }
                return 1;

        }
    }

