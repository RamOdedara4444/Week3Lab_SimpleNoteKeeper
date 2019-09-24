/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 798125
 */
public class NoteBean {
    
    String title;
    String content;

    public NoteBean(String title, String content) {
        this.title = title;
        this.content = content;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    
    
    
}
