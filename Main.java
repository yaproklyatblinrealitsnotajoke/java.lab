import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите х: ");
//        double x = in.nextDouble();
//        System.out.println("дробная часть: " + m.fraction(x));
//
//        System.out.println("Введите х: ");
//        char x1 = in.next().charAt(0);;
//        System.out.println("число: " + m.charToNum(x1));

//        System.out.println("Введите х: ");
//        int x2 = in.nextInt();
//        System.out.println("число двузначное - : " + m.is2Digits(x2));

//          System.out.println("Введите a: ");
//          int a = in.nextInt();
//          System.out.println("Введите b: ");
//          int b = in.nextInt();
//          System.out.println("Введите num: ");
//          int num = in.nextInt();
//          System.out.println("результат: " + m.isInRange(a, b, num));

//        System.out.println("Введите a: ");
//          int a1 = in.nextInt();
//          System.out.println("Введите b: ");
//          int b1 = in.nextInt();
//          System.out.println("Введите c: ");
//          int c1 = in.nextInt();
//          System.out.println("результат: " + m.isEqual(a1, b1, c1));

//        System.out.println("Введите х: ");
//        int x5 = in.nextInt();
//        System.out.println("результат: " + m.abs(x5));

//        System.out.println("Введите х: ");
//        int x6 = in.nextInt();
//        System.out.println("результат: " + m.is35(x6));

//        System.out.println("Введите х: ");
//        int x7 = in.nextInt();
//        System.out.println("Введите y: ");
//        int y7 = in.nextInt();
//        System.out.println("Введите z: ");
//        int z7 = in.nextInt();
//        System.out.println("результат: " + m.max3(x7, y7, z7));

//        System.out.println("Введите х: ");
//        int x8 = in.nextInt();
//        System.out.println("Введите y: ");
//        int y8 = in.nextInt();
//        System.out.println("результат: " + m.sum2(x8, y8));

//        System.out.println("Введите х: ");
//        int x9 = in.nextInt();
//        System.out.println("результат: " + m.day(x9));

//        System.out.println("Введите х: ");
//        int x10 = in.nextInt();
//        System.out.println("результат: " + m.listNums(x10));

//        System.out.println("Введите х: ");
//        int x11 = in.nextInt();
//        System.out.println("результат: " + m.chet(x11));

//        System.out.println("Введите х: ");
//        long x12 = in.nextInt();
//        System.out.println("результат: " + m.numLen(x12));

//        System.out.println("Введите х: ");
//        int x13 = in.nextInt();
//        m.square(x13);

//        System.out.println("Введите х: ");
//        int x14 = in.nextInt();
//        m.rightTriangle(x14);

//        System.out.println("Введите х: ");
//        int x15 = in.nextInt();
//        System.out.println("Введите количество символов в массиве: ");
//        int k = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] arr = new int[k];
//        for (int i = 0; i < k; i++) {
//            int p = in.nextInt();
//            arr[i] = p;
//        }
//        System.out.println("результат: " + m.findFirst(arr, x15));


//        System.out.println("Введите количество символов в массиве: ");
//        int k1 = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] arr2 = new int[k1];
//        for (int i = 0; i < k1; i++) {
//            int p = in.nextInt();
//            arr2[i] = p;
//        }
//        System.out.println("результат: " + m.maxAbs(arr2));



//        System.out.println("Введите количество символов в массиве arr: ");
//        int k3 = in.nextInt();
//        System.out.println("Введите pos: ");
//        int pos = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] arr3 = new int[k3];
//        for (int i = 0; i < k3; i++) {
//            int p = in.nextInt();
//            arr3[i] = p;
//        }
//        System.out.println("Введите количество символов в массиве ins: ");
//        int kins = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] ins = new int[kins];
//        for (int i = 0; i < kins; i++) {
//            int p = in.nextInt();
//            ins[i] = p;
//        }
//        int l=k3 + kins;
//        arr3= m.add(arr3, ins, pos);
//        for (int i = 0; i < l; i++) {
//            System.out.println(arr3[i]);
//        }



