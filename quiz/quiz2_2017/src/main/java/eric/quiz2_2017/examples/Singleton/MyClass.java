package eric.quiz2_2017.examples.Singleton;

public class MyClass {
     public static void main (String[] args) {
         System.out.println("In main,");
         Singleton S = Singleton.getInstance();
         S.showMessage();
     }
}

