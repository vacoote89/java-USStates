/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usstates;



/**
 *
 * This class stores the data read from the file
 * 
 * @author Vanessa Coote
 */
public class States  {
    
    private String name;
    private String bird;
    private String flower;
    private String nickname;
    private String capital;

    //default constructor
    public States() {
        this.name = "";
        this.bird = "";
        this.flower = "";
        this.nickname = "";
        this.capital = "";
    }

    /**
     * Overloaded constructor
     * 
     * @param name
     * @param bird
     * @param flower
     * @param nickname
     * @param capital
     */
    public States(String name, String bird, String flower, String nickname, String capital) {
        this.name = name;
        this.bird = bird;
        this.flower = flower;
        this.nickname = nickname;
        this.capital = capital;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

   
    
    
    
}
