package builder;

import model.BoardDTO;
import model.SubjectDTO;

public class BoardBuilder {
    private String title;
    private String content;
    private String writer;

    public BoardBuilder title(String  title){
        this.title = title;
        return this;
    }
    public BoardBuilder content(String  content){
        this.content = content;
        return this;
    }
    public BoardBuilder writer(String  writer){
        this.writer = writer;
        return this;
    }
    public BoardDTO build(){
        return new BoardDTO(title, content, writer);
    }
}
