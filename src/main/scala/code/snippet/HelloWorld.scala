package code
package snippet

import lib._
import model._

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import Helpers._

class HelloWorld extends Loggable {
  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  // replace the contents of the element with id "time" with the date
  def howdy = {
    logger.info("User.currentUser: %s".format(User.currentUser.toString))
    "#time *" #> date.map(_.toString)
  }

  /*
   lazy val date: Date = DependencyFactory.time.vend // create the date via factory

   def howdy = "#time *" #> date.toString
   */
}

