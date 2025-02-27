public class VariableScope {
    static int globalCount = 100;
public class VariableScope {
    //... (globalCount variable)...
    public static void main(String[] args) {
public class VariableScope {
    //... (globalCount variable)...
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount);
    }
}
public class VariableScope {
    //... (main method)...
    public static void showScope() {

    }
}
public class VariableScope {
    //... (main method)...
    public static void showScope() {
        int localCount = 50;
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
public class VariableScope {
    public static void main(String[] args) {
        //... (other code in main)...
        showScope();
    }
    //... (showScope method)...
}

    }
}
}