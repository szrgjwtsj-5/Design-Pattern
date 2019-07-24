package builder;

public class HighConfigBuilder implements ComputerConfigBuilder {
    private Computer mComputer;

    public HighConfigBuilder() {
        this.mComputer = new Computer();
    }

    @Override
    public void setCPU() {
        mComputer.setCPU("i7");
    }

    @Override
    public void setHardDisk() {
        mComputer.setHardDisk("1T");
    }

    @Override
    public void setKeyboard() {
        mComputer.setKeyboard("机械键盘");
    }

    @Override
    public void setMemory() {
        mComputer.setMemory("16G");
    }

    @Override
    public void setMouse() {
        mComputer.setMouse("无线鼠标");
    }

    @Override
    public Computer getComputer() {
        return mComputer;
    }
}
