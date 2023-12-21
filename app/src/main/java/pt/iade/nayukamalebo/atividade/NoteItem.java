package pt.iade.nayukamalebo.atividade;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class NoteItem {
    private final String id;
    private String title;
    private String content;
    private final Date creationDate;
    private Date modifiedDate;

    public NoteItem(String title, String content) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.creationDate = new Date();
        this.modifiedDate = new Date();
    }

    // Getters and setters for the fields

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.modifiedDate = new Date();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.modifiedDate = new Date();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
}


