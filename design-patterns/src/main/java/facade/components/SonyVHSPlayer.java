package facade.components;

import javax.lang.model.util.ElementScanner6;
import java.util.EventListener;

public class SonyVHSPlayer implements VHSPlayer {

    private Cassette cassette;
    boolean isOn = false;
    boolean isPlaying = false;

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("VHS Player turned on");
        } else {
            System.out.println("VHS Player already on");
        }
    }

    @Override
    public void pushCassette(Cassette cassette) {
        if (isOn) {
            if (isPlaying) {
                System.out.println("Please stop the VHS and reject the existing cassette");
            } else if (this.cassette == null) {
                System.out.println("Pushing cassette into the VHS plater...");
                this.cassette = cassette;
                System.out.println("Cassette: " + cassette.movie() + " has been pushed into the VHS player");
            }
        } else {
            System.out.println("The cassette cannot be pushed if the VHS Player is off");
        }
    }

    @Override
    public void play() {
        if (isOn) {
            if (cassette != null) {
                if (isPlaying) {
                    System.out.println("VHS player already playing");
                } else {
                    isPlaying = true;
                    System.out.println("VHS Player playing");
                }
            } else {
                System.out.println("There is no cassette in the VHS player");
            }
        } else {
            System.out.println("Turn on the VHS player in order to play it");
        }

    }

    @Override
    public void stop() {
        if (isOn) {
            if (cassette != null) {
                if (isPlaying) {
                    System.out.println("VHS Player stopped");
                    isPlaying = false;
                } else {
                    System.out.println("VHS player already stopped");
                }
            } else {
                System.out.println("There must be a cassette inside of the VHS player in order to stop it");
            }
        } else {
            System.out.println("Turn on the VHS player in order to stop it");
        }

    }

    @Override
    public Cassette rejectCassette() {
        if (isOn) {
            if (cassette != null) {
                if (isPlaying) {
                    System.out.println("Please stop the VHS in order to reject it");
                    return null;
                } else {
                    Cassette cassette1 = cassette;
                    System.out.println("Rejecting cassette...");
                    cassette = null;
                    return cassette1;
                }
            } else {
                System.out.println("There is not a cassette in the VHS player");
                return null;
            }
        } else {
            System.out.println("Turn on the VHS Player in order to reject a cassette");
            return null;
        }

    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("VHS player is off");
        } else {
            System.out.println("VHS Player already off");
        }
    }
}
