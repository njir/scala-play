/**
  * Created by tak on 16. 7. 10.
  */

package services

import play.api.Play.current
import play.api.db.slick.Config.driver.simple._

trait PostgresSupport {
  implicit lazy val session: Session = play.api.db.slick.DB("default").createSession()
}


