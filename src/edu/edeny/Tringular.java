package edu.edeny;

public class Tringular {
    public static void main(String[] args) {
        System.out.println(f(24, 2));
    }

    static int f(int n, int d) {


      int remainder=0;
      int count=0;
      int result;
      while(remainder==0){
          result=n/d;
          remainder=n%d;
          if(remainder==0)
              n=result;
        count++;
    }
      return count;
    }
}




       /* int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                c1++;
            if (a[i] % 3 == 0)
                c2++;
            if (a[i] % 5 == 0)
                c3++;
            if (a[i] % 2 != 0 && a[i] % 3 != 0)
                if (a[i] % 5 != 0)
                    c4++;
        }
            if (c1 + c2 + c3 + c4 != a.length)
                return 0;

            return 1;*/

//    }
//}