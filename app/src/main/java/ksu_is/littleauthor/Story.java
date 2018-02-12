package main.java.ksu_is.littleauthor;

import java.util.ArrayList;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Story {

    //________________________________________________________
    private int story_ID;
    private String name;
    private String type;
    Child child_Story;
    Library library_Story;
 //   ArrayList <Page> pageList_Story = new ArrayList<Page>();
 //________________________________________________________
    public void addPage() {}
    public void deletePage(int pageNo) {}
    public void editPage(int pageNo) {}
    public void createCover() {}
    //________________________________________________________
    //setters
    public void setStory_ID(int story_ID) {this.story_ID = story_ID;}
    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}
    //getters
    public int getStory_ID() {return story_ID;}
    public String getName() {return name;}
    public String getType() {return type;}

    //________________________________________________________
    public Child getChild_Story() {
        return child_Story;
    }
    //________________________________________________________
    public void setChild_Story(Child child_Story) {
        this.child_Story = child_Story;
    }
    //________________________________________________________
    public Library getLibrary_Story() {
        return library_Story;
    }
    //________________________________________________________
    public void setLibrary_Story(Library library_Story) {
        this.library_Story = library_Story;
    }

    /*________________________________________________________
    public ArrayList<Page> getPageList_Story() {
        return pageList_Story;
    }
    //________________________________________________________
    public void setPageList_Story(ArrayList<Page> pageList_Story) {
        this.pageList_Story = pageList_Story;
    }*/
}
