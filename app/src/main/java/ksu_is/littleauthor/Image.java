package main.java.ksu_is.littleauthor;

import javax.swing.text.Position;


/**
 * Created by nora on 2/10/2018 AD.
 */

public class Image extends Item {

    //________________________________________________________

    private Image image_file;
    private double length;
    private double width;
    private Position position;

    //________________________________________________________

    public Image(String item_id, String name, Image image_file, double length, double width, Position position){

        super(item_id, name);
        this.image_file = image_file;
        this.length = length;
        this.width = width;
        this.position = position;
    }
    //________________________________________________________

    public Image getImage_file() {
        return image_file;
    }
    //________________________________________________________

    public void setImage_file(Image image_file) {
        this.image_file = image_file;
    }
    //________________________________________________________

    public double getLength() {
        return length;
    }
    //________________________________________________________

    public void setLength(double length) {
        this.length = length;
    }
    //________________________________________________________


    public double getWidth() {
        return width;
    }
    //________________________________________________________

    public void setWidth(double width) {
        this.width = width;
    }
    //________________________________________________________

    public Position getPosition() {
        return position;
    }
    //________________________________________________________

    public void setPosition(Position position) {
        this.position = position;
    }
}
