import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    // TASK 1:
    public static void minimum(int n, int[] arr, int start, int min) { // Complexity: linear O(N)

        if (start == n) {
            System.out.println(min);
            return;
        }
        if (arr[start] < min) {
            min = arr[start];
        }
        minimum(n, arr, start + 1, min);
    }

    public static void task1() {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        minimum(n, arr, 0, Integer.MAX_VALUE);
    }

    //TASK 2:
    public static void average(int n, int[] arr, int start, double avar) { // Complexity: linear O(N)

        if (start == n) {

            System.out.println(avar / n);
            return;
        }
        avar += arr[start];
        average(n, arr, start + 1, avar);
    }

    public static void task2() {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        average(n, arr, 0, 0);

    }

    //TASK 3:
    public static boolean prime(int n, int k, int i) {// Complexity: linear O(N)
        if (n <= 1) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i == k) {
            return true;
        }
        return prime(n, k, i + 1);

    }

    public static void task3() {
        int n = sc.nextInt();

        System.out.println(prime(n, (int) Math.sqrt(n), 2) ? "prime" : "composite");

    }

    //TASK 4:
    public static int fact(int n) { // Complexity: linear O(N)
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void task4() {
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    // TASK 5:
    public static int fib(int n) { // Complexity: exponential O(2^N)
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void task5() {
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    //TASK 6:

    public static int power(int a, int n) { // Complexity: linear O(N)
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);

    }

    public static void task6() {
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a, n));

    }
//    Task 7:

    public static void peremut(String p, String s){ // Complexity: factorial 0(N!)
        if (s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);

        for(int i = 0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String g = p.substring(i, p.length());
            peremut(f+ch+g, s.substring(1));
        }
    }

    public static void task7(){
        String s = sc.nextLine();
        peremut("", s);
    }


//    Task 8 :
    public static boolean IsDigit(String s) {// Complexity: linear O(N)
        if (s.isEmpty()) {
            return true;
        }
        char firstlet = s.charAt(0);

        if (!Character.isDigit(firstlet)) {
            return false;

        }
        return IsDigit(s.substring(1));

    }

    public static void task8() {
//        String s = sc.nextLine();
        String s = "133fs2";
        System.out.println(IsDigit(s) ? "Yes" : "No");

    }


//    Task 9:

    public static int findC(int n, int k) {//Complexity: exponential 0(N^2)
        if (k == 0 || k == n) {
            return 1;
        }

        return findC(n - 1, k - 1) + findC(n - 1, k);

    }

    public static void task9() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findC(n, k));
    }

// Task 10: You are given “a” and “b”, write the function for finding
//GCD(a, b) using recursion. (Hint: Euclidean Algorithm)

    public static int GCD(int a, int b){// Complexity: logarithmic 0(log(min(a,b))
        if (a%b == 0){
            return b;
        }
        int temp = b;
        b  = a%b;
        a = temp;
        return GCD(a, b);

    }

    public static void task10(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
    }

    public static void main(String[] args) {

    }


}