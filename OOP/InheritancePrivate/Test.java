package JavaLearning.OOP.InheritancePrivate;

public class Test {
    public Test() {
    }

    static void main() {
        Parent p = new Parent();
        Child c = new Child();
        p.callParent();
        c.showChild();
        c.callParent();
        //c.showParent(); error because showParent is private in Parent class
    }
}