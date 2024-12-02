package basicPrograms;

/**
 * Immutable class: should have class name as final, all fields in private and final ,create constructor, create getter, no setter.
 * Once the object here created is Cannot be changed.
 **/

public final class ImmutableClass {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){

        ImmutableClass obj = new ImmutableClass("Lt.Praveen",26);
        System.out.println(obj.name+" "+obj.age);

        // The object state cannot be modified after creation
        // obj.setName("Praveen"); // This is not possible
    }

}
