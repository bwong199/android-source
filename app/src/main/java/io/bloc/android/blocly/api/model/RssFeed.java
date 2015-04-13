package io.bloc.android.blocly.api.model;

/**
 * Created by benwong on 2015-04-13.
 */
public class RssFeed
{
    private String title;
    private String description;
    private String siteUrl;
    private String feedUrl;

    public RssFeed(String siteUrl, String description, String feedUrl, String title) {
        this.siteUrl = siteUrl;
        this.description = description;
        this.feedUrl = feedUrl;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public String getDescription() {
        return description;
    }
}
