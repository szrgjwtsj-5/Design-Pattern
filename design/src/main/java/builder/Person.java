package builder;

/**
 * 比较常见的Builder 模式，主要用于构造一个不可变对象
 */
public class Person {
    private final String name;
    private final String sex;
    private final int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String name;
        private String sex;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
