package facade.components;

public class BosseAudioSpeakers implements AudioSpeakers {

    boolean isOn;
    TV tv;

    @Override
    public void turnOn() {
        if (!isOn) {
            System.out.println("Audio Speakers On");
            isOn = true;
        } else {
            System.out.println("Audio speaker already on");
        }
    }

    @Override
    public void connectToTv(TV tv) {
        if (isOn) {
            this.tv = tv;
            System.out.println("Audio Speakers connected to TV");
        } else {
            System.out.println("Turn on the Audio speakers in order to connect a TV");
        }
    }

    @Override
    public void disconnectFromTv() {
        if (isOn) {
            this.tv = null;
            System.out.println("Audio Speakers disconnected from TV");
        }
        //I assumed that if speakers were off, the TV was disconnected
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            tv = null;
            System.out.println("Audio Speakers turned Off");
        } else {
            System.out.println("Audio speakers already off");
        }
    }
}
