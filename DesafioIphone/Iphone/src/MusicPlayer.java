public class MusicPlayer implements Playable {
@Override
public void play() {
    System.out.println("Playing music...");

}

@Override
public void pause() {
    System.out.println("Pausing music...");
}

@Override
public void selectMusic(String music) {
    System.out.println("Selecting music...");
}

}