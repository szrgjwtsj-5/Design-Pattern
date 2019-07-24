package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        commonBuilder();
    }

    private static void commonBuilder() {
        Person p = new Person.Builder()
                .setName("whx")
                .setSex("male")
                .setAge(18)
                .build();

        System.out.println(p);
    }

    private static void classicBuilder() {
        Director director = new Director();
        director.setBuilder(new LowConfigBuilder());
        director.createComputer();
        Computer computer = director.getComputer();

        System.out.println("电脑信息：" + computer);

        director.setBuilder(new HighConfigBuilder());
        director.createComputer();
        Computer computer1 = director.getComputer();
        System.out.println("电脑信息：" + computer1);
    }
}
