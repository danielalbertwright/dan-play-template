package controllers

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def tests = Action {
    Ok(views.html.tests())
  }

}