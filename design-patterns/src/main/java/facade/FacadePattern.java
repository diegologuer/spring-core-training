package facade;

// TODO implement facade pattern
// create an interface HomeTheater and implement two methods:
// playMovie(Cassette cassette) & Cassette stopMovie(), using all

import facade.components.*;

public class FacadePattern {
    public static void main(String[] args) {

        //Instance the components for the HomeTheater
        TV tv = new SamsungTV();
        AudioSpeakers audioSpeakers = new BosseAudioSpeakers();
        VHSPlayer vhsPlayer = new SonyVHSPlayer();

        //Instance the cassette
        Cassette lionKingMovie = new Cassette("The Lion King");

        //Instance the HomeTheater
        HomeTheater homeTheater = new SonosHomeTheater(audioSpeakers,tv,vhsPlayer);

        //Try the methods
        homeTheater.playMovie(lionKingMovie);
        lionKingMovie = homeTheater.stopMovie();
    }
}
