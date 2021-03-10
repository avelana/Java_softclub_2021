package by.softclub.argDemo;

public class Main {
    public static void main(String[] args) {
        int i = 128; // заменить на 127 !!!
        Integer a = i; // создание объекта+упаковка
        Integer b = i;
        System.out.println("a==i " + (a == i)); // true – распаковка и сравнение значений
        System.out.println("b==i " + (b == i)); // true
        System.out.println("a==b " + (a == b)); /* false(ссылки на разные объекты) */
        System.out.println("equals ->" + a.equals(i)
                + b.equals(i)
                + a.equals(b)); // true, true, true
        int s;
        int j;
        for (s=0, j = 1; j<=10; ++i){
            s+=i;
        }



//        for (String item : args) {
//            System.out.printf("Aргумент-> %s%n", item);
//        }
//        System.out.println("test():");
//        test(3);
//
//        System.out.println("test(\"tree\"):");
//        test(4,"tree");
//
//        System.out.println("test(\"dog\", \"cat\", \"pigeon\"):");
//        test(5,"dog", "cat", "pigeon");
    }

    public static void test(int a,String... args){

        Integer aa = new Integer(a);

        System.out.println("Class aa is " + "TEST_STRING".getClass());

        System.out.println("a = " + a);
        if(args.length > 0){
           for (int i = 0; i < args.length; i++){
               System.out.println("it is the arg from the test method:" + args[i]);
            }
        }else{
            System.out.println("No args defined.");
        }
    }
}