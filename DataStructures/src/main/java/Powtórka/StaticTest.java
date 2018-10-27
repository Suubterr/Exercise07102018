package Powtórka;

public class StaticTest {

    public static Integer getVALUE() {
        return VALUE;
    }

    public static void setVALUE(Integer VALUE) {
        StaticTest.VALUE = VALUE;
    }

    public static Integer VALUE = 5;

    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void test() {
        System.out.println("Test");
    }

    public static void testStatic() {
        System.out.println("Static test");
    }
}
