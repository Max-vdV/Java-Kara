import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class slalomKara extends JavaKaraProgram {



  public void myProgram() {

    while (!kara.mushroomFront()) {
      if(kara.treeRight()){
          kara.move();
          kara.turnRight();
          kara.move();
          kara.move();
          kara.turnRight();
          kara.move();
          }
          
     if(kara.treeLeft()){
         kara.move();
         kara.turnLeft();
         kara.move();
         kara.move();
         kara.turnLeft();
         kara.move();
         }
    }
  }
}

        