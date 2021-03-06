package net.garmine.parser.html.elements;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Default;
import net.garmine.parser.html.attributes.Kind;
import net.garmine.parser.html.attributes.Label;
import net.garmine.parser.html.attributes.Src;
import net.garmine.parser.html.attributes.Srclang;

public class Track extends Element {
	public  default;
	public  kind;
	public  label;
	public  src;
	public  srclang;

	public Track(Element parent, HtmlAttributeToken[] attrs){
		super(parent, attrs);

		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "default":
					default = Default.parse(this, v);
					break;
				case "kind":
					kind = Kind.parse(this, v);
					break;
				case "label":
					label = Label.parse(this, v);
					break;
				case "src":
					src = Src.parse(this, v);
					break;
				case "srclang":
					srclang = Srclang.parse(this, v);
					break;
			}
		}
	}
}

