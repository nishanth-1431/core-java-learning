/*
Access Modifiers in Java :

public    - Accessible from anywhere.
protected - Accessible within the same package and by subclasses.
default   - Accessible only within the same package.
private   - Accessible only within the same class.
*/

public class AccessModifiers {

    public String publicVar = "Public";
    protected String protectedVar = "Protected";
    String defaultVar = "Default"; // No modifier = default
    private String privateVar = "Private";

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        // Accessible because we are inside the same class
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.privateVar);

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }
}

