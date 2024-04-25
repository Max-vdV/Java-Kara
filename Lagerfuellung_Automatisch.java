import javakara.JavaKaraProgram;
        
public class Lagerfuellung2 extends JavaKaraProgram {

int pos_x = 0;
int gate = 4;
int at_gate = 0;
int gate_start= 0;
int schrittInGate = 0;                                                    

  public void myProgram() {
    geheZuLagereingang();
    moveToGate();
    moveInGate();
    placeOrTakeContainer();
    moveOutGate();
    geheZuLagerAusgang();
    geheZuStartpunkt();
      
  }
 
  public boolean canMove(){
    return !kara.treeFront();
  }
  public boolean canMoveRight(){
    return !kara.treeRight();
  }

  public boolean isKeinBaumRechts(){
    return !kara.treeRight();
  }

  public boolean istContainerDa(){
    return kara.onLeaf();
  }

  public boolean istKeinBaumLinks(){
    return !kara.treeLeft();
  }

  public void turnArround(){
    kara.turnRight();
    kara.turnRight();

  }

  public void dubbleMove(){
    kara.move();
    kara.move();
  }
  
  public void geheZuLagereingang(){
    while (!canMoveRight()) {
      
      while(canMove()){
          if(canMoveRight()){
            break;
          }
        kara.move();
        pos_x++;
      }
        if (!canMove()) {
          kara.turnLeft();
          pos_x = pos_x-3;
        }
    }

    kara.turnRight();
    kara.move();
  }

  public void moveToGate(){
      while (canMove()) {
        kara.move();
          if (isKeinBaumRechts()) {
            at_gate++;
          } if (at_gate == gate) {
            break;
          }
      }
  }

  public void moveInGate(){
    kara.turnRight();
    while (canMove()) {
      kara.move();
      schrittInGate++;
    }
  }

  public void placeOrTakeContainer(){
      if(istContainerDa()){
        kara.removeLeaf();
      }else{
        kara.putLeaf();
      }
  } 

  public void moveOutGate(){
    turnArround();
    while (schrittInGate > 0) {
        kara.move();
        schrittInGate--;
    }
  }
  
  public void  geheZuLagerAusgang(){
    kara.turnLeft();
    at_gate = at_gate-1;
    while (at_gate > gate_start) {
      kara.move();
      if (istKeinBaumLinks()) {
        at_gate--;
        
      }
    }
      gate_start = 0;
      kara.move();
   
  }
  public void geheZuStartpunkt(){
    while (pos_x >= 0) {
      kara.move();
      pos_x--;
    }
    kara.turnLeft();
      while (canMove()) {
        kara.move();
      } kara.turnLeft();
  }

  

}

        