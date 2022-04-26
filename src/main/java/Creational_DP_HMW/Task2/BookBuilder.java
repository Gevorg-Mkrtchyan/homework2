package Creational_DP_HMW.Task2;

public class BookBuilder {
    private String title;
    private String genre;
    private String author;
    private String publishingYear;
    private String description;


    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }
    public BookBuilder setGenre(String genre){
        this.genre = genre;
        return this;
    }
    public BookBuilder setAuthor(String author){
        this.author = author;
        return this;
    }
    public BookBuilder setPublishingYear(String publishingYear){
        this.publishingYear = publishingYear;
        return this;
    }
    public BookBuilder setDescription(String description){
        this.description = description;
        return this;
    }
    public Book build(){
        return new Book(title,genre,author,publishingYear,description);
    }

    @Override
    public String toString() {
        return "BookBuilder{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
