package day5.TestSamples

import org.junit.Assert._
import org.junit.Test
import org.hamcrest.CoreMatchers._

//import org.mockito.Mockito._


class ListJUnitTest {
  
  @Test
  def testIsEmpty = {
    val list = List()
    assertTrue("list should be empty",list.isEmpty)
  }
  
  @Test
  def testSize = {
    val list = List(1,2,3)
    assertEquals(3,list.size)
  }
  
  
  //Using HamCrest matchers
  @Test
  def testSize2 = {
    val list = List(4,5,6)
    assertThat(list.size, is(equalTo(3)))
  }
  
  
  
  
  
}