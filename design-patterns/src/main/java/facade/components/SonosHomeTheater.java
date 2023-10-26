package facade.components;

public class SonosHomeTheater implements HomeTheater {
    AudioSpeakers audioSpeakers;
    TV tv;
    VHSPlayer vhsPlayer;

    public SonosHomeTheater(AudioSpeakers audioSpeakers, TV tv, VHSPlayer vhsPlayer) {
        this.audioSpeakers = audioSpeakers;
        this.tv = tv;
        this.vhsPlayer = vhsPlayer;
    }

    @Override
    public void playMovie(Cassette cassette) {
        System.out.println("Preparing to play the movie...");
        audioSpeakers.turnOn();
        vhsPlayer.turnOn();
        tv.turnOn();
        audioSpeakers.connectToTv(tv);
        tv.setChannel();
        vhsPlayer.pushCassette(cassette);
        vhsPlayer.play();
        System.out.println("Enjoy the movie");
    }

    @Override
    public Cassette stopMovie() {
        System.out.println("Preparing to stop the movie");
        vhsPlayer.stop();
        Cassette cassette = vhsPlayer.rejectCassette();
        vhsPlayer.turnOff();
        audioSpeakers.turnOff();
        tv.turnOff();
        System.out.println("Movie stopped, pelase take the cassette");
        return cassette;
    }
}
