package multithreading

import java.awt.Graphics2D
import scala.swing.MainFrame
import java.awt.image.BufferedImage
import scala.swing.Panel
import java.awt.Dimension
import java.awt.Color

object Mandelbrot {
  
  val img = new BufferedImage(500,500,BufferedImage.TYPE_INT_ARGB)
 
  val panel = new Panel {
    override def paint(g: Graphics2D){
      g.drawImage(img,0,0,null)
    }
    preferredSize = new Dimension(img.getWidth(),img.getHeight())
  }
  val frame = new MainFrame {
    title ="Mandelbrot"
    contents = panel
    centerOnScreen
  }  
  

  /*
   * Calculates the number of iterations of the Mandelbroth sequence before magnitude goes
   * above 4 up to max.
   * 
   * z = z^2 + c
   */
  def calcMandel(cr: Double, ci: Double, maxCnt: Int): Int = {
    var zr = 0.0
    var zi = 0.0
    var cnt = 0
    while (cnt<maxCnt && zr*zr+zi*zi<16) {
      val nzr = zr*zr - zi*zi + cr
      zi = 2*zr*zi + ci
      zr = nzr
      cnt +=1 
    }
    cnt
  }
  
  def main(args: Array[String]): Unit = {
    var rmin = -1.5
    var rmax = 0.5
    var imin =  -1.0
    var imax = 1.0  
    var maxCnt = 10000
    //This is an example of two nested for, the outer one is the first one
    //In case one of the lines has more work to do than another, the parallel collection
    //will steal work from it and provide it to the rest.
    for (i <- (0 until img.getHeight()).par; j <- 0 until img.getWidth){
      val cr = rmin + (rmax-rmin)*j/img.getWidth
      val ci = imin + (imax-imin)*i/img.getWidth
      val cnt = calcMandel(cr,ci,maxCnt)
      if (cnt < maxCnt) img.setRGB(j,i,Color.black.getRGB)
      else img.setRGB(j,i,Color.white.getRGB)
    }
    frame.open()
    
  }
  
  
  
}