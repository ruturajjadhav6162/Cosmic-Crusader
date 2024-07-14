package inputs;

import Entities.Fireball;
import Entities.Herolvl1;
import gamestates.GameState;
import main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import  static utilz.HelpMethods.CanMoveHere;

public class keyboardinputs implements KeyListener {
private boolean isDpressed=false;
private boolean isApressed=false;
private boolean isGpressed=false;
private boolean right;

private GamePanel gamePanel;
//private Graphics g1;
public keyboardinputs(GamePanel gamePanel) //Gives gamepanel access to keyboard inputs
{
    this.gamePanel=gamePanel;
}
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (GameState.state){
            case MENU -> {
                gamePanel.getGame().getMenu().keyPressed(e);
            }
            case PLAYING -> {
                gamePanel.getGame().getPlaying().keyPressed(e);

            }
            default -> {
            }
        }
//        switch (e.getKeyCode())
//        {
//            case KeyEvent.VK_G:
//                isGpressed=true;
//                gamePanel.getGame().getHero1().setFiring(true);
//                break;
//            case KeyEvent.VK_W:
//                gamePanel.getGame().getHero1().changedy(-10);  // gamePanel.game.hero1.changedy();
//                break;
//            case KeyEvent.VK_A:
//                isApressed=true;
//                //System.out.println("A");
//                if(e.isShiftDown())
//                {   gamePanel.getGame().getHero1().walkL(1);
//                    gamePanel.getGame().getHero1().setLeft(true,false);
//                   // gamePanel.changedx(-8);
////                    if(isDpressed){
////                        gamePanel.getGame().getHero1().setRight(true,true);
////
////                    }
//
//                }
//                else if (isDpressed) {
//                    gamePanel.getGame().getHero1().setLeft(true,true);
//
//                }
//
//                else {
//                gamePanel.getGame().getHero1().runL(-2);
//                gamePanel.getGame().getHero1().setLeft(true,false);
//
//                }
//
//
//                break;
//            case KeyEvent.VK_S:
//                //System.out.println("S");
//
//                gamePanel.getGame().getHero1().changedy(10);
//                break;
//            case KeyEvent.VK_D:
//                isDpressed=true;
////                System.out.println("D");
//                if(e.isShiftDown())
//                {      gamePanel.getGame().getHero1().walk(-1);
//                      gamePanel.getGame().getHero1().setRight(true,false);
//                 //   gamePanel.changedx(-8);
////                    if(isApressed){
////                        gamePanel.getGame().getHero1().setRight(true,true);
////
////                    }
//
//                }
////                else if(gamePanel.getGame().getHero1().getInAir()){
////                    gamePanel.getGame().getHero1().jumpani(62510);
////                }
//                else if (isApressed) {
//                    gamePanel.getGame().getHero1().setRight(true,true);
//                    gamePanel.getGame().getHero1().setRight(true,false);
//                }
//
//                else {
//             //   gamePanel.changedx(10);
//                gamePanel.getGame().getHero1().run(2);
//                gamePanel.getGame().getHero1().setRight(true,false);
//                }
//                break;
//            case KeyEvent.VK_C:
//                if(gamePanel.getGame().getHero1().getFacingRight()) {
//                    gamePanel.getGame().getHero1().crouch();
//                }
//                else {
//                    gamePanel.getGame().getHero1().crouchL(999);
//                }
//                    break;
//            case KeyEvent.VK_F:
////                isFpressed=true;
//                  if(gamePanel.getGame().getHero1().getFacingRight()) {
//                      gamePanel.getGame().getHero1().kick(-9);
//                  } else if (!gamePanel.getGame().getHero1().getFacingRight()) {
//                      gamePanel.getGame().getHero1().kickL(-619);
//                  }
//
//
//                break;
//            case KeyEvent.VK_SPACE:
//                gamePanel.getGame().getHero1().setJump(true);
////                gamePanel.getGame().getHero1().jumpani(62510);
//                break;
//            case KeyEvent.VK_E:
//                gamePanel.getGame().getHero1().setPoweringUp(true);
//                gamePanel.getGame().getHero1().powerHimUp();
//                break;
//        }


        //System.out.println("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (GameState.state){
            case MENU -> {
                gamePanel.getGame().getMenu().keyReleased(e);
            }
            case PLAYING -> {
                gamePanel.getGame().getPlaying().keyReleased(e);

            }
            default -> {
            }
        }
//        System.out.println("Key released");
//        switch (e.getKeyCode())
//        {
//            case KeyEvent.VK_G:
//                gamePanel.getGame().getHero1().setFiring(false);
//                Herolvl1.setFireTheBall(true);
////                isGpressed=false;
////                gamePanel.getGame().getHero1().defaultani();
//                gamePanel.getGame().getHero1().FBCL(800);
//                break;
//            case KeyEvent.VK_W:
////                gamePanel.getGame().getHero1().changedy(-10);
//                gamePanel.getGame().getHero1().defaultani();
//                break;
//            case KeyEvent.VK_A:
////                right=false;
//                isApressed=false;
//                 gamePanel.getGame().getHero1().defaultaniL();
//                 gamePanel.getGame().getHero1().setLeftOnly(false);
//
////                  gamePanel.getGame().getHero1().setLeft(false,false);
//                break;
//            case KeyEvent.VK_S:
//                //System.out.println("S");
////                gamePanel.changedy(10);
//
//                break;
//            case KeyEvent.VK_D:
////                right=true;
//                isDpressed=false;
//                gamePanel.getGame().getHero1().defaultani();
//                gamePanel.getGame().getHero1().setRightOnly(false);
////                gamePanel.getGame().getHero1().setRight(false,false);
////                System.out.println("D");
////                gamePanel.changedx(10);
//                break;
//            case KeyEvent.VK_C:
//                if(gamePanel.getGame().getHero1().getFacingRight()) {
//                    gamePanel.getGame().getHero1().defaultani();
//                }
//                else
//                {
//                    gamePanel.getGame().getHero1().defaultaniL();
//                }
//                break;
//            case KeyEvent.VK_F:
////                isFpressed=false;
////                gamePanel.getGame().getHero1().kick(9);
////                if(!isDpressed) {
////                    gamePanel.getGame().getHero1().kick(9);
////                } else if (!isApressed) {
//                if(gamePanel.getGame().getHero1().getFacingRight()) {
//                    gamePanel.getGame().getHero1().kick(9);
//                }
//                else if(!gamePanel.getGame().getHero1().getFacingRight()){
//                    gamePanel.getGame().getHero1().kickL(619);
//                }
////                }
//
//                break;
//            case KeyEvent.VK_SPACE:
//                gamePanel.getGame().getHero1().setJump(false);
//                break;
//            case KeyEvent.VK_E:
//                gamePanel.getGame().getHero1().setPoweringUp(false);
//                gamePanel.getGame().getHero1().defaultani();
//                break;
//
//        }
    }
}
