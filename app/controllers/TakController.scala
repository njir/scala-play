/**
  * Created by tak on 16. 7. 2.
  */

package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TakController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def tak = Action {
    Ok(views.html.tak("Tak Test"))
  }

  // request test
  def takRequest = Action { request =>
    Ok("got request: " + request)
  }
}
