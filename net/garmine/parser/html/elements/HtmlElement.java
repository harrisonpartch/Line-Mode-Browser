package net.garmine.parser.html.elements;

import java.util.ArrayList;

import net.garmine.parser.html.tokenizer.tokens.HtmlAttributeToken;
import net.garmine.parser.html.attributes.Accesskey;
import net.garmine.parser.html.attributes.Class;
import net.garmine.parser.html.attributes.Contenteditable;
import net.garmine.parser.html.attributes.Contextmenu;
import net.garmine.parser.html.attributes.Dir;
import net.garmine.parser.html.attributes.Draggable;
import net.garmine.parser.html.attributes.Dropzone;
import net.garmine.parser.html.attributes.Hidden;
import net.garmine.parser.html.attributes.Id;
import net.garmine.parser.html.attributes.Lang;
import net.garmine.parser.html.attributes.Spellcheck;
import net.garmine.parser.html.attributes.Style;
import net.garmine.parser.html.attributes.Tabindex;
import net.garmine.parser.html.attributes.Title;
import net.garmine.parser.html.attributes.Translate;

public class HtmlElement {
	/** The parent element */
	public HtmlElement parent;
	
	public ArrayList<HtmlElement> children;
	
	/** Specifies a shortcut key to activate/focus the element. */
	public char accesskey;
	/** Specifies one or more (CSS) classes for the element. */
	public String[] classes;
	/**  */
	public boolean contenteditable;
	
	public String contextmenu;
	
	public Dir dir;
	
	public boolean draggable;
	
	public Dropzone dropzone;
	
	public boolean hidden;
	
	public String id;
	
	public String lang;
	
	public boolean spellcheck;
	
	public String style;
	
	public int tabindex;
	
	public String title;
	
	public boolean translate;
	
	public HtmlElement(HtmlElement parent, HtmlAttributeToken[] attrs){
		children = new ArrayList<>();
		this.parent = parent;
		if (parent != null) parent.children.add(this);
		
		for(HtmlAttributeToken attr:attrs){
			String v = attr.getValue();
			switch(attr.getName()){
				case "accesskey":
					accesskey = Accesskey.parse(this, v);
					break;
				case "contenteditable":
					contenteditable = Contenteditable.parse(this, v);
					break;
				case "contextmenu":
					contextmenu = Contextmenu.parse(this, v);
					break;
				case "dir":
					dir = Dir.parse(this, v);
					break;
				case "draggable":
					draggable = Draggable.parse(this, v);
					break;
				case "dropzone":
					dropzone = Dropzone.parse(this, v);
					break;
				case "hidden":
					hidden = Hidden.parse(this, v);
					break;
				case "id":
					id = Id.parse(this, v);
					break;
				case "lang":
					lang = Lang.parse(this, v);
					break;
				case "spellcheck":
					spellcheck = Spellcheck.parse(this, v);
					break;
				case "style":
					style = Style.parse(this, v);
					break;
				case "tabindex":
					tabindex = Tabindex.parse(this, v);
					break;
				case "title":
					title = Title.parse(this, v);
					break;
				case "translate":
					translate = Translate.parse(this, v);
					break;
					
				default:
					
					break;
			}
		}
	}
}