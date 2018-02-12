package main.java.ksu_is.littleauthor;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Child  {

    //________________________________________________________

    private int child_ID;
  //  ArrayList <Library> libraryList_Child = new ArrayList<Library>();
  //  ArrayList <Story> storyList_Child  = new ArrayList<Story>();
  //  ArrayList <Page> pageList_Child  = new ArrayList<Page>();
    //ArrayList <Item> itemList_Child  = new ArrayList<Item>();

    public void createLibrary(String name, Image pic) {}   // we need to check the attribute type: image

    //________________________________________________________

    public void editLibrary(String name, Image pic) {}

    //________________________________________________________

    public void editLibrary(String name) {}

    //________________________________________________________

    public void editLibrary(Image pic) {}

    //________________________________________________________

    public void deleteLibrary(String name) {}

    //________________________________________________________

    public void readStory(String name) {}

    //________________________________________________________

    public void createStory(String name){}

    //________________________________________________________

    public void editStory(String name, String libraryName) {}

    //________________________________________________________

    //public void editStory(String name) {}   --the same method name with same parameter!!
    //public void editStory(String libraryName) {}

    //________________________________________________________

    public void deleteStory(String name) {}

    //________________________________________________________

    public Image takePhoto() { return null;}   //  - we need to check the attribute type: image

    //________________________________________________________

    public void deletePhoto(Image photo) {}   // - we need to check the attribute type: image

    //________________________________________________________

    //setter
    public void setChild_ID(int child_ID) {this.child_ID = child_ID;}

    //getter
    public int getChild_ID() {return child_ID;}







}
