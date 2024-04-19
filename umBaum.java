import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class umBaum extends JavaKaraProgram {

  public void myProgram() {

    while (!kara.onLeaf()) {
      
      
        if(kara.treeFront()){
            kara.turnLeft();
            kara.move();
            kara.turnRight();
            kara.move();
            kara.move();
            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }else{
                kara.move();
            }
            
  }
  kara.removeLeaf();
}
}


        