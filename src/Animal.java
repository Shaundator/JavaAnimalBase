public class Animal {
    private String name;
    private String desc;
    private String type;
    private int age;

    public Animal(String name, String desc, String type, int age) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " the " + desc + " " + type + ", age " + age;
    }



}
