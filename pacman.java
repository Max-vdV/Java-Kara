import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class pacman extends JavaKaraProgram {

  // hier können Sie eigene Methoden definieren

  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    while (!kara.treeFront()) {
        if(kara.onLeaf()){
           kara.removeLeaf();
           kara.move();
    }else{
       kara.turnLeft();
       kara.turnLeft();
       kara.move();
       kara.turnLeft();
       kara.move();
       
        
        }
  }
  
  if(kara.treeFront()){
      if(kara.onLeaf()){
        kara.removeLeaf();
        }
        
else{ kara.turnRight();
      kara.turnRight();
      kara.move();
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
            if(kara.onLeaf()){
                    kara.removeLeaf();
                    kara.move();
                    kara.removeLeaf();

             }
      }}
        kara.turnLeft();
        kara.move();
        kara.turnLeft();
      while(!kara.treeFront())
{
        if(kara.onLeaf()){
        kara.move();
        kara.removeLeaf();
        }
    }}
}

        