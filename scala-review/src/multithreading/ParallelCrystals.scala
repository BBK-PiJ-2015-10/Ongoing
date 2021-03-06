package multithreading

import scala.swing._
import java.awt.image.BufferedImage
import java.awt.Color
import java.util.concurrent.Executors
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier

/*
 * ArrayBlockingQueue
 * LinkedListBlockingQueue
 * Exchanger
 * CountDownLatch
 * CyclicBarrier
 * Semaphore
 */


object ParallelCrystals {
  
  val img = {
    val i = new BufferedImage(300,300,BufferedImage.TYPE_INT_ARGB)
    val g = i.createGraphics()
    g.setPaint(Color.BLACK)
    g.fillRect(0,0,i.getWidth,i.getHeight)
    g.setPaint(Color.WHITE)
    g.drawLine(0,i.getHeight-1,i.getWidth,i.getHeight-1)
    i
  }
  val panel = new Panel {
    override def paint(g: Graphics2D){
      g.drawImage(img,0,0,null)
    }
    preferredSize = new Dimension(img.getWidth(),img.getHeight())
  }
  val frame = new MainFrame {
    title ="Crystal Growth"
    contents = panel
    centerOnScreen
  }
  
  
  def main(args: Array[String]): Unit = {
    frame.open()
    var cnt = 0
    val numThreads = 6
    val es = Executors.newFixedThreadPool(numThreads)
    val pnts = Array.fill(numThreads)(0 -> 0)
    val cb = new CyclicBarrier(numThreads)
    for (i <- 0 until numThreads) yield {
      es.submit(new Runnable {
        def run {
          while (cnt<10000){
            var flag = true
            var x = util.Random.nextInt(img.getWidth-1)
            var y = 0
            while (flag) {
              val nx = x + util.Random.nextInt(3)-1
              val ny = y + util.Random.nextInt(3)-1
              if (nx>=0 && nx<img.getWidth && ny>=0 && ny<img.getHeight){
                if(img.getRGB(nx,ny) == Color.black.getRGB){
                  x = nx
                  y = ny
                } else {
                  flag = false
                }
              } 
            }
            pnts(i)= x -> y
            cb.await
            if (i == 0){
              for ((px,py) <- pnts){
                img.setRGB(px,py,Color.white.getRGB)
              }
              cnt += numThreads
              panel.repaint
            }
            cb.await
          }
        }
      })
    }
    //es.shutdown()
  }

  
}