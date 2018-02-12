package main.java.ksu_is.littleauthor;

import javax.sound.sampled.Clip;


/**
 * Created by nora on 2/10/2018 AD.
 */

public class Sound extends Item {
    //________________________________________________________

    private String sound_category;
    private Clip sound_file; //make sure (dff from dstabase type)

    //________________________________________________________
    public Sound(String item_id, String name, String sound_category, Clip sound_file){

        super(item_id, name);
        this.sound_category = sound_category;
        this.sound_file = sound_file;
    }

    //________________________________________________________

    public void recordSound(){

    }
    //________________________________________________________
    public String getSound_category() {
        return sound_category;
    }
    //________________________________________________________

    public void setSound_category(String sound_category) {
        this.sound_category = sound_category;
    }
    //________________________________________________________
    public Clip getSound_file() {
        return sound_file;
    }
    //________________________________________________________
    public void setSound_file(Clip sound_file) {
        this.sound_file = sound_file;
    }
}
