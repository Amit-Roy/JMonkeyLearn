package com.nefro.jmon.learn.main;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Cylinder;
import com.jme3.scene.shape.Sphere;

public class Main extends SimpleApplication {



    private Main() {



    }



    public static void main(String[] args) {

        final Main app = new Main();

        app.setPauseOnLostFocus(false);

        app.showSettings = true;

        app.start();

    }



    @Override

    public void simpleInitApp() {



        Box b = new Box(1, 1, 1);

        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        mat.setColor("Color", ColorRGBA.Blue);

        geom.setMaterial(mat);

        rootNode.attachChild(geom);



        Cylinder cyl = new Cylinder(100, 100, 1, 100, true);

        Geometry geom2 = new Geometry("Cyl", cyl);

        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        mat2.setColor("Color", ColorRGBA.Green);

        geom2.setMaterial(mat2);

        rootNode.attachChild(geom2);

        Sphere sphere = new Sphere(100, 100, 1, true, true);

        Geometry geometry = new Geometry("Cyl", cyl);

        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        material.setColor("Color", ColorRGBA.White);

        geometry.setMaterial(material);

        rootNode.attachChild(geom2);

    }



    @Override

    public void simpleUpdate(float tpf) {

        //TODO: add update code

    }



    @Override

    public void simpleRender(RenderManager rm) {

        //TODO: add render code

    }

}