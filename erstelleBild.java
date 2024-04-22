import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class erstelleBild extends JavaKaraProgram {

boolean rechts= true;

  public void myProgram() {
      if(kara.onLeaf()){
            kara.removeLeaf();
          }else{
              kara.putLeaf();
              }
      
while (canmove()== true){
     
            if(kara.treeFront()){
                    direktion();
                }
                
                kara.move();
                sammelOplatziereBlatt();
    }

  }
  public boolean canmove(){
         boolean can = true;
        if(kara.treeFront() && kara.treeRight()){
            can = false;
            }return can;

        }
        
  public boolean direktion(){
                if(rechts == true){
                        kara.turnRight();
                        kara.move();
                        sammelOplatziereBlatt();
                        kara.turnRight();
                        rechts = false;
                        
                
                }else if(rechts == false){
                        kara.turnLeft();
                        kara.move();
                        sammelOplatziereBlatt();
                        kara.turnLeft();
                        rechts = true;
                       
                    
                    
                    }return rechts;
      }
      public boolean sammelOplatziereBlatt(){
                    if(kara.onLeaf()){
                         return   kara.removeLeaf();
                            
                        }   else    {
                           return     kara.putLeaf();
                            
                            }
          
          }
            
            }
   



        