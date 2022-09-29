package tcejorp;

import mindustry.mod.*;
import tcejorp.content.*;

public class TcejorpJava extends Mod{

  public TcejorpJava(){

  }

  @Override
  public void loadContent(){
    static TcejorpItems.load();
    static TcejorpEnvBlocks.load();
  }
}
