package tcejorp;

import arc.struct.Seq;
import mindustry.Vars;
import mindustry.mod.*;
import tcejorp.content;
import rhino.ImporterTopLevel;
import rhino.NativeJavaPackage;

//stolen from null
public class TcejorpJava extends Mod{
    public TcejorpJava(){}

    @Override
    public void loadContent() {
        new TcejorpEnvBlocks().load();
        new TcejorpItems().load();
    }

    //stolen from sh1p
    public static NativeJavaPackage p = null;

    @Override
    public void init() {
        super.init();
        ImporterTopLevel scope = (ImporterTopLevel) Vars.mods.getScripts().scope;

        Seq<String> packages = Seq.with(
                "tcejorp-java",
                "tcejorp-java.envblocks",
                "tcejorp-java.items"
        );

        packages.each(name -> {
            p = new NativeJavaPackage(name, Vars.mods.mainLoader());

            p.setParentScope(scope);

            scope.importPackage(p);
        });
    }
}
