import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class endlangWand extends JavaKaraProgram {

  // hier können Sie eigene Methoden definieren

  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    kara.move();
        while(!kara.mushroomFront()){
        
        
	    while (kara.treeRight()) {
    
            if(kara.treeFront()){
                    if(!kara.treeRight()){
                        kara.turnRight();
                        
                        }else{
                            kara.turnLeft();
                            }
                }else{
                    
	      kara.move();
}

	    }
               if(!kara.treeRight()){
                   kara.turnRight();
                   kara.move();
                   }
    }
  }
}

        