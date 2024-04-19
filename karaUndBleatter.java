import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class karaUndBlätter extends JavaKaraProgram {



  public void myProgram() {
      
       if(kara.onLeaf()){
         kara.removeLeaf();
         
       }else{
          kara.putLeaf();
           
        }

    while (!kara.treeFront()) {
             kara.move();
      
      if(kara.onLeaf()){
         kara.removeLeaf();
         
       }else{
          kara.putLeaf();
           
        }
              
    }
  }
}

        