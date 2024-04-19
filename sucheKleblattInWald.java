import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class sucheKleblattInWald extends JavaKaraProgram {

  public void myProgram() {

    while (!kara.onLeaf()) {
        if(kara.treeFront()){
                if(!kara.treeLeft()){
                                    kara.turnLeft();
                    } else {
                        kara.turnRight();
                        }
            

    }else{kara.move();}
  } kara.removeLeaf();
}
}

        