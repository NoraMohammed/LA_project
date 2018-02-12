package main.java.ksu_is.littleauthor;

import java.util.ArrayList;

/**
 * Created by nora on 2/10/2018 AD.
 */

public class Library {

    //________________________________________________________

    private int library_ID;
    private Image pic;   // -- we need to check the attribute type: image
    private String name;
   // Child child_Library;
    //ArrayList <Story> storyList_Library = new ArrayList<Story>();

    //________________________________________________________

    public void setLibrary_ID(int library_ID) {this.library_ID = library_ID;}
    //________________________________________________________
    public void setName(String name) {this.name = name;}
    //________________________________________________________

    public int getLibrary_ID() {return library_ID;}
    //________________________________________________________
    public String getName() {return name;}



}
