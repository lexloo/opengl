package com.nvapp.opengl;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

public class DrawCylinder {
	private FloatBuffer myVertexBuffer;
	private FloatBuffer myNormalBuffer;
	private FloatBuffer myTexture;
	private int textureId;
	private int vCount;
	private float length;
	private float circleRadius;
	private float degreeSpan;
	private int col;
	public float mAngleX;
	public float mAngleY;
	public float mAngleZ;

	public DrawCylinder(float length, float circleRadius, float degreeSpan,
			int col, int textureId) {
		this.circleRadius = circleRadius;
		this.length = length;
		this.degreeSpan = degreeSpan;
		this.col = col;
		this.textureId = textureId;
		float colLength = length / col;
		int spanNum = (int) (360.0f / degreeSpan);
		List<Float> val = new ArrayList<Float>();
		List<Float> ival = new ArrayList<Float>();

		for (float circleDegree = 360.0f; circleDegree > 0.0f; circleDegree -= degreeSpan) {
			for (int j = 0; j < col; j++) {
				
			}
		}
	}
}
