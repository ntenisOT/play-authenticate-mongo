// @SOURCE:/Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/conf/routes
// @HASH:6caaefd4ef4f1d428984c768556744679d050c00
// @DATE:Tue Oct 21 02:44:11 EEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers {

// @LINE:16
// @LINE:15
class ReverseAuthenticate {


// @LINE:15
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:16
def authenticate(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                        

}
                          
}
                  

// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:25
def exists(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                        

// @LINE:24
def verify(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:21
def unverified(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                        

// @LINE:22
def oAuthDenied(provider:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                        

// @LINE:27
def resetPassword(token:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                        

// @LINE:28
def doResetPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                        

// @LINE:44
def doForgotPassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                        

// @LINE:43
def forgotPassword(email:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                        

}
                          

// @LINE:47
class ReverseAssets {


// @LINE:47
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {


// @LINE:40
def askMerge(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                        

// @LINE:41
def doMerge(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                        

// @LINE:33
def verifyEmail(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                        

// @LINE:37
def askLink(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                        

// @LINE:38
def doLink(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                        

// @LINE:30
def changePassword(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                        

// @LINE:35
def link(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                        

// @LINE:31
def doChangePassword(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                        

}
                          

// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:19
def doSignup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:10
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:8
def jsRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
}
                        

// @LINE:18
def signup(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                        

// @LINE:13
def doLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:7
def restricted(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "restricted")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:12
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
// @LINE:15
class ReverseAuthenticate {


// @LINE:15
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:16
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        

}
              
}
        

// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:25
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:24
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:21
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:22
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:27
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:28
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:44
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:43
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        

}
              

// @LINE:47
class ReverseAssets {


// @LINE:47
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {


// @LINE:40
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:41
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:33
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:37
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:38
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:30
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:35
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:31
def doChangePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:19
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:10
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
      }
   """
)
                        

// @LINE:18
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:13
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def restricted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.restricted",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers.ref {


// @LINE:16
// @LINE:15
class ReverseAuthenticate {


// @LINE:15
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:16
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      

}
                          
}
        

// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {


// @LINE:25
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:24
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:21
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:22
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:27
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:28
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:44
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:43
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      

}
                          

// @LINE:47
class ReverseAssets {


// @LINE:47
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {


// @LINE:40
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:41
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:33
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:37
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:38
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:30
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:35
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:31
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      

}
                          

// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:19
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doSignup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:10
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """assets/javascript/routes.js""")
)
                      

// @LINE:18
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:13
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def restricted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.restricted(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "restricted", Seq(), "GET", """""", _prefix + """restricted""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

}
                          
}
        
    