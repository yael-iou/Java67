/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java67;

/**
 *
 * @author CompLabC209-PC38
 */
public class Java67 {

    public static void main(String[] args) {
        displayGreetings();
        displayInfo();
        
    }
    static void displayGreetings(){
        System.out.println("Welcome to Overwatch");
    }
    static void displayInfo(){
    displayCharacter();
    displayClass();
    
    }
    static void displayCharacter(){
        System.out.println("Ramattra");
        System.out.println("Originally made as a unit built for war now seeking peace as a monk. After witnessing human abuse, he believed that peace and being a pacifist wouldn't solve anything. Now turned into a general leading a liberation army for his kind.");
        System.out.println("Omnic - A robotic species that is slowly disappearing");
    }
    static void displayClass(){
        System.out.println("Leader/Brawler/Monk - A monk now turned into a general who fights for his species' survival");
        System.out.println("Bruiser - Has less knockback recieved");
        displaySkills();
    }
    static void displaySkills(){
        ravenousVortex();
        voidBarrier();
        nemesisForm();
        annihilation();
    }
    static void ravenousVortex(){
        System.out.println("Ravenous Vortex - Drags and slows opponents to the ground");
    }
    static void voidBarrier(){
        System.out.println("Void Barrier - Deploys a temporary barrier");
    }
    static void nemesisForm(){
        System.out.println("Nemesis Form - Transform and gain more health and gain new weapons");
    }
    static void annihilation(){
        System.out.println("Annihilation - Transform into nemesis form but now gains a deadly swarm around him");
    }
}
    
    


    
    

