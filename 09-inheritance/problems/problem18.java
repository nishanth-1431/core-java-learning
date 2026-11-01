/* 18. Streaming Platform
   Topics Used: Hierarchical Inheritance

   Parent Class: Content
   Child Classes: Movie, WebSeries, Documentary
*/

class Content {
    String title;
    String language;
    int duration;

    void displayContent() {
        System.out.println("Title     : " + title);
        System.out.println("Language  : " + language);
        System.out.println("Duration  : " + duration + " mins");
    }
}

class Movie extends Content {
    String director;

    void playTrailer() {
        System.out.println("Playing Movie Trailer...");
    }
}

class WebSeries extends Content {
    int seasons;

    void watchEpisode() {
        System.out.println("Playing Episode 1...");
    }
}

class Documentary extends Content {
    String topic;

    void showFacts() {
        System.out.println("Displaying Educational Facts...");
    }
}

public class problem18 {
    public static void main(String[] args) {

        Movie m = new Movie();
        m.title = "Leo";
        m.language = "Tamil";
        m.duration = 165;
        m.director = "Lokesh Kanagaraj";

        WebSeries ws = new WebSeries();
        ws.title = "Stranger Things";
        ws.language = "English";
        ws.duration = 50;
        ws.seasons = 4;

        Documentary d = new Documentary();
        d.title = "Planet Earth";
        d.language = "English";
        d.duration = 60;
        d.topic = "Wildlife";

        System.out.println("===== Movie =====");
        m.displayContent();
        System.out.println("Director : " + m.director);
        m.playTrailer();

        System.out.println("\n===== Web Series =====");
        ws.displayContent();
        System.out.println("Seasons  : " + ws.seasons);
        ws.watchEpisode();

        System.out.println("\n===== Documentary =====");
        d.displayContent();
        System.out.println("Topic    : " + d.topic);
        d.showFacts();
    }
}