// @SOURCE:/home/jakuokka/java/play-2.0/test/conf/routes
// @HASH:4b7746c46dffb0792dee3297f92f02b53c10da2c
// @DATE:Mon Jul 13 18:46:21 EEST 2015

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:28
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list(p:Int = 0, s:Int = 2, f:String = "") = {
   Call("GET", "/cats" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                        
 
// @LINE:21
// @LINE:20
def delete(id:Long) = {
   (id) match {
// @LINE:20
case (id) if true => Call("GET", "/cats/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
                                                                
// @LINE:21
case (id) if true => Call("POST", "/cats/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
                                                                    
   }
}
                                                        
 
// @LINE:12
def create() = {
   Call("GET", "/cats/new")
}
                                                        
 
// @LINE:28
def upload() = {
   Call("POST", "/")
}
                                                        
 
// @LINE:17
def update(id:Long) = {
   Call("POST", "/cats/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:13
def save() = {
   Call("POST", "/cats")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:16
def edit(id:Long) = {
   Call("GET", "/cats/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:24
class ReverseAssets {
    


 
// @LINE:25
// @LINE:24
def at(file:String) = {
   (file) match {
// @LINE:24
case (file) if true => Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                
// @LINE:25
case (file) if true => Call("POST", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                                    
   }
}
                                                        

                      
    
}
                            
}
                    


// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:28
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"/cats" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[Int]].to(2) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                                                        
 
// @LINE:21
// @LINE:20
def delete = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      if (true) {
      return _wA({method:"GET", url:"/cats/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
      if (true) {
      return _wA({method:"POST", url:"/cats/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
      }
   """
)
                                                        
 
// @LINE:12
def create = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"/cats/new"})
      }
   """
)
                                                        
 
// @LINE:28
def upload = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"/"})
      }
   """
)
                                                        
 
// @LINE:17
def update = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/cats/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:13
def save = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"/cats"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:16
def edit = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/cats/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:24
class ReverseAssets {
    


 
// @LINE:25
// @LINE:24
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"POST", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:28
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def list(p:Int, s:Int, f:String) = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[Int], classOf[String]))
)
                              
 
// @LINE:20
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def create() = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq())
)
                              
 
// @LINE:28
def upload() = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq())
)
                              
 
// @LINE:17
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def save() = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:16
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:25
// @LINE:24
class ReverseAssets {
    


 
// @LINE:24
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                