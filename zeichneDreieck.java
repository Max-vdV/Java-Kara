import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class zeichneDreieck extends JavaKaraProgram {

    int kleblatt = 9;
    int reihe = 4;
    boolean rechts = true;

  public void myProgram() {


    while (reihe > 0) {
        for(int i = 2; i < kleblatt; i++){
            moveAndPut();
            }
                turn();
                aendereZahlen();
                
    }

  }

  public void moveAndPut(){
    kara.putLeaf();
    kara.move();
  }

  public void turn(){
    if(rechts == true){
        kara.turnLeft();
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
        kara.move();
        rechts = false; 
            } else {
            kara.turnLeft();
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
            kara.move();
            kara.turnRight();
            kara.move();
            rechts = true;  
            }
  }
  public void aendereZahlen(){

     kleblatt = kleblatt -2;
     reihe--;

  }
}














        