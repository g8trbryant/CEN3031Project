package edu.ufl;

import android.graphics.Canvas;
import android.graphics.RectF;

class Camera {

    private GamePanel gamePanel;
    float x;
    float y;

    Camera(GamePanel gP) {
        gamePanel = gP;
        x = 0;
        y = 0;
    }

    public void draw(LevelObject lo, Canvas canvas) {
        RectF rectf = new RectF(lo.getRectF());

        float offX = rectf.left - x;
        float offY = rectf.top  - y;

        rectf.offsetTo(offX,offY);
        canvas.drawRect(rectf,lo.color);
    }

    public void offset(LevelObject albert, Level level) {

        float MAX_X = (float)level.getMaxPixelsX();
        float MAX_Y = (float)level.getMaxPixelsY();

        float albertX = albert.getX();
        float albertY = albert.getY();

        float gPw  = gamePanel.getWidth();
        float gPw2 = gPw/2f;
        float gPh  = gamePanel.getHeight();

        if (albertX < gPw2) {
            //x stays the same
        }
        else if (albertX > MAX_X - gPw2) {
            //x stays the same
        }
        else {
            x = albertX - gPw2;
        }

        y = albertY - gPh/2f;
    }

}
