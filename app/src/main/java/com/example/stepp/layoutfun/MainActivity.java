/*
 * CS 193A, Marty Stepp
 * This activity class represents the event handling and state
 * of our ninja turtle app.
 */

package com.example.stepp.layoutfun;
//
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    /*
     * This method is called when the user chooses one of the turtle radio buttons.
     * In this code we set which turtle image is visible on the screen in the ImageView.
     */
    public void pickTurtle(View view) {
        ImageView img = (ImageView) findViewById(R.id.sombrero);
        if (view.getId() == R.id.leo) {
            img.setImageResource(R.drawable.hat);
        }
    }
    public void brazos(View view) {
        ImageView img = (ImageView) findViewById(R.id.brazos);
        if (view.getId() == R.id.mike) {
            img.setImageResource(R.drawable.arms);
        }
    }
    public void orejas(View view) {
        ImageView img = (ImageView) findViewById(R.id.orejas);
        if (view.getId() == R.id.don) {
            img.setImageResource(R.drawable.ears);
        }
    }
    public void nariz(View view) {
        ImageView img = (ImageView) findViewById(R.id.nariz2);
        if (view.getId() == R.id.nariz) {
            img.setImageResource(R.drawable.nose);
        }
    }
    public void cejas(View view) {
        ImageView img = (ImageView) findViewById(R.id.cejas2);
        if (view.getId() == R.id.cejas) {
            img.setImageResource(R.drawable.eyebrows);
        }
    }
    public void ojos(View view) {
        ImageView img = (ImageView) findViewById(R.id.ojos2);
        if (view.getId() == R.id.ojos) {
            img.setImageResource(R.drawable.eyes);
        }
    }
    public void gafas(View view) {
        ImageView img = (ImageView) findViewById(R.id.gafas2);
        if (view.getId() == R.id.gafas) {
            img.setImageResource(R.drawable.glasses);
        }
    }
    public void sonrrisa(View view) {
        ImageView img = (ImageView) findViewById(R.id.sonrrisa2);
        if (view.getId() == R.id.risa) {
            img.setImageResource(R.drawable.mouth);
        }
    }
    public void mostacho(View view) {
        ImageView img = (ImageView) findViewById(R.id.bigote2);
        if (view.getId() == R.id.bigote) {
            img.setImageResource(R.drawable.mustache);
        }
    }
    public void tillas(View view) {
        ImageView img = (ImageView) findViewById(R.id.tillas2);
        if (view.getId() == R.id.tillas) {
            img.setImageResource(R.drawable.shoes);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
