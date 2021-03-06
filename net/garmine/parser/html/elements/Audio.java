package net.garmine.parser.html.elements;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Autoplay;
import net.garmine.parser.html.attributes.Controls;
import net.garmine.parser.html.attributes.Loop;
import net.garmine.parser.html.attributes.Muted;
import net.garmine.parser.html.attributes.Preload;
import net.garmine.parser.html.attributes.Src;

public class Audio extends Element {
	public  autoplay;
	public  controls;
	public  loop;
	public  muted;
	public  preload;
	public  src;

	public Audio(Element parent, HtmlAttributeToken[] attrs){
		super(parent, attrs);

		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "autoplay":
					autoplay = Autoplay.parse(this, v);
					break;
				case "controls":
					controls = Controls.parse(this, v);
					break;
				case "loop":
					loop = Loop.parse(this, v);
					break;
				case "muted":
					muted = Muted.parse(this, v);
					break;
				case "preload":
					preload = Preload.parse(this, v);
					break;
				case "src":
					src = Src.parse(this, v);
					break;
			}
		}
	}
}

