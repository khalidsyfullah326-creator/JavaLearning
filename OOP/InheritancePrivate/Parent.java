package JavaLearning.OOP.InheritancePrivate;

    class Parent {
    Parent() {
    }

    private void showParent() {
        System.out.println("This is a parent class");
    }

    void callParent() {
        this.showParent();
    }
}
