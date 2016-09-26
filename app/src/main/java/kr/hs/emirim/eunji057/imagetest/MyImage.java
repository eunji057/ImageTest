package kr.hs.emirim.eunji057.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreate09 on 2016. 9. 26..
 */
public class MyImage extends View{
    MyImage(Context context){
        super(context);  //view를 상속받을 때 디폴트 생성자가 없어서 객체생성을 할 수 없기 때문에 사용자 정의형을 만들려면
    }

//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//
//        Bitmap picture= BitmapFactory.decodeResource(getResources(), R.drawable.love);
//        float x= ((getWidth()-picture.getWidth())*0.5f);
//        float y=((getHeight()-picture.getHeight())*0.5f);
//        float cx=getWidth()/2.0f;
//        float cy=getHeight()/2.0f;
//        //canvas.rotate(180, cx, cy);
//        //canvas.translate(-150, 200);
//        //canvas.scale(2, 2, cx, cy);
//        canvas.skew(0.4f, 0.4f);
//        canvas.drawBitmap(picture, x, y, null);
//    }
}
