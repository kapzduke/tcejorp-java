package tcejorp.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

import static mindustry.content.Items.*;

public class TcejorpItems {
    public static Item niobium, hafnium, sodium, polonium, moscovium, nihonium, galemite, roentgenium, promethium, barienPlating;
  
    public static final Seq<Item> lamoniItems = new Seq<>(), urunirItems = new Seq<>();

    public static void load() {
        niobium = new Item("niobium", Color.valueOf("4d608c")) {{
            hardness = 6;
            cost = 0.5f;
        }};

        hafnium = new Item("hafnium", Color.valueOf("292929")) {{
            hardness = 7;
            flammability = 1f;
        }};

        sodium = new Item("sodium", Color.valueOf("9dcf9b")) {{
            flammability = 1f;
        }};

        polonium = new Item("polonium", Color.valueOf("71638f")) {{
            radioactivity = 1f;
            cost = 1.1f;
        }};

        moscovium = new Item("moscovium", Color.valueOf("b07d82")) {{
            hardness = 4;
            cost = 1.1f;
        }};

        nihonium = new Item("nihonium", Color.valueOf("dba87b")) {{
            hardness = 4;
            cost = 1.1f;
        }};

        galemite = new Item("galemite", Color.valueOf("fffde3")) {{
            cost = 1.3f;
        }};

        roentgenium = new Item("roentgenium", Color.valueOf("90a94d")) {{
            hardness = 5;
            cost = 1.3f;
        }};
      
        promethium = new Item("promethium", Color.valueOf("000000")) {{
            hardness = 6;
            radioactivity = 1.3f;
            cost = 1.5f;
        }};
      
        barienPlating = new Item("barienPlating", Color.valueOf("000000")) {{
            cost = 2f;
        }};
      
        lamoniItems.addAll(
                niobium, sand, scrap, hafnium, sodium, plastanium, polonium, surgeAlloy, phaseFabric
        );
      
        urunirItems.addAll( //wip
                moscovium, nihonium, sand, galemite, roentgenium, promethium, barienPlating
        );
    }
}
