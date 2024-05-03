package Week2;

public class JavaArgument {
    public static void main(String[] args) {
        if (args.length <2){
            System.out.println("Not enough args");
            return;
        }
        System.out.println("first arg is " + args[0]);
        System.out.println("Second arg is " +args[1]);
    }
    
}
