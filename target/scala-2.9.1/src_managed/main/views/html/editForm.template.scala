
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Cat],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, catForm: Form[Cat]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq(format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/("""

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit cat</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.update(id),'enctype -> "multipart/form-data")/*11.75*/ {_display_(Seq(format.raw/*11.77*/("""
        
        <fieldset>
        
          """),_display_(Seq(/*15.12*/inputText(catForm("name"), '_label -> "Cat's name"))),format.raw/*15.63*/("""
	  """),_display_(Seq(/*16.5*/select(
                catForm("gender"), 
                options = options(Genders.list),
                '_default -> "--- Choose a Gender ---",
                '_label -> "Gender"
            ))),format.raw/*21.14*/("""
            
            """),_display_(Seq(/*23.14*/inputText(catForm("color"), '_label -> "Color"))),format.raw/*23.61*/("""
            """),_display_(Seq(/*24.14*/inputText(catForm("birth"), '_label -> "Birthdate"))),format.raw/*24.65*/("""
            
            """),_display_(Seq(/*26.14*/select(
                catForm("race"), 
                Race.options, 
                '_label -> "Breed", '_default -> "-- Choose a breed --",
                '_showConstraints -> false
            ))),format.raw/*31.14*/("""

	    <input type="file" name="picture">
	    
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this cat" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*39.23*/routes/*39.29*/.Application.list())),format.raw/*39.48*/("""" class="btn">Cancel</a> 
        </div>

	""")))})),format.raw/*42.3*/("""
	
     
   <a href=""""),_display_(Seq(/*45.14*/routes/*45.20*/.Application.delete(id))),format.raw/*45.43*/("""" 
   class="btn btn-danger" onclick="return confirm('Are you sure?');">Delete this cat</a>
	
	
""")))})),format.raw/*49.2*/("""
"""))}
    }
    
    def render(id:Long,catForm:Form[Cat]) = apply(id,catForm)
    
    def f:((Long,Form[Cat]) => play.api.templates.Html) = (id,catForm) => apply(id,catForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 13 16:37:13 EEST 2015
                    SOURCE: /home/jakuokka/java/play-2.0/test/app/views/editForm.scala.html
                    HASH: fcba6b40b93bf91fb0cc24e6d6c0ccdc3aaa7302
                    MATRIX: 516->1|631->52|663->76|737->31|765->50|793->125|825->128|836->132|869->134|937->172|1015->241|1050->243|1130->292|1203->343|1238->348|1458->546|1516->573|1585->620|1630->634|1703->685|1761->712|1985->914|2225->1123|2240->1129|2281->1148|2356->1192|2409->1214|2424->1220|2469->1243|2597->1340
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|32->11|32->11|32->11|36->15|36->15|37->16|42->21|44->23|44->23|45->24|45->24|47->26|52->31|60->39|60->39|60->39|63->42|66->45|66->45|66->45|70->49
                    -- GENERATED --
                */
            