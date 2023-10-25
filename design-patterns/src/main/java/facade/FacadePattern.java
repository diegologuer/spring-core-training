package facade;

// TODO implement facade pattern
// create an interface HomeTheater and implement two methods:
// playMovie(Cassette cassette) & Cassette stopMovie(), using all

import facade.components.*;

public class FacadePattern {
    public static void main(String[] args) {

        TV tv = new SamsungTV();
        AudioSpeakers audioSpeakers = new BosseAudioSpeakers();
        VHSPlayer vhsPlayer = new SonyVHSPlayer();
        Cassette lionKingMovie = new Cassette("The Lion King");

        HomeTheater homeTheater = new SonosHomeTheater(audioSpeakers,tv,vhsPlayer);
        homeTheater.playMovie(lionKingMovie);
        lionKingMovie = homeTheater.stopMovie();
    }
}
