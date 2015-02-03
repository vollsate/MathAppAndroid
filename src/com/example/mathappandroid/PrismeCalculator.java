package com.example.mathappandroid;


public class PrismeCalculator {
	
	public static final int TYPE_PRISME = 1;
	public static final int TYPE_CYLINDER = 2;
	
	private static final double PI = 3.141828;
	
	private int type;
	
	private int length;
	private int height;
	private int width;
	
	private int radius;
	
	private double volume;
	private double surface;
	

	public PrismeCalculator(int r, int h) {
		type = TYPE_CYLINDER;
		
		radius = r;
		height = h;
	}
	
	public PrismeCalculator(int l, int w, int h) {
		type = TYPE_PRISME;
		
		length = l;
		height = h;
		width = w; 
	}
	
	public double calcVolume() {
		if ( volume == 0 )  {
			switch ( type ) {
			case TYPE_PRISME:	
				volume = width * height * length;
				break;

			case TYPE_CYLINDER:
				volume = PI * (radius ^ 2) * height;
				
			default:
				break;
			}
		}
		
			
		return volume;
	}
	
	public double caclSurface() {
		if ( surface == 0 ) {
			switch ( type ) {
			case TYPE_PRISME:
				int a1 = length * width;
				int a2 = length * height;
				int a3 = width * height;
				
				surface = ( a1 * a2 * a3 ) * 2;
				break;

			default:
				break;
			}
		}
		
		return surface;
	}

}
