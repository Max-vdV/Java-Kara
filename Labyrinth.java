import javakara.JavaKaraProgram;

public class Labyrinth extends JavaKaraProgram {
boolean rechts = true;
boolean anfang = true;
  public void myProgram() {

    while (!checkKleblatt()) {
              
        if(!kara.treeLeft()){
            goLeft();
            rechts = false;
            
        }
        if(!kara.treeRight()){
            goRight();

          }

        else if(kara.treeFront()){
                   turn();

      }else{

          kara.move();
          
        }
        
      }
      kara.removeLeaf();

    }
      


  public void turn() {
    kara.turnLeft();
    kara.turnLeft();
  }

  public void goLeft() {
    kara.turnLeft();
    kara.move();
  }

  public void goRight() {
    kara.turnRight();
    while (!kara.treeFront()) {
      kara.move();
      
    }
  }

  public boolean checkKleblatt() {
    return kara.onLeaf();
  }
}

