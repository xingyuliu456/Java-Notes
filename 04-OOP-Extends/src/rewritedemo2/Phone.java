package rewritedemo2;

public class Phone extends SmartDevice {
    @Override
    public double payment() {
        return super.payment() * 0.9;
    }
}
