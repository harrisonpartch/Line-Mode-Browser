package net.garmine.parser.html.elements;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Height;
import net.garmine.parser.html.attributes.Src;
import net.garmine.parser.html.attributes.Type;
import net.garmine.parser.html.attributes.Width;

public class Embed extends Element {
	public  height;
	public  src;
	public  type;
	public  width;

	public Embed(Element parent, HtmlAttributeToken[] attrs){
		super(parent, attrs);

		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "height":
					height = Height.parse(this, v);
					break;
				case "src":
					src = Src.parse(this, v);
					break;
				case "type":
					type = Type.parse(this, v);
					break;
				case "width":
					width = Width.parse(this, v);
					break;
			}
		}
	}
}

