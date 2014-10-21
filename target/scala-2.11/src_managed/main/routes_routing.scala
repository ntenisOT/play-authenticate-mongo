// @SOURCE:/Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/conf/routes
// @HASH:6caaefd4ef4f1d428984c768556744679d050c00
// @DATE:Tue Oct 21 02:44:11 EEST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_restricted1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restricted"))))
private[this] lazy val controllers_Application_restricted1_invoker = createInvoker(
controllers.Application.restricted(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "restricted", Nil,"GET", """""", Routes.prefix + """restricted"""))
        

// @LINE:8
private[this] lazy val controllers_Application_jsRoutes2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascript/routes.js"))))
private[this] lazy val controllers_Application_jsRoutes2_invoker = createInvoker(
controllers.Application.jsRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "jsRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascript/routes.js"""))
        

// @LINE:10
private[this] lazy val controllers_Application_profile3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
private[this] lazy val controllers_Application_profile3_invoker = createInvoker(
controllers.Application.profile(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Nil,"GET", """""", Routes.prefix + """profile"""))
        

// @LINE:12
private[this] lazy val controllers_Application_login4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login4_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
        

// @LINE:13
private[this] lazy val controllers_Application_doLogin5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_doLogin5_invoker = createInvoker(
controllers.Application.doLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:15
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_invoker = createInvoker(
com.feth.play.module.pa.controllers.Authenticate.logout(),
HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:16
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker = createInvoker(
com.feth.play.module.pa.controllers.Authenticate.authenticate(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
        

// @LINE:18
private[this] lazy val controllers_Application_signup8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_signup8_invoker = createInvoker(
controllers.Application.signup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
        

// @LINE:19
private[this] lazy val controllers_Application_doSignup9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
private[this] lazy val controllers_Application_doSignup9_invoker = createInvoker(
controllers.Application.doSignup(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
        

// @LINE:21
private[this] lazy val controllers_Signup_unverified10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
private[this] lazy val controllers_Signup_unverified10_invoker = createInvoker(
controllers.Signup.unverified(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
        

// @LINE:22
private[this] lazy val controllers_Signup_oAuthDenied11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
private[this] lazy val controllers_Signup_oAuthDenied11_invoker = createInvoker(
controllers.Signup.oAuthDenied(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
        

// @LINE:24
private[this] lazy val controllers_Signup_verify12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_verify12_invoker = createInvoker(
controllers.Signup.verify(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_Signup_exists13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
private[this] lazy val controllers_Signup_exists13_invoker = createInvoker(
controllers.Signup.exists(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
        

// @LINE:27
private[this] lazy val controllers_Signup_resetPassword14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
private[this] lazy val controllers_Signup_resetPassword14_invoker = createInvoker(
controllers.Signup.resetPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_Signup_doResetPassword15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
private[this] lazy val controllers_Signup_doResetPassword15_invoker = createInvoker(
controllers.Signup.doResetPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
        

// @LINE:30
private[this] lazy val controllers_Account_changePassword16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
private[this] lazy val controllers_Account_changePassword16_invoker = createInvoker(
controllers.Account.changePassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
        

// @LINE:31
private[this] lazy val controllers_Account_doChangePassword17_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
private[this] lazy val controllers_Account_doChangePassword17_invoker = createInvoker(
controllers.Account.doChangePassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
        

// @LINE:33
private[this] lazy val controllers_Account_verifyEmail18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
private[this] lazy val controllers_Account_verifyEmail18_invoker = createInvoker(
controllers.Account.verifyEmail(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
        

// @LINE:35
private[this] lazy val controllers_Account_link19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
private[this] lazy val controllers_Account_link19_invoker = createInvoker(
controllers.Account.link(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
        

// @LINE:37
private[this] lazy val controllers_Account_askLink20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
private[this] lazy val controllers_Account_askLink20_invoker = createInvoker(
controllers.Account.askLink(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
        

// @LINE:38
private[this] lazy val controllers_Account_doLink21_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
private[this] lazy val controllers_Account_doLink21_invoker = createInvoker(
controllers.Account.doLink(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
        

// @LINE:40
private[this] lazy val controllers_Account_askMerge22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
private[this] lazy val controllers_Account_askMerge22_invoker = createInvoker(
controllers.Account.askMerge(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
        

// @LINE:41
private[this] lazy val controllers_Account_doMerge23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
private[this] lazy val controllers_Account_doMerge23_invoker = createInvoker(
controllers.Account.doMerge(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
        

// @LINE:43
private[this] lazy val controllers_Signup_forgotPassword24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
private[this] lazy val controllers_Signup_forgotPassword24_invoker = createInvoker(
controllers.Signup.forgotPassword(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
        

// @LINE:44
private[this] lazy val controllers_Signup_doForgotPassword25_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
private[this] lazy val controllers_Signup_doForgotPassword25_invoker = createInvoker(
controllers.Signup.doForgotPassword(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
        

// @LINE:47
private[this] lazy val controllers_Assets_at26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at26_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Application.restricted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Application.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_restricted1_route(params) => {
   call { 
        controllers_Application_restricted1_invoker.call(controllers.Application.restricted())
   }
}
        

// @LINE:8
case controllers_Application_jsRoutes2_route(params) => {
   call { 
        controllers_Application_jsRoutes2_invoker.call(controllers.Application.jsRoutes())
   }
}
        

// @LINE:10
case controllers_Application_profile3_route(params) => {
   call { 
        controllers_Application_profile3_invoker.call(controllers.Application.profile())
   }
}
        

// @LINE:12
case controllers_Application_login4_route(params) => {
   call { 
        controllers_Application_login4_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:13
case controllers_Application_doLogin5_route(params) => {
   call { 
        controllers_Application_doLogin5_invoker.call(controllers.Application.doLogin())
   }
}
        

// @LINE:15
case com_feth_play_module_pa_controllers_Authenticate_logout6_route(params) => {
   call { 
        com_feth_play_module_pa_controllers_Authenticate_logout6_invoker.call(com.feth.play.module.pa.controllers.Authenticate.logout())
   }
}
        

// @LINE:16
case com_feth_play_module_pa_controllers_Authenticate_authenticate7_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker.call(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider))
   }
}
        

// @LINE:18
case controllers_Application_signup8_route(params) => {
   call { 
        controllers_Application_signup8_invoker.call(controllers.Application.signup())
   }
}
        

// @LINE:19
case controllers_Application_doSignup9_route(params) => {
   call { 
        controllers_Application_doSignup9_invoker.call(controllers.Application.doSignup())
   }
}
        

// @LINE:21
case controllers_Signup_unverified10_route(params) => {
   call { 
        controllers_Signup_unverified10_invoker.call(controllers.Signup.unverified())
   }
}
        

// @LINE:22
case controllers_Signup_oAuthDenied11_route(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Signup_oAuthDenied11_invoker.call(controllers.Signup.oAuthDenied(provider))
   }
}
        

// @LINE:24
case controllers_Signup_verify12_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify12_invoker.call(controllers.Signup.verify(token))
   }
}
        

// @LINE:25
case controllers_Signup_exists13_route(params) => {
   call { 
        controllers_Signup_exists13_invoker.call(controllers.Signup.exists())
   }
}
        

// @LINE:27
case controllers_Signup_resetPassword14_route(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword14_invoker.call(controllers.Signup.resetPassword(token))
   }
}
        

// @LINE:28
case controllers_Signup_doResetPassword15_route(params) => {
   call { 
        controllers_Signup_doResetPassword15_invoker.call(controllers.Signup.doResetPassword())
   }
}
        

// @LINE:30
case controllers_Account_changePassword16_route(params) => {
   call { 
        controllers_Account_changePassword16_invoker.call(controllers.Account.changePassword())
   }
}
        

// @LINE:31
case controllers_Account_doChangePassword17_route(params) => {
   call { 
        controllers_Account_doChangePassword17_invoker.call(controllers.Account.doChangePassword())
   }
}
        

// @LINE:33
case controllers_Account_verifyEmail18_route(params) => {
   call { 
        controllers_Account_verifyEmail18_invoker.call(controllers.Account.verifyEmail())
   }
}
        

// @LINE:35
case controllers_Account_link19_route(params) => {
   call { 
        controllers_Account_link19_invoker.call(controllers.Account.link())
   }
}
        

// @LINE:37
case controllers_Account_askLink20_route(params) => {
   call { 
        controllers_Account_askLink20_invoker.call(controllers.Account.askLink())
   }
}
        

// @LINE:38
case controllers_Account_doLink21_route(params) => {
   call { 
        controllers_Account_doLink21_invoker.call(controllers.Account.doLink())
   }
}
        

// @LINE:40
case controllers_Account_askMerge22_route(params) => {
   call { 
        controllers_Account_askMerge22_invoker.call(controllers.Account.askMerge())
   }
}
        

// @LINE:41
case controllers_Account_doMerge23_route(params) => {
   call { 
        controllers_Account_doMerge23_invoker.call(controllers.Account.doMerge())
   }
}
        

// @LINE:43
case controllers_Signup_forgotPassword24_route(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        controllers_Signup_forgotPassword24_invoker.call(controllers.Signup.forgotPassword(email))
   }
}
        

// @LINE:44
case controllers_Signup_doForgotPassword25_route(params) => {
   call { 
        controllers_Signup_doForgotPassword25_invoker.call(controllers.Signup.doForgotPassword())
   }
}
        

// @LINE:47
case controllers_Assets_at26_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at26_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     