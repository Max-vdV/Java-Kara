import javakara.JavaKaraProgram;
 public class unkraut_kara extends JavaKaraProgram {


  public void myProgram() {
    ausDemHaus();
    raumeUmHausAuf();
    inDasHaus();
  }

  public void turnArround(){
    kara.turnRight();
    kara.turnRight();
  }

  public boolean isBaumRechts(){
    return kara.treeRight();
  }

  public boolean isOnLeaf(){
    return kara.onLeaf();
  }


  public boolean isPilzvor(){
    return kara.mushroomFront();
  }

  public boolean zwischenBaume(){
    return kara.treeRight() && kara.treeLeft();
  }

  public void ausDemHaus(){
    turnArround();
        while(!zwischenBaume()){
            kara.move();
        }
  }

  public void raumeUmHausAuf(){
        kara.move();
        while(!zwischenBaume()){

        if(isOnLeaf()){
            kara.removeLeaf();
        }
            if(!isBaumRechts()){
                kara.turnRight();
                kara.move();
            }
            else{
                kara.move();
            }
        }
  }

  public void inDasHaus(){
    while(!isPilzvor()){
        kara.move();
    }
  }
}

        