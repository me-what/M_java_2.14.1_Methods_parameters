public class Main {
    public static void main(String[] args) {
        // 1
        int a = 6;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5, 23);
        System.out.println("\n");

        // 2
        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);
        System.out.println("");

        // 3
        sum2(1, 2, 3);
        sum2(1, 2, 3, 4, 5);
        sum2();
        System.out.println("\n");

        // 4
        sum3("Welcome!", 20,10);
        sum3("Hello World!");
    }


    // 1
    static void sum(int x, int y){
        int z = x + y;
        System.out.print(z + ", ");
    }


    // 2
    static void display(String name, int age){
        System.out.print(name + " ");
        System.out.print(age + "\n");
    }

    // 3
    static void sum2(int ...nums){

        int result =0;
        for(int n: nums)
            result += n;
        System.out.print(result + " ");
    }

    // 4
    static void sum3(String message, int ...nums){
        System.out.print(message + " ");
        int result =0;
        for(int x:nums)
            result+=x;
        System.out.print(result + " \n");
    }
}