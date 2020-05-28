package class8_Static;

public class StaticKeywordClass
     {

        private static int num; //for s1-10 | for s2-20 | for s3-20
        private String name = "Default";    //for s1-one | for s2-two | for s3-Default

        public int showNumValue() {
            return num;
        }

        public void createProfile(String username, int age) {
            name = username;
            num = age;
        }

        public String showName() {
            sayHelloPrivately();
            return name;
        }

        public static void myStaticMethod() {
            System.out.println("Inside the static method");
        }

        public static int myStaticReturnMethod() {
            System.out.println("Inside the static return method");
            return 10;
        }

        protected void sayHello() {
            System.out.println("Hello");
        }

        private void sayHelloPrivately() {
            System.out.println("Hello in private");
        }

}
