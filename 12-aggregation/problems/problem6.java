/*6. YouTube-like Application — Channel & Video
A Channel contains videos.
•	Create Channel and Video. 
•	A video can exist independently. 
•	Add multiple videos to a channel. 
•	Display all videos. 
•	Remove a video from the channel without destroying the Video object. 
 */
class Video {

    String videoTitle;
    int views;

    void displayVideo() {
        System.out.println("Video: " + videoTitle);
        System.out.println("Views: " + views);
        System.out.println();
    }
}

class Channel {

    String channelName;
    Video[] videos; // Channel HAS-A Video

    void displayVideos() {

        System.out.println("Channel: " + channelName);
        System.out.println("Videos:");

        for (int i = 0; i < videos.length; i++) {

            if (videos[i] != null) {
                videos[i].displayVideo();
            }
        }
    }

    void removeVideo(int index) {
        videos[index] = null;
    }
}

public class problem6 {

    public static void main(String[] args) {

        // Videos exist independently
        Video video1 = new Video();
        video1.videoTitle = "Java Tutorial";
        video1.views = 1000;

        Video video2 = new Video();
        video2.videoTitle = "OOP in Java";
        video2.views = 2000;

        Video video3 = new Video();
        video3.videoTitle = "Aggregation in Java";
        video3.views = 1500;

        // Create Channel
        Channel channel = new Channel();

        channel.channelName = "Java Learning";

        // Aggregation
        channel.videos = new Video[3];

        channel.videos[0] = video1;
        channel.videos[1] = video2;
        channel.videos[2] = video3;

        // Display all videos
        channel.displayVideos();

        // Remove video2 from the Channel
        channel.removeVideo(1);

        System.out.println("After removing OOP in Java:");
        channel.displayVideos();

        // video2 still exists independently
        System.out.println("Removed video still exists:");
        video2.displayVideo();
    }
}
