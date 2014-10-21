
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
object _emailPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(f: Form[_], constraints: Boolean = false):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/inputText(
  f("email"),
  '_showConstraints -> constraints,
  '_label -> Messages("playauthenticate.login.email.placeholder")
)))}
  }

  def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},constraints:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(f,constraints)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean) => play.twirl.api.HtmlFormat.Appendable) = (f,constraints) => apply(f,constraints)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/_emailPartial.scala.html
                  HASH: 764d8d11cc1fd4d0bc3019a52718e5ce1be1de20
                  MATRIX: 811->1|989->43|1017->96|1044->98
                  LINES: 28->1|32->1|34->5|35->6
                  -- GENERATED --
              */
          