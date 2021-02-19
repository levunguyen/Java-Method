package _10_method;

public class MyMethod {
//    accessModifier static/nonStatic returnType methodName(list of parameters)	{
//        //Method	body;
//    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static void myMethod(){
        System.out.println("I just got executed.");
    }


    public static void main(String[] args) {
        System.out.println(sum(6,9));
        myMethod();
        myMethod();
        myMethod();
    }
}
