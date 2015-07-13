
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Cat],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(catForm: Form[Cat]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq(format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.75*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Add a cat</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.Application.save(),'enctype -> "multipart/form-data")/*11.71*/ {_display_(Seq(format.raw/*11.73*/("""
        
        <fieldset>
        
            """),_display_(Seq(/*15.14*/inputText(catForm("name"), '_label -> "Name"))),format.raw/*15.59*/("""
            """),_display_(Seq(/*16.14*/select(
                catForm("gender"), 
                options = options(Genders.list),
                '_default -> "--- Choose a Gender ---",
                '_label -> "Gender"
            ))),format.raw/*21.14*/("""
            
    
	    """),_display_(Seq(/*24.7*/inputText(catForm("color"), '_label -> "Color"))),format.raw/*24.54*/("""
            """),_display_(Seq(/*25.14*/inputText(catForm("birth"), '_label -> "Birthdate"))),format.raw/*25.65*/("""

            """),_display_(Seq(/*27.14*/select(
                catForm("race"), 
                Race.options, 
                '_label -> "Breed", '_default -> "-- Choose a breed --",
                '_showConstraints -> false
            ))),format.raw/*32.14*/("""
            
         <input type="file" name="picture">
	    
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this entry" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*40.23*/routes/*40.29*/.Application.list())),format.raw/*40.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*43.6*/("""
    
""")))})),format.raw/*45.2*/("""
"""))}
    }
    
    def render(catForm:Form[Cat]) = apply(catForm)
    
    def f:((Form[Cat]) => play.api.templates.Html) = (catForm) => apply(catForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 13 14:49:38 EEST 2015
                    SOURCE: /home/jakuokka/java/play-2.0/test/app/views/createForm.scala.html
                    HASH: 553a41aa67e2a0191979a3817344fd523399b98b
                    MATRIX: 513->1|618->42|650->66|724->21|752->40|780->115|813->119|824->123|857->125|926->164|1000->229|1035->231|1117->282|1184->327|1229->341|1449->539|1504->564|1573->611|1618->625|1691->676|1737->691|1961->893|2221->1122|2236->1128|2277->1147|2363->1202|2401->1209
                    LINES: 19->1|22->5|22->5|23->1|25->4|26->5|28->7|28->7|28->7|32->11|32->11|32->11|36->15|36->15|37->16|42->21|45->24|45->24|46->25|46->25|48->27|53->32|61->40|61->40|61->40|64->43|66->45
                    -- GENERATED --
                */
            