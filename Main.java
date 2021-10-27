public class Main {

    String name;
    int age;

    public static void main(String[] args) {

        Main a = new Main();

        a.setName("Ryan");
        a.setAge(27);
        System.out.println(a.getName());
        System.out.println(a.getAge());

        a.printDetails();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printDetails() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }
}
