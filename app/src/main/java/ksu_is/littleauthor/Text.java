package main.java.ksu_is.littleauthor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.text.Position;




/**
 * Created by nora on 2/10/2018 AD.
 */

public class Text extends Item {

    //________________________________________________________
    private double text_size;//
    private Position position;//
    private Color text_color;//
    private Font text_font;//
    private Text text_file;//

    //________________________________________________________
    public Text(String item_id, String name, double text_size, Position position, Color text_color, Font text_font, Text text_file){

        super(item_id, name);
        this.text_size = text_size;
        this.position = position;
        this.text_color = text_color;
        this.text_font = text_font;
        this.text_file = text_file;
    }

    //________________________________________________________
    public void changeTextColor(){
//body
    }

    //________________________________________________________
    public Color getText_color() {
        return text_color;
    }
    //________________________________________________________
    public void setText_color(Color text_color) {
        this.text_color = text_color;
    }
    //________________________________________________________

    public double getText_size() {
        return text_size;
    }
    //________________________________________________________
    public void setText_size(double text_size) {
        this.text_size = text_size;
    }

    //________________________________________________________
    public Position getPosition() {
        return position;
    }
    //________________________________________________________
    public void setPosition(Position position) {
        this.position = position;
    }

    //________________________________________________________
    public Font getText_font() {
        return text_font;
    }
    //________________________________________________________
    public void setText_font(Font text_font) {
        this.text_font = text_font;
    }
    //________________________________________________________

    public Text getText_file() {
        return text_file;
    }
    //________________________________________________________
    public void setText_file(Text text_file) {
        this.text_file = text_file;
    }
}
