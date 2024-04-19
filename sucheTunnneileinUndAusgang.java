import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class sucheTunnneileinUndAusgang extends JavaKaraProgram {



  public void myProgram() {

    while ((!kara.treeRight()||!kara.treeLeft())){
      kara.move();
    }
    
     while (kara.treeRight()&&kara.treeLeft()){
      kara.move();
    }
  }
}

        