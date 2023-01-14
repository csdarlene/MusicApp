package designPatterns.patternBehavioral.ChainOfResponsibility;

import java.util.Scanner;

public class MainBehavioral {

    public static void main( String[] args ) {
        try {
                final String artist;
                final String song;
                Scanner scanner1;
                Scanner scanner2;

                Handler handler = new UserExistHandler();
                handler.setNextHandler(new ArtistExistHandler()).setNextHandler(new RecordLabelExistHandler());

                ServiceBehavioral service = new ServiceBehavioral(handler);
                System.out.println("======================================================================================");

                System.out.println("Please enter song name:");
                scanner1 = new Scanner(System.in);
                song = scanner1.nextLine();

                System.out.println("Please enter artist name:");
                scanner2 = new Scanner(System.in);
                artist = scanner2.nextLine();

                System.out.println(service.SongArtist(artist, song));

//        System.out.println(service.SongArtist("Post Malone","I Like You (A Happier Song)"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


