public interface Singer {
    AudioClip sing(Song s);
}

public interface Songwriter {
    Song compose(int chartPosition);
}



public interface SingerSongwriter extends Singer, SongWriter {
    AudoClip strum();
    void actSensitive();
}
