
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main(Messages("playauthenticate.login.title"),"login")/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""

  """),format.raw/*9.3*/("""<div class="row">
    <div class="span6">
      <h1>"""),_display_(/*11.12*/Messages("playauthenticate.login.title")),format.raw/*11.52*/("""</h1>
    </div>
  </div>

  <div id="login" class="row">

    <div class="span3">
      """),format.raw/*18.43*/("""
    	"""),_display_(/*19.7*/helper/*19.13*/.form(routes.Application.doLogin)/*19.46*/ {_display_(Seq[Any](format.raw/*19.48*/("""

        """),_display_(/*21.10*/if(loginForm.hasGlobalErrors)/*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""
          """),format.raw/*22.11*/("""<p class="error">
            <span class="label label-important">"""),_display_(/*23.50*/loginForm/*23.59*/.globalError.message),format.raw/*23.79*/("""</span>
          </p>
        """)))}),format.raw/*25.10*/("""

        """),_display_(/*27.10*/_emailPartial(loginForm)),format.raw/*27.34*/("""

        """),_display_(/*29.10*/inputPassword(
          loginForm("password"),
          '_showConstraints -> false,
          '_label -> Messages("playauthenticate.login.password.placeholder")
        )),format.raw/*33.10*/("""

        """),format.raw/*35.9*/("""<input type="submit" value=""""),_display_(/*35.38*/Messages("playauthenticate.login.now")),format.raw/*35.76*/("""" class="btn btn-primary"><br/>
        <br/>
        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(/*37.158*/Messages("playauthenticate.login.forgot.password")),format.raw/*37.208*/("""</a>

    	""")))}),format.raw/*39.7*/("""
    """),format.raw/*40.5*/("""</div>

    <div class="span3">
      """),_display_(/*43.8*/Messages("playauthenticate.login.oauth")),format.raw/*43.48*/("""
      """),format.raw/*44.48*/("""
      """),_display_(/*45.8*/_providerPartial(skipCurrent=false)),format.raw/*45.43*/("""
      """),_display_(/*46.8*/providerAvailable("basic")/*46.34*/ { available: Boolean =>_display_(Seq[Any](format.raw/*46.58*/("""
          """),_display_(/*47.12*/if(available)/*47.25*/ {_display_(Seq[Any](format.raw/*47.27*/("""
              """),format.raw/*48.15*/("""<br>
              <a href=""""),_display_(/*49.25*/com/*49.28*/.feth.play.module.pa.controllers.routes.Authenticate.authenticate("basic")),format.raw/*49.102*/("""">"""),_display_(/*49.105*/Messages("playauthenticate.login.basic")),format.raw/*49.145*/("""</a>
          """)))}),format.raw/*50.12*/("""
      """)))}),format.raw/*51.8*/("""
    """),format.raw/*52.5*/("""</div>

  </div>

""")))}),format.raw/*56.2*/("""
"""))}
  }

  def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/login.scala.html
                  HASH: 6011ea35e2de4e3e44e4574802e7831c534e4fab
                  MATRIX: 795->1|995->21|1023->119|1050->121|1112->175|1151->177|1181->181|1261->234|1322->274|1439->399|1472->406|1487->412|1529->445|1569->447|1607->458|1645->487|1685->489|1724->500|1818->567|1836->576|1877->596|1940->628|1978->639|2023->663|2061->674|2254->846|2291->856|2347->885|2406->923|2637->1126|2709->1176|2751->1188|2783->1193|2848->1232|2909->1272|2944->1320|2978->1328|3034->1363|3068->1371|3103->1397|3165->1421|3204->1433|3226->1446|3266->1448|3309->1463|3365->1492|3377->1495|3473->1569|3504->1572|3566->1612|3613->1628|3651->1636|3683->1641|3732->1660
                  LINES: 28->1|33->1|35->6|36->7|36->7|36->7|38->9|40->11|40->11|47->18|48->19|48->19|48->19|48->19|50->21|50->21|50->21|51->22|52->23|52->23|52->23|54->25|56->27|56->27|58->29|62->33|64->35|64->35|64->35|66->37|66->37|68->39|69->40|72->43|72->43|73->44|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|77->48|78->49|78->49|78->49|78->49|78->49|79->50|80->51|81->52|85->56
                  -- GENERATED --
              */
          