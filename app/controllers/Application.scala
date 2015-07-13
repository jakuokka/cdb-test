package controllers

import models.Cat
import java.io.File
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import anorm._

import views._
import models._

/**
 * Manage a database of cats
 */
object Application extends Controller { 
  
  /**
   * This result directly redirect to the application home.
   */
  val Home = Redirect(routes.Application.list(0, 2, ""))
  
  /**
   * Describe the cat form (used in both edit and create screens).
   */ 
  val catForm = Form(
    mapping(
      "id" -> ignored(NotAssigned:Pk[Long]),
      "name" -> nonEmptyText,
      "gender" -> nonEmptyText,
      "color" -> nonEmptyText,
      "birth" -> optional(date("yyyy-MM-dd")),
      "race" -> optional(longNumber)
    )(Cat.apply)(Cat.unapply)

  
  )


  // -- Actions

/** 
 * Handle file upload, does not work yet 
 */
  def upload = Action(parse.multipartFormData) { request =>
  request.body.file("picture").map { picture =>
    import java.io.File
    val filename = picture.filename 
    val contentType = picture.contentType
    picture.ref.moveTo(new File("public/images/$filename"))
    Ok("File uploaded")
  }.getOrElse {
    Redirect(routes.Application.index).flashing(
      "error" -> "Missing file"
    )
  }
}

def upload2 = Action(parse.temporaryFile) { request =>
  request.body.moveTo(new File("/public/images"))
  Ok("File uploaded")
}




  /**
   * Handle default path requests, redirect to cats list
   */  
  def index = Action { Home }
  
  /**
   * Display the paginated list of cats.
   *
   * @param page Current page number (starts from 0)
   * @param orderBy Column to be sorted
   * @param filter Filter applied on cat names
   */
  def list(page: Int, orderBy: Int, filter: String) = Action { implicit request =>
    Ok(html.list(
      Cat.list(page = page, orderBy = orderBy, filter = ("%"+filter+"%")),
      orderBy, filter
    ))
  }
  
  /**
   * Display the 'edit form' of a existing Cat.
   *
   * @param id Id of the cat to edit
   */
  def edit(id: Long) = Action {
    Cat.findById(id).map { cat =>
      Ok(html.editForm(id, catForm.fill(cat)))
    }.getOrElse(NotFound)
  }
  
  /**
   * Handle the 'edit form' submission 
   *
   * @param id Id of the cat to edit
   */
  def update(id: Long) = Action { implicit request =>
    catForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.editForm(id, formWithErrors)),
      cat => {
        Cat.update(id, cat)
        Home.flashing("success" -> "Cat %s has been updated".format(cat.name))
      }
    )
  }
  
  /**
   * Display the 'new cat form'.
   */
  def create = Action {
    Ok(html.createForm(catForm))
  }
  
  /**
   * Handle the 'new cat form' submission.
   */
  def save = Action { implicit request =>
    catForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.createForm(formWithErrors)),
      cat => {
        Cat.insert(cat)
        Home.flashing("success" -> "Cat %s has been created".format(cat.name))
      }
    )
  }
  
  /**
   * Handle cat deletion.
   */
  def delete(id: Long) = Action {
    Cat.delete(id)
    Home.flashing("success" -> "Cat has been deleted")
  }

}
            