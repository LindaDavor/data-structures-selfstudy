package VariousStructures;

    public class Methods {
        static void myMethod(String fname, int age) {
            System.out.println(fname + " Doe is " + age + " years old" );
        }

        static int sum(int z) {
            return 5 + z;
        }

        static void checkAge(int age) {
            String result = (age >= 18) ? "Access Granted" : "Access Denied";
            System.out.println(result);
//            if (age < 18) {
//                System.out.println("Access Denied");
//            } else {
//                System.out.println("Access Granted");
           // }
            //String result = (v==18)? "Am here" : "Please leave";
        }

        public static class Sum {
            int x = 10;
        }

        public static void main(String[] args) {
            myMethod("John", 14);
            myMethod("Linda", 11);
            myMethod("Ama", 22);

            System.out.println(sum(3));
            checkAge(14);

            Sum obj = new Sum();
            System.out.println(obj.x);
        }
    }

