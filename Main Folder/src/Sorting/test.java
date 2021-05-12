package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        RedditPost post1 = new RedditPost("Fun at home", "www.HomeNews.org", 23);
        RedditPost post2 = new RedditPost("Fun at the Park", "www.ParkNews.org", 12);
        RedditPost post3 = new RedditPost("Fun at the office", "www.OfficeNews.org", 30);
        RedditPost post4 = new RedditPost("Fun at Beach", "www.BeachNews.org", 27);

        ArrayList <RedditPost> frontPage = new ArrayList<>(Arrays.asList(post1,post2,post3,post4));

        System.out.println(frontPage);

        Collections.sort(frontPage);

        Collections.reverse(frontPage);

        System.out.println(frontPage);

        System.out.println(post1.compareTo(post2));
    }
}
