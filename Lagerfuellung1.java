import javakara.JavaKaraProgram;

 
public class Lagerfuellung extends JavaKaraProgram {

  int container = 4;

  public void myProgram() {
    findeLagerEingang();
    platzierenInLager();
  }

  public boolean platz(){
    return kara.treeFront() && kara.treeRight() && kara.treeLeft();
  }

  public void mussPlatzieren(){
      if(!istKleblatt()){
        kara.putLeaf();
      }
  }

  public boolean istKleblatt(){
    return kara.onLeaf();
  }

  public boolean canMoveForward() {
    return !kara.treeFront();
  }
  public boolean istRechts(){
    return kara.treeRight();
  }

  public boolean betweenTrees() {
    return kara.treeRight() && kara.treeLeft();
  }

  public void umdrehen(){
    kara.turnRight();
    kara.turnRight();
  }

public void findeLagerEingang(){

  while (canMoveForward() && !betweenTrees()) {
    kara.move();
  }

    if(kara.treeFront()){

          if(!kara.treeLeft()) {
              kara.turnLeft();
                while (kara.treeRight()) {
                       kara.move();
                }
                  kara.turnRight();
                  kara.move();

                }
          }

          else if(!kara.treeRight()){
            
          if(!kara.treeRight()) {
            kara.turnRight();
              while (kara.treeLeft()) {
                     kara.move();
              }
                kara.turnLeft();
                kara.move();

              }

          }

    }

    public void platzierenInLager(){
        while (container > 0) {
              while (istRechts()) {
                if(kara.treeFront()){
                  if (platz()) {
                    mussPlatzieren();
                    container--;
                    umdrehen();
                  }
                }else{
                  
                  kara.move();
                }
              }
              kara.turnRight();
              kara.move();
        }
    }
  }





        
