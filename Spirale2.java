import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Spirale2 extends JavaKaraProgram {
    
    int kante = 0;
    int kleblatt = 2;
    
    public void myProgram(){
      macheSpirale();
      }
    
  public void macheSpirale() {
        while(kante < 14){
            for(int i = 0; i < kleblatt; i++){
                moveAndPut();
            }
        kara.turnRight();
        erhöhung();
        }
  }

  public void moveAndPut(){
        kara.putLeaf();
        kara.move();
        
          }

public void erhöhung(){ 
            kleblatt++;
            kante++;

    }
}



        