package tcejorp;

import mindustry.mod.*;
import tcejorp.content.*;

public class TcejorpJava extends Mod{

  public TcejorpJava(){

  }

  @Override
  public void loadContent(){
    TcejorpItems.load();
    TcejorpEnvBlocks.load();
  }
}