//        System.out.println("Введите количество символов в массиве: ");
//        int k7 = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] arr7 = new int[k7];
//        for (int i = 0; i < k7; i++) {
//            int p = in.nextInt();
//            arr7[i] = p;
//        }
//        arr7= m.reverseBack(arr7);
//        for (int i = 0; i < k7; i++) {
//            System.out.println(arr7[i]);
//        }



//        System.out.println("Введите х: ");
//        int x16 = in.nextInt();
//        System.out.println("Введите количество символов в массиве: ");
//        int k9 = in.nextInt();
//        System.out.println("Введите элементы массива: ");
//        int[] arr9 = new int[k9];
//        for (int i = 0; i < k9; i++) {
//            int p = in.nextInt();
//            arr9[i] = p;
//        }
//        arr9= m.findAll(arr9, x16);
//        for (int i = 0; i < arr9.length; i++) {
//            System.out.println(arr9[i]);
//        }













    }


    public double fraction(double x) {
        int i = (int) x;
        double d = x - i;
        return d;
    }

    public int charToNum(char x1) {
        int c = (int) x1;
        return c;
    }

    public boolean is2Digits(int x2) {
        int j = x2 / 10;
        if (j == 0)
            return false;
        else {
            j = j / 10;
            if (j == 0) {
                return true;
            } else
                return false;
        }
    }
    public boolean isInRange (int a, int b, int num){
        if (a>b)
            return ((num >= b) && (num <=a));
        else
            return ((num <= b) && (num >=a));
    }

    public boolean isEqual(int a, int b, int c){
        return ((a==b) && (b==c));
    }

    public int abs (int x){
        if (x>0)
            return x;
        else
            return -x;
    }

    public boolean is35 (int x){
        return (!((x%3==0) && (x%5==0)) && ((x%5==0) || (x%3==0)));
    }

    public int max3 (int x, int y, int z){
        if ((x > y) && (x>z))
            return x;
        if ((y > x) && (y>z))
            return y;
        else
            return z;
    }

    public int sum2 (int x, int y){
        int sum = x+y;
        if ((sum >10) && (sum <19))
            return 20;
        else
            return sum;
    }

    public String day (int x){
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "анлак";
        }
    }

    public String listNums (int x){
        String s = "";
        for (int i = 0; i <x; i++)
            s+=i + " ";
        s+=x;
        return s;
    }

    public String chet (int x){
        String s = "";
        for (int i = 0; i <x; i=i+2)
            s+=i + " ";
        s+=x;
        return s;
    }

    public int numLen (long x){
        int i =0;
        while (x>0) {
            i++;
            x /= 10;
        }
        return i;
    }

    public void square (int x){
        for (int i = 0; i<x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst (int[] arr, int x){
        for (int i =0; i< arr.length; i++){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }

    public int maxAbs (int[] arr){
        int max = arr[0];
        for (int i =0; i< arr.length; i++){
            if (abs(arr[i])>abs(max))
                max = arr[i];
        }
        return max;
    }

    public int[] add (int[] arr, int[] ins, int pos){
        int l=arr.length+ins.length;
        int[] arr2 = new int[l];
        int i1=0;
        int i2 = pos;
        for (int i = 0; i <pos ; i++) {
            arr2[i] = arr[i];
        }
        for (int i = pos; i <pos+ins.length ; i++) {
            arr2[i] = ins[i1];
            i1++;
        }
        for (int i = pos+ins.length; i <l ; i++) {
            arr2[i] = arr[i2];
            i2++;
        }
        return arr2;
    }

    public int[] reverseBack (int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i =0; i< arr.length; i++){
            arr2[i]=arr[arr.length-i-1];
        }
        return arr2;
    }

    public int[] findAll (int[] arr, int x){
        int k = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==x)
                k++;
        int[] arr2 = new int[k];
        int i1=0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==x) {
                arr2[i1] = i;
                i1++;
            }
        return arr2;

    }



}
