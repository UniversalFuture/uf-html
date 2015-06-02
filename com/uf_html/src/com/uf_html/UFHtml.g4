grammar UFHtml;

import UFHtmlLex;

//Mains
document: (directive SEMI*)* (element SEMI*)+;

//Semantics
directive: directive_single | directive_double;
directive_single: EXCLAMATION_POINT key=TAG_NAME;
directive_double: EXCLAMATION_POINT key=TAG_NAME value=TAG_NAME;
element locals [java.util.HashMap<String, String> attributes = new java.util.HashMap<String, String>()]
    : exclamation=EXCLAMATION_POINT? (emptyElement | fullElement) SEMI?;

//"Objects"
attr_set: (key=TAG_NAME
        | (key=TAG_NAME) EQUALS value=(STRING_LITERAL|NUMBER))
        {
            if ($value != null) {
                $element::attributes.put($key.text, $value.text);
            }
            else {
                $element::attributes.put($key.text, $key.text);
            }
        };
attrs: LBRACKET attr_set (COMMA attr_set)* RBRACKET;
elementType: (tagName=TAG_NAME | (tagName=TAG_NAME)? className=CLASS_NAME+
            | (tagName=TAG_NAME)? id=ID
            | ((tagName=TAG_NAME)? className=CLASS_NAME+ id=ID
            | (tagName=TAG_NAME)? id=ID className=CLASS_NAME+))
    {
        if ($id != null) {
            $element::attributes.put("id", $id.text.replaceAll("#", ""));
        }
        if ($className != null) {
            $element::attributes.put("class", $className.text.replaceAll("\\.", ""));
        }
    };
emptyElement: (elementType (attributes=attrs)? (RANGLE innerText=inner_Text)? SEMI
            | elementType (attributes=attrs)? LCURLY RCURLY ((innerText=inner_Text) SEMI)?);
fullElement: elementType (attributes=attrs)? LCURLY children=element+ RCURLY ((innerText=inner_Text) SEMI)?;

//Miscellaneous
inner_Text: STRING_LITERAL;
tag_name: TAG_NAME;
