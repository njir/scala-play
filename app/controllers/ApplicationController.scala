/**
  *
  * Created by tak on 16. 7. 9.
  */
package controllers

import java.net.CacheRequest
import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import models.Stock

@Singleton
class ApplicationController @Inject() extends Controller {
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("test"))
  }

  def getStock = Action {
    val stock = Stock("GOOG", 650.0)
    Ok(Json.toJson(stock))
  }

  def saveStock = Action { request =>
    val json = request.body.asJson.get
    val stock = json.as[Stock]
    println(stock)
    Ok
  }

}
