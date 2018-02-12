package main.java.ksu_is.littleauthor;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Page {

    //________________________________________________________
    private int page_ID;
    private int page_no;
    Child child_Page;
    Story story_Page;
    //ArrayList <Item> itemList_Page = new ArrayList <Item>();   -- we need to add class "Item" (Nora)

    public void addItem(Item item) {}
    //________________________________________________________
    public void moveItem(Item item) {}
    //________________________________________________________
    public void deleteItem(Item item) {}
    //________________________________________________________
    public void setPage_ID(int page_ID) {this.page_ID = page_ID;}
    //________________________________________________________
    public void setPage_no(int page_no) {this.page_no = page_no;}
    //________________________________________________________
    public int getPage_ID() {return page_ID;}
    //________________________________________________________
    public int getPage_no() {return page_no;}


}
