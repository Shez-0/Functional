public class Person {
    private String first;
    private String last;
    private int age;

    @Override
    public String toString() {
        return "Name: " + first + " " + last + ", Age: " + age;
    }

    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAge() {
        return age;
    }
}
