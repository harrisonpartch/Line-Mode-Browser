package net.garmine.parser.html.elements;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Media;
import net.garmine.parser.html.attributes.Src;
import net.garmine.parser.html.attributes.Type;

public class Source extends Element {
	public  media;
	public  src;
	public  type;

	public Source(Element parent, HtmlAttributeToken[] attrs){
		super(parent, attrs);

		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "media":
					media = Media.parse(this, v);
					break;
				case "src":
					src = Src.parse(this, v);
					break;
				case "type":
					type = Type.parse(this, v);
					break;
			}
		}
	}
}

