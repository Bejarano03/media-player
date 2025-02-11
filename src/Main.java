/**
 * This program implements an interface
 * and creates three different players.
 * Each returning an aspect of a method created
 * in the interface
 *
 * @author Marco Bejarano Oseguera
 * @version 02/11/2025
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to my media players program: ");
        System.out.println();

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();
        System.out.println();

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
        System.out.println();

        StreamingPlayer streamingPlayer = new StreamingPlayer();
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
