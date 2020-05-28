package class8_Static;

public class StaticKeyword {

    public static void main(String[] args) {

        StaticKeywordClass s1 = new StaticKeywordClass();
        s1.createProfile("one", 10);

        StaticKeywordClass s2 = new StaticKeywordClass();
        s2.createProfile("two", 20);

        StaticKeywordClass s3 = new StaticKeywordClass();


        StaticKeywordClass.myStaticMethod();
        int number = StaticKeywordClass.myStaticReturnMethod();
        System.out.println(number);


        System.out.println(s3.showName());  //Default
        System.out.println(s1.showNumValue()); // 20

        System.out.println(s2.showName());  //two
        System.out.println(s2.showNumValue()); // 20

        System.out.println(s1.showName());  //one
        System.out.println(s1.showNumValue()); // 20

        StaticKeywordClass s4 = new StaticKeywordClass();
        System.out.println(s4.showNumValue());
    }
}