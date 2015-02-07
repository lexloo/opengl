package com.nvapp.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class MyGLSurfaceView extends GLSurfaceView {
	private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
	private SceneRenderer mRenderer;

	private float mPreviousY;
	private float mPreviousX;
	private int lightAngle;

	public MyGLSurfaceView(Context context) {
		super(context);

		mRenderer = new SceneRenderer();
		this.setRenderer(mRenderer);
		this.setRenderMode(RENDERMODE_CONTINUOUSLY);
	}

	@Override
	public boolean performClick() {
		return super.performClick();
	}

	@Override
	public boolean onTouchEvent(MotionEvent e) {
		float y = e.getY();
		float x = e.getX();
		switch (e.getAction()) {
		case MotionEvent.ACTION_MOVE:
			float dy = y - mPreviousY;
			float dx = x - mPreviousX;

			this.requestRender();
			
			break;
		default:
			return super.onTouchEvent(e);
		}

		mPreviousY = y;
		mPreviousX = x;

		return true;
	}

}
