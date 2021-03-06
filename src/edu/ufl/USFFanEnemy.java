package edu.ufl;

import edu.ufl.Sprite.SpriteType;

public class USFFanEnemy extends Enemy {

    public USFFanEnemy(float x, float y) {
        super(x,y);
        this.standingSprite = SpriteType.USFFAN_STANDING;
        this.walkingSprite = SpriteType.USFFAN_WALKING;
        this.initSprite();
        this.initRectF(x,y-(this.sprite.getHeight() - Tile.SIZE),
                       this.sprite.getWidth(),this.sprite.getHeight());
    }

    public USFFanEnemy(float x, float y, float ml) {
        super(x,y);
        this.standingSprite = SpriteType.USFFAN_STANDING;
        this.walkingSprite = SpriteType.USFFAN_WALKING;
        this.initSprite();
        this.initRectF(x,y,this.sprite.getWidth(),this.sprite.getHeight());
        this.movingLeft = ml;
        if (movingLeft < 0) {
            sprite.flip();
            facingLeft = true;
        }
    }
    
    @Override
    public char getType() {
        return 'u';
    }

}
