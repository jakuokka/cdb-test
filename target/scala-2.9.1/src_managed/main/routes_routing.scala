// @SOURCE:/home/jakuokka/java/play-2.0/test/conf/routes
// @HASH:4b7746c46dffb0792dee3297f92f02b53c10da2c
// @DATE:Mon Jul 13 18:46:21 EEST 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_list1 = Route("GET", PathPattern(List(StaticPart("/cats"))))
                    

// @LINE:12
val controllers_Application_create2 = Route("GET", PathPattern(List(StaticPart("/cats/new"))))
                    

// @LINE:13
val controllers_Application_save3 = Route("POST", PathPattern(List(StaticPart("/cats"))))
                    

// @LINE:16
val controllers_Application_edit4 = Route("GET", PathPattern(List(StaticPart("/cats/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:17
val controllers_Application_update5 = Route("POST", PathPattern(List(StaticPart("/cats/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:20
val controllers_Application_delete6 = Route("GET", PathPattern(List(StaticPart("/cats/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:21
val controllers_Application_delete7 = Route("POST", PathPattern(List(StaticPart("/cats/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:24
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:25
val controllers_Assets_at9 = Route("POST", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:28
val controllers_Application_upload10 = Route("POST", PathPattern(List(StaticPart("/"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/cats""","""controllers.Application.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""GET""","""/cats/new""","""controllers.Application.create"""),("""POST""","""/cats""","""controllers.Application.save"""),("""GET""","""/cats/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""","""/cats/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""","""/cats/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""POST""","""/cats/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""","""/""","""controllers.Application.upload()"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(_root_.controllers.Application.list(p, s, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[Int], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Application_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.create, HandlerDef(this, "controllers.Application", "create", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_save3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.save, HandlerDef(this, "controllers.Application", "save", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_edit4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_Application_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_Application_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_Application_delete7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:25
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:28
case controllers_Application_upload10(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Nil))
   }
}
                    
}
    
}
                