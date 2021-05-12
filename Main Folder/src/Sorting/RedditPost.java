package Sorting;

public class RedditPost implements Comparable <RedditPost>{
    private String title;
    private String content;
    private int upvotes;

    public RedditPost(String title, String content, int upvotes){
        this.title = title;
        this.content = content;
        this.upvotes = upvotes;

    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "RedditPost{" +
                ", upvotes= " + upvotes +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public int compareTo(RedditPost other){
        if(this.upvotes > other.getUpvotes()){
            return 1;
        }
        else if (this.upvotes < other.getUpvotes()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
