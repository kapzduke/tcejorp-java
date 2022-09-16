package tcejorp.content;

import arc.graphics.*;
import mindustry.type.*;
import mindustry.ctype.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import tcejorp.planets.*;

public class TcejorpPlanets {
	public static Planet
        //serril,
	deca;

	public void load() {
		deca = new Planet("deca", Planets.sun, 4f, 0) {{
			bloom = true;
			accessible = false;
			orbitRadius = 1000f;
			drawOrbit = false;
			meshLoader = () -> new SunMesh(
				this, 5,
				5, 0.3, 1.7, 1.2, 1,
				1.1f,
				Color.valueOf("236DFF"),
				Color.valueOf("236DFF"),
				Color.valueOf("28B3FF"),
				Color.valueOf("33CEFF"),
				Color.valueOf("45DEFF"),
				Color.valueOf("46FFFF")
			);
		}};
    /*
    serril = makeAsteroid("serril", deca, Blocks.stoneWall,TcejorpBlocks.afinumWall, Blocks.iceWall, 0.5f, 12, 2f, gen -> {
        gen.iceChance = 0.4f;
        gen.afinumChance = 0.5f;
    });


    }

    private static Planet makeAsteroid(String name, Planet parent, Block base, Block tint, float tintThresh, int pieces, float scale, Cons<AsteroidGenerator> cgen){
        return new Planet(name, parent, 0.12f){{
            hasAtmosphere = false;
            updateLighting = false;
            sectors.add(new Sector(this, Ptile.empty));
            camRadius = 0.68f * scale;
            minZoom = 0.6f;
            drawOrbit = false;
            clipRadius = 2f;
            defaultEnv = Env.space;

            generator = new TcejorpAsteroidGenerator();
            cgen.get((TcejorpAsteroidGenerator)generator);

            meshLoader = () -> {
                Color tinted = tint.mapColor.cpy().a(1f - tint.mapColor.a);
                Seq<GenericMesh> meshes = new Seq<>();
                Color color = base.mapColor;
                Rand rand = new Rand(id + 2);

                meshes.add(new NoiseMesh(
                    this, 0, 2, radius, 2, 0.55f, 0.45f, 14f,
                    color, tinted, 3, 0.6f, 0.38f, tintThresh
                ));

                for(int j = 0; j < pieces; j++){
                    meshes.add(new MatMesh(
                        new NoiseMesh(this, j + 1, 1, 0.022f + rand.random(0.039f) * scale, 2, 0.6f, 0.38f, 20f,
                        color, tinted, 3, 0.6f, 0.38f, tintThresh),
                        new Mat3D().setToTranslation(Tmp.v31.setToRandomDirection(rand).setLength(rand.random(0.44f, 1.4f) * scale)))
                    );
                }

                return new MultiMesh(meshes.toArray(GenericMesh.class));
            };
        }};*/
    }

}
