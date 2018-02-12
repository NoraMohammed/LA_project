package main.java.ksu_is.littleauthor;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Item  {

    //_______________________________________________________
    private String item_id;
    private String name;
    private Page page;
    //________________________________________________________
    public Item(String item_id, String name){

        this.item_id = item_id;
        this.name = name;
    }
    //________________________________________________________

    public String getItem_id() {
        return item_id;
    }
    //________________________________________________________
    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    //________________________________________________________
    public String getName() {
        return name;
    }
    //________________________________________________________
    public void setName(String name) {
        this.name = name;
    }

}
