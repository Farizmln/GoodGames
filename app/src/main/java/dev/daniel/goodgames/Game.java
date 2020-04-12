package dev.daniel.goodgames;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable{

    private String title;
    private String release;
    private String developer;
    private String publisher;
    private String genre;
    private String description;
    private int image;
    private int[] screenshot;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String link;

    public int[] getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(int[] screenshot) {
        this.screenshot = screenshot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getYearRelease() {
        String year;
        if (release.length() > 4) {
            year = release.substring(release.length() - 4);
        } else {
            year = release;
        }
        return year;
    }
}
