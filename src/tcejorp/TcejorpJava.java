package tcejorp;

import arc.struct.Seq;
import mindustry.Vars;
import mindustry.mod.*;
import tcejorp.content;

public class TcejorpJava extends Mod{
    public TcejorpJava(){}

    @Override
    public void loadContent() {
        new TcejorpEnvBlocks().load();
        new TcejorpItems().load();
    }
}
