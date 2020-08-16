
public class Task5ImageProcessing {
	static int N = 3; 
	  
	// Function to rotate the matrix 90 degree clockwise 
	static void rotate90Clockwise(int a[][][]) 
	{ 
	  
	    // Traverse each cycle 
	    for (int i = 0; i < N / 2; i++) 
	    { 
	        for (int j = i; j < N - i - 1; j++) 
	        { 
	        	for(int k=0;k<3;k++)
	        	{
	  
	            // Swap elements of each cycle 
	            // in clockwise direction 
	            int temp = a[i][j][k]; 
	            a[i][j][k] = a[N - 1 - j][i][k]; 
	            a[N - 1 - j][i][k] = a[N - 1 - i][N - 1 - j][k]; 
	            a[N - 1 - i][N - 1 - j][k] = a[j][N - 1 - i][k]; 
	            a[j][N - 1 - i][k] = temp; 
	        	}
	        } 
	    } 
	}

	public static void main(String[] args) {
		
		int[] pixel1 = {255, 0, 0}; // Red
		int[] pixel2 = {0, 255, 0}; // Green
		int[] pixel3 = {0, 0, 255}; // Blue
		
		int[] pixel4 = {125, 111, 255};
		int[] pixel5 = {225, 211, 155};
		int[] pixel6 = {135, 101, 25};
		
		int[] pixel7 = {15, 11, 125};
		int[] pixel8 = {25, 11, 205};
		int[] pixel9 = {12, 11, 115};
		
		int[][][] image = {
				{pixel1, pixel2, pixel3},
				{pixel4, pixel5, pixel6},
				{pixel7, pixel8, pixel9},		
		};
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
				System.out.println(image[i][j][k]);
				}
			}
		}*/
		//System.out.println("1111111111");
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			sum=sum+image[0][0][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel1[i]=sum;
		//System.out.println(pixel1[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[0][1][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel2[i]=sum;
		//System.out.println(pixel2[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[0][2][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel3[i]=sum;
		//System.out.println(pixel3[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[1][0][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel4[i]=sum;
		//System.out.println(pixel4[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[1][1][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel5[i]=sum;
		//System.out.println(pixel5[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[1][2][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel6[i]=sum;
		//System.out.println(pixel6[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[2][0][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel7[i]=sum;
		//System.out.println(pixel7[i]);
		}
		sum=0;
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[2][1][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel8[i]=sum;
		//System.out.println(pixel8[i]);
		}
		sum=0;
		
		/******************/
		for(int i=0;i<3;i++)
		{
			sum=sum+image[2][2][i];
		}
		sum=sum/3;
		
		for(int i=0;i<3;i++)
		{
			pixel9[i]=sum;
		//System.out.println(pixel9[i]);
		}
		sum=0;
		
		
	
		
		
		

		
		/*
		for(int i=0;i<3;i++)
		{
			image[0][0][i]=sum;
			System.out.println(image[0][0][i]);
		
		}*/
		System.out.println("------------------Original Image------------");
		for(int outer[][] : image) {
			for(int[] inner: outer)
			{
				for(int a:inner)
				{
					System.out.print(a+" ");
				}
				System.out.print(",");
			}
			System.out.println("");
		}
		System.out.println("--------After Rotating by 90 degree clockwise----------");
		rotate90Clockwise(image); 
		
		for(int outer[][] : image) {
			for(int[] inner: outer)
			{
				for(int a:inner)
				{
					System.out.print(a+" ");
				}
				System.out.print(",");
			}
			System.out.println("");
		}
		
		 //Rotate Matrix to 90 degree toward Right(clockwise)
		
		 
			
		
		
		
		// Assignment:
		// 1. Print the Image using enhanced for loop i.e. just display pixel data with enhanced for loop
		// 2. Rotate the Image 90 degrees to clockwise
		/*
		 	pixel1, pixel2, pixel3
			pixel4, pixel5, pixel6
			pixel7, pixel8, pixel9
			
			
			pixel7, pixel4, pixel1
			pixel8, pixel5, pixel2
			pixel9, pixel6, pixel3
		 */
		// 3. GrayScale the image
		//    for every pixel, add up RGB values and divide by 3 i.e. take average and update the pizel values with the vaerage one
		//    255, 0, 0 -> 255 + 0 + 0 / 3 -> 85 			-> New Pixel becomes -> 85, 85, 85
		//    125, 111, 255 -> 125 + 111 + 255 /3 -> 163    -> New Pixel becomes -> 163, 163, 163
		
		
	}

}
