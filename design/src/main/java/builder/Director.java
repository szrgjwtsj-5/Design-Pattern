package builder;

public class Director {
    private ComputerConfigBuilder mBuilder;

    public void setBuilder(ComputerConfigBuilder builder) {
        this.mBuilder = builder;
    }

    public void createComputer() {
        mBuilder.setCPU();
        mBuilder.setMemory();
        mBuilder.setHardDisk();
        mBuilder.setKeyboard();
        mBuilder.setMouse();
    }

    public Computer getComputer() {
        return mBuilder.getComputer();
    }
}
