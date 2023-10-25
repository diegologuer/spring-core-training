package facade.components;

public class SamsungTV implements TV {
    boolean isOn = false;

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV turned on");
        } else {
            System.out.println("TV already on");
        }
    }

    @Override
    public void setChannel() {
        if (isOn) {
            System.out.println("Channel set on TV");
        } else {
            System.out.println("Turn on the TV in order to set a channel");
        }
    }

    @Override
    public void setSound() {
        if (isOn) {
            System.out.println("Sound set on TV");
        } else {
            System.out.println("Turn on the TV in order to set the sound");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV turned off");
        } else {
            System.out.println("TV already off");
        }
    }
}
