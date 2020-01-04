package com.atilsamancioglu.survivorbirdtest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SurvivorBird extends ApplicationAdapter {

	SpriteBatch batch;
	Texture background;
	Texture bird;
	Texture bee1;
	Texture bee2;
	Texture bee3;
	float birdX = 0;
	float birdY = 0;
	int gameState = 0;
	float velocity = 0;
	float gravity = 0.9f;
	float enemyX = 0;

	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		bird = new Texture("bird.png");
		bee1 = new Texture("bee.png");
		bee2 = new Texture("bee.png");
		bee3 = new Texture("bee.png");

		enemyX = 900;

		birdX = Gdx.graphics.getWidth() / 2 - bird.getHeight() / 1;
		birdY = Gdx.graphics.getHeight() / 3;
	}

	@Override
	public void render () {

		batch.begin();
		batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());

	    if (gameState == 1) {

	    	batch.draw(bee1, enemyX,50, Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);
	    	batch.draw(bee2, enemyX,150, Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);
	    	batch.draw(bee3, enemyX,350, Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);

	    	enemyX -= 5;

	    	if (Gdx.input.justTouched()) {
	    		velocity = -20;
			}

	    	if (birdY > 0 || velocity < 0) {
				velocity = velocity + gravity;
				birdY = birdY - velocity;
			}


		} else {
			if (Gdx.input.justTouched()) {
				gameState = 1;
			}
		}


		batch.draw(bird,birdX,birdY, Gdx.graphics.getWidth() / 15, Gdx.graphics.getHeight() / 10);

		batch.end();
	}
	
	@Override
	public void dispose () {

	}
}
