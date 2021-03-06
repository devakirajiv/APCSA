/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\640x480.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
    Picture canvas = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\640x480.jpg");
    canvas.explore();
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.keepOnlyGreen();
	    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\snowman.jpg");
	    snowman.explore();
	    snowman.mirrorArms();
	    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\seagull.jpg");
	  	seagull.explore();
	  	seagull.mirrorGull();
	  	seagull.explore();
  }
  
  
  public static void testMirrorHorizontal()
  {
	  Picture bike = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\redMotorcycle.jpg");
	  	bike.explore();
	  	bike.mirrorHorizontal();
	  	bike.explore();
  }
  
  public static void testMirrorHorizontalBotTop()
  {
	  Picture bike = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\redMotorcycle.jpg");
	  	bike.explore();
	  	bike.mirrorHorizontalBottomToTop();
	  	bike.explore();
  }
  
  public static void testSharpen(int x, int y, int w, int h)
  {
       Picture redMoto = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\redMotorcycle.jpg");
       redMoto.explore();
       redMoto.sharpen(x,y,w,h);
       redMoto.explore();
  }
  
  
  public static void testEncodeDecode(){
	  Picture message = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\msg.jpg");
	  Picture beach = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\beach.jpg");
	  Picture apple = new Picture("H:\\APCS\\Unit16\\pixLab\\images\\apple.jpg");
	  beach.explore();
	  beach.encode(apple);
	  beach.explore();
	  //apple.explore();
	  beach.decode();
	  beach.explore();
	  
	  
	  
  }

  

 
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorHorizontalBotTop();
    //testMirrorVertical();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
	//testSharpen(50,50,500,400);
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
    //testEdgeDetection();
	  testEncodeDecode();

  }
}