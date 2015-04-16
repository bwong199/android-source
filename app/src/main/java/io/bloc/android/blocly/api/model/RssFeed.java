package io.bloc.android.blocly.api.model;

/**
<<<<<<< HEAD
 * Created by benwong on 2015-04-13.
 */
public class RssFeed
{
=======
 * Created by benwong on 2015-04-14.
 */
public class RssFeed {
>>>>>>> checkpoint-35-assignment
    private String title;
    private String description;
    private String siteUrl;
    private String feedUrl;

<<<<<<< HEAD
    public RssFeed(String siteUrl, String description, String feedUrl, String title) {
        this.siteUrl = siteUrl;
        this.description = description;
        this.feedUrl = feedUrl;
        this.title = title;
=======
    public RssFeed(String title, String description, String siteUrl, String feedUrl) {
        this.title = title;
        this.description = description;
        this.siteUrl = siteUrl;
        this.feedUrl = feedUrl;
>>>>>>> checkpoint-35-assignment
    }

    public String getTitle() {
        return title;
    }

<<<<<<< HEAD
    public String getFeedUrl() {
        return feedUrl;
=======
    public String getDescription() {
        return description;
>>>>>>> checkpoint-35-assignment
    }

    public String getSiteUrl() {
        return siteUrl;
    }

<<<<<<< HEAD
    public String getDescription() {
        return description;
=======
    public String getFeedUrl() {
        return feedUrl;
>>>>>>> checkpoint-35-assignment
    }
}
