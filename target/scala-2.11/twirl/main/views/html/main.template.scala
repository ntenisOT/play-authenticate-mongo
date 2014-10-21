
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*7.14*/lang()/*7.20*/.code()),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(/*9.13*/title),format.raw/*9.18*/("""</title>

    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">

    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.min.js")),format.raw/*19.55*/(""""></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Application.jsRoutes),format.raw/*20.43*/("""" defer="defer"></script>

    <!-- Le styles -->
    <link href=""""),_display_(/*23.18*/routes/*23.24*/.Assets.at("css/main.css")),format.raw/*23.50*/("""" rel="stylesheet">
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.at("css/bootstrap.min.css")),format.raw/*24.59*/("""" rel="stylesheet">


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href=""""),_display_(/*44.35*/routes/*44.41*/.Application.index()),format.raw/*44.61*/("""">Play! Authenticate</a>

          <div class="btn-group pull-right">
          """),_display_(/*47.12*/subjectPresentOr()/*47.30*/ {_display_(Seq[Any](format.raw/*47.32*/("""
          	"""),_display_(/*48.13*/defining(Application.getLocalUser(session()))/*48.58*/ { user =>_display_(Seq[Any](format.raw/*48.68*/("""
            """),format.raw/*49.13*/("""<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(/*50.42*/user/*50.46*/.name),format.raw/*50.51*/("""
              """),format.raw/*51.15*/("""<span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(/*54.29*/routes/*54.35*/.Application.profile()),format.raw/*54.57*/("""">"""),_display_(/*54.60*/Messages("playauthenticate.navigation.profile")),format.raw/*54.107*/("""</a></li>
              <li><a href=""""),_display_(/*55.29*/routes/*55.35*/.Account.link()),format.raw/*55.50*/("""">"""),_display_(/*55.53*/Messages("playauthenticate.navigation.link_more")),format.raw/*55.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(/*57.29*/com/*57.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*57.93*/(""""><i class="icon-off"></i> """),_display_(/*57.121*/Messages("playauthenticate.navigation.logout")),format.raw/*57.167*/("""</a></li>
            </ul>
            """)))}),format.raw/*59.14*/("""
          """)))}/*60.12*/{_display_(Seq[Any](format.raw/*60.13*/("""
            """),format.raw/*61.13*/("""<a href=""""),_display_(/*61.23*/routes/*61.29*/.Application.login()),format.raw/*61.49*/("""" class="btn btn-primary btn-mini """),_display_(/*61.84*/("disabled".when(nav == "login"))),format.raw/*61.117*/("""">"""),_display_(/*61.120*/Messages("playauthenticate.navigation.login")),format.raw/*61.165*/("""</a>
          """)))}),format.raw/*62.12*/("""
          """),format.raw/*63.11*/("""</div>


          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(/*68.27*/("active".when(nav == ""))),format.raw/*68.53*/(""""><a href=""""),_display_(/*68.65*/routes/*68.71*/.Application.index()),format.raw/*68.91*/("""">"""),_display_(/*68.94*/Messages("playauthenticate.navigation.home")),format.raw/*68.138*/("""</a></li>
              <li class=""""),_display_(/*69.27*/("active".when(nav == "restricted"))),format.raw/*69.63*/(""""><a href=""""),_display_(/*69.75*/routes/*69.81*/.Application.restricted()),format.raw/*69.106*/("""">"""),_display_(/*69.109*/Messages("playauthenticate.navigation.restricted")),format.raw/*69.159*/("""</a></li>

                """),_display_(/*71.18*/subjectNotPresent()/*71.37*/ {_display_(Seq[Any](format.raw/*71.39*/("""
			    	"""),format.raw/*72.9*/("""<li class=""""),_display_(/*72.21*/("active".when(nav == "signup"))),format.raw/*72.53*/(""""><a href=""""),_display_(/*72.65*/routes/*72.71*/.Application.signup()),format.raw/*72.92*/("""">"""),_display_(/*72.95*/Messages("playauthenticate.navigation.signup")),format.raw/*72.141*/("""</a></li>
			    """)))}),format.raw/*73.9*/("""
            """),format.raw/*74.13*/("""</ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(/*81.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*81.54*/ {_display_(Seq[Any](format.raw/*81.56*/("""
	      """),format.raw/*82.8*/("""<div class="alert alert-error">
	      	"""),_display_(/*83.10*/flash()/*83.17*/.get(Application.FLASH_ERROR_KEY)),format.raw/*83.50*/("""
	      """),format.raw/*84.8*/("""</div>
	    """)))}),format.raw/*85.7*/("""
	    """),_display_(/*86.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*86.56*/ {_display_(Seq[Any](format.raw/*86.58*/("""
	      """),format.raw/*87.8*/("""<div class="alert alert-success">
	      	"""),_display_(/*88.10*/flash()/*88.17*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*88.52*/("""
	      """),format.raw/*89.8*/("""</div>
	    """)))}),format.raw/*90.7*/("""
		"""),_display_(/*91.4*/content),format.raw/*91.11*/("""

    """),format.raw/*93.5*/("""<hr>

      <footer>
        <p>&copy; 2012-2014 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
        <p>
        <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
      </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 21 02:44:13 EEST 2014
                  SOURCE: /Users/ntenisOT/Dropbox/MyProjects/PlayProjects/play-authenticate-mongo-git/app/views/main.scala.html
                  HASH: c2cc7da2ceea4c46231aaf2d55d8965618df92b4
                  MATRIX: 734->1|972->49|1000->156|1027->157|1082->186|1096->192|1123->199|1173->223|1198->228|1657->660|1672->666|1726->699|1780->726|1795->732|1837->753|1931->820|1946->826|1993->852|2057->889|2072->895|2128->930|2756->1531|2771->1537|2812->1557|2921->1639|2948->1657|2988->1659|3028->1672|3082->1717|3130->1727|3171->1740|3303->1845|3316->1849|3342->1854|3385->1869|3524->1981|3539->1987|3582->2009|3612->2012|3681->2059|3746->2097|3761->2103|3797->2118|3827->2121|3898->2170|4003->2248|4015->2251|4097->2312|4153->2340|4221->2386|4293->2427|4324->2439|4363->2440|4404->2453|4441->2463|4456->2469|4497->2489|4559->2524|4614->2557|4645->2560|4712->2605|4759->2621|4798->2632|4926->2733|4973->2759|5012->2771|5027->2777|5068->2797|5098->2800|5164->2844|5227->2880|5284->2916|5323->2928|5338->2934|5385->2959|5416->2962|5488->3012|5543->3040|5571->3059|5611->3061|5647->3070|5686->3082|5739->3114|5778->3126|5793->3132|5835->3153|5865->3156|5933->3202|5981->3220|6022->3233|6167->3352|6223->3399|6263->3401|6298->3409|6366->3450|6382->3457|6436->3490|6471->3498|6514->3511|6547->3518|6605->3567|6645->3569|6680->3577|6750->3620|6766->3627|6822->3662|6857->3670|6900->3683|6930->3687|6958->3694|6991->3700
                  LINES: 26->1|30->1|32->5|33->6|34->7|34->7|34->7|36->9|36->9|46->19|46->19|46->19|47->20|47->20|47->20|50->23|50->23|50->23|51->24|51->24|51->24|71->44|71->44|71->44|74->47|74->47|74->47|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|81->54|81->54|81->54|81->54|81->54|82->55|82->55|82->55|82->55|82->55|84->57|84->57|84->57|84->57|84->57|86->59|87->60|87->60|88->61|88->61|88->61|88->61|88->61|88->61|88->61|88->61|89->62|90->63|95->68|95->68|95->68|95->68|95->68|95->68|95->68|96->69|96->69|96->69|96->69|96->69|96->69|96->69|98->71|98->71|98->71|99->72|99->72|99->72|99->72|99->72|99->72|99->72|99->72|100->73|101->74|108->81|108->81|108->81|109->82|110->83|110->83|110->83|111->84|112->85|113->86|113->86|113->86|114->87|115->88|115->88|115->88|116->89|117->90|118->91|118->91|120->93
                  -- GENERATED --
              */
          