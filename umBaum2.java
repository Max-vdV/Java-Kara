import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class umBaum2 extends JavaKaraProgram {

  // hier können Sie eigene Methoden definieren

  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    while(!kara.onLeaf()){
            while(!kara.treeFront()&& !kara.onLeaf()){
                         kara.move();
                         
                         if(kara.onLeaf()){
                             }else  {                              
                             if(!kara.treeRight()){
                                kara.turnRight();
                                kara.move();
                                kara.turnLeft();
                             }
                             }
                            }
            
                if(kara.treeFront()){
                    kara.turnLeft();
                    kara.move();
                    kara.turnRight();
                    kara.move();
                }
                
           
    }kara.removeLeaf(); 
        }

   }
 
  

        