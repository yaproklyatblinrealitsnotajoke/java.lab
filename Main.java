import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);

        // Проверка дробной части
        System.out.println("Введите х (дробное число): ");
        if (in.hasNextDouble()) {
            double x = in.nextDouble();
            System.out.println("дробная часть: " + m.fraction(x));
        } else {
            System.out.println("Ошибка: введите корректное дробное число.");
            in.next(); // сбросить некорректный ввод
        }

        // Проверка на символ
        System.out.println("Введите х (символ): ");
        if (in.hasNext()) {
            char x1 = in.next().charAt(0);
            System.out.println("число: " + m.charToNum(x1));
        } else {
            System.out.println("Ошибка: введите корректный символ.");
            in.next();
        }

        // Проверка на двузначное число
        System.out.println("Введите х (целое число): ");
        if (in.hasNextInt()) {
            int x2 = in.nextInt();
            System.out.println("число двузначное - : " + m.is2Digits(x2));
        } else {
            System.out.println("Ошибка: введите корректное целое число.");
            in.next();
        }

        // Проверка диапазона
        System.out.println("Введите a (целое число): ");
        int a = getValidInt(in);
        System.out.println("Введите b (целое число): ");
        int b = getValidInt(in);
        System.out.println("Введите num (целое число): ");
        int num = getValidInt(in);
        System.out.println("результат: " + m.isInRange(a, b, num));

        // Проверка на равенство
        System.out.println("Введите a (целое число): ");
        int a1 = getValidInt(in);
        System.out.println("Введите b (целое число): ");
        int b1 = getValidInt(in);
        System.out.println("Введите c (целое число): ");
        int c1 = getValidInt(in);
        System.out.println("результат: " + m.isEqual(a1, b1, c1));

        // Проверка абсолютного значения
        System.out.println("Введите х (целое число): ");
        int x5 = getValidInt(in);
        System.out.println("результат: " + m.abs(x5));

        // Проверка на 3 и 5
        System.out.println("Введите х (целое число): ");
        int x6 = getValidInt(in);
        System.out.println("результат: " + m.is35(x6));

        // Проверка на максимальное из трех чисел
        System.out.println("Введите x, y, z (целые числа): ");
        int x7 = getValidInt(in);
        int y7 = getValidInt(in);
        int z7 = getValidInt(in);
        System.out.println("результат: " + m.max3(x7, y7, z7));

        // Проверка дня недели
        System.out.println("Введите номер дня недели: ");
        int x9 = getValidInt(in);
        System.out.println("результат: " + m.day(x9));

        // Проверка списка чисел
        System.out.println("Введите х (количество чисел для вывода): ");
        int x10 = getValidInt(in);
        System.out.println("результат: " + m.listNums(x10));

        // Проверка четного числа
        System.out.println("Введите х (целое число): ");
        int x11 = getValidInt(in);
        System.out.println("результат: " + m.chet(x11));

        // Проверка длины числа
        System.out.println("Введите х (длинное число): ");
        long x12 = getValidLong(in);
        System.out.println("результат: " + m.numLen(x12));

        // Проверка квадрата
        System.out.println("Введите х (целое число): ");
        int x13 = getValidInt(in);
        m.square(x13);

        // Проверка прямоугольного треугольника
        System.out.println("Введите х (целое число): ");
        int x14 = getValidInt(in);
        m.rightTriangle(x14);

        // Проверка о нахождении первого элемента в массиве
        System.out.println("Введите значение для поиска: ");
        int x15 = getValidInt(in);
        System.out.println("Введите количество символов в массиве: ");
        int k = getValidInt(in);
        int[] arr = new int[k];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < k; i++) {
            arr[i] = getValidInt(in);
        }
        System.out.println("результат: " + m.findFirst(arr, x15));

        // Проверка на максимальное абсолютное значение в массиве
        System.out.println("Введите количество символов в массиве: ");
        int k1 = getValidInt(in);
        int[] arr2 = new int[k1];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < k1; i++) {
            arr2[i] = getValidInt(in);
        }
        System.out.println("результат: " + m.maxAbs(arr2));

        System.out.println("Введите количество символов в массиве arr: ");
        int k3 = in.nextInt();
        System.out.println("Введите pos: ");
        int pos = in.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] arr3 = new int[k3];
        for (int i = 0; i < k3; i++) {
            int p = in.nextInt();
            arr3[i] = p;
        }
        System.out.println("Введите количество символов в массиве ins: ");
        int kins = in.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] ins = new int[kins];
        for (int i = 0; i < kins; i++) {
            int p = in.nextInt();
            ins[i] = p;
        }
        int l=k3 + kins;
        arr3= m.add(arr3, ins, pos);
        for (int i = 0; i < l; i++) {
            System.out.print(arr3[i]);
        }



        System.out.println("Введите количество символов в массиве: ");
        int k7 = in.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] arr7 = new int[k7];
        for (int i = 0; i < k7; i++) {
            int p = in.nextInt();
            arr7[i] = p;
        }
        arr7= m.reverseBack(arr7);
        for (int i = 0; i < k7; i++) {
            System.out.print(arr7[i]);
        }
    }

    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число.");
            scanner.next(); // сбросить некорректный ввод
        }
        return scanner.nextInt();
    }

    private static long getValidLong(Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.println("Ошибка: введите корректное длинное число.");
            scanner.next(); // сбросить некорректный ввод
        }
        return scanner.nextLong();
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
