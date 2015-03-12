package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.About;
import views.html.Aukahi;
import views.html.Index;
import views.html.Kamanu;
import views.html.Pueo;
import views.html.Store;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  public static Result store() {
    return ok(Store.render("Welcome to the home page."));
  }
  public static Result pueo() {
    return ok(Pueo.render("Welcome to the home page."));
  }
  public static Result aukahi() {
    return ok(Aukahi.render("Welcome to the home page."));
  }
  public static Result kamanu() {
    return ok(Kamanu.render("Welcome to the home page."));
  }
  public static Result about() {
    return ok(About.render("Welcome to the home page."));
  }

}
