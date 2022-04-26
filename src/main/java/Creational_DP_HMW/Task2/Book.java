package Creational_DP_HMW.Task2;

/**
 * Task 2
 * Write an immutable Book class with the following fields:
 * Code : String
 * Title
 * Genre
 * Author
 * Publishing year
 * Description
 * Write Book builder following builder design pattern
 */
public final class Book {
    private final String title;
    private final String genre;
    private final String author;
    private final String publishingYear;
    private final String description;

    public Book(String title, String genre, String author, String publishingYear, String description) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
