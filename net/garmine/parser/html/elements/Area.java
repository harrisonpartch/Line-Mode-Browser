package net.garmine.parser.html.elements;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Alt;
import net.garmine.parser.html.attributes.Coords;
import net.garmine.parser.html.attributes.Href;
import net.garmine.parser.html.attributes.Hreflang;
import net.garmine.parser.html.attributes.Media;
import net.garmine.parser.html.attributes.Nohref;
import net.garmine.parser.html.attributes.Rel;
import net.garmine.parser.html.attributes.Shape;
import net.garmine.parser.html.attributes.Target;
import net.garmine.parser.html.attributes.Type;

public class Area extends Element {
	public  alt;
	public  coords;
	public  href;
	public  hreflang;
	public  media;
	public  nohref;
	public  rel;
	public  shape;
	public  target;
	public  type;

	public Area(Element parent, HtmlAttributeToken[] attrs){
		super(parent, attrs);

		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "alt":
					alt = Alt.parse(this, v);
					break;
				case "coords":
					coords = Coords.parse(this, v);
					break;
				case "href":
					href = Href.parse(this, v);
					break;
				case "hreflang":
					hreflang = Hreflang.parse(this, v);
					break;
				case "media":
					media = Media.parse(this, v);
					break;
				case "nohref":
					nohref = Nohref.parse(this, v);
					break;
				case "rel":
					rel = Rel.parse(this, v);
					break;
				case "shape":
					shape = Shape.parse(this, v);
					break;
				case "target":
					target = Target.parse(this, v);
					break;
				case "type":
					type = Type.parse(this, v);
					break;
			}
		}
	}
}

