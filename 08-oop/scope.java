/* Local Scope and Global Scope :
   Local Variable → Inside method 
   Global Variable → Inside class (outside method) */
public class scope {
       int global = 100;    // global scope
        void show() {
            int local = 50; // local scope
            System.out.println(local);
            System.out.println(global);
          }
          System.out.println(local); //causes error cause local can only used inside the method
}
