package tcejorp.content;

import arc.graphics.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.environment.*;

public class TcejorpEnvBlocks {
	public static Block
		turquosia, afinium, turquosiaCraters,
		turquosiaWall, afiniumWall;

	public void load() {

		turquosia = new Floor("turquosia") {{
		attributes.set(Attribute.water, -0.1f);
			mapColor = Color.valueOf("34827C");
		}};
		afinium = new Floor("afinium") {{
			mapColor = Color.valueOf("5490FF");
		}};
		turquosiaCraters = new Floor("turquosia-crater") {{
			attributes.set(Attribute.water, -0.1f);
			mapColor = Color.valueOf("307A74");
		}};
		}};
		turquosiaWall = new StaticWall("turquosia-wall") {{
			mapColor = Color.valueOf("57AD98");
		}};
		afiniumWall = new StaticWall("afinium-wall") {{
			mapColor = Color.valueOf("2F64D6");
		}};
	}
}
