package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode  {
     String tagName;
     String tagNameClose;
     List<HtmlAttributeNode> attributes = new ArrayList<HtmlAttributeNode>();
     HtmlContentNode content;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HtmlAttributeNode> attributes) {
        this.attributes = attributes;
    }

    public HtmlContentNode getContent() {
        return content;
    }

    public void setContent(HtmlContentNode content) {
        this.content = content;
    }

    public String getTagNameClose() {
        return tagNameClose;
    }

    public void setTagNameClose(String tagNameClose) {
        this.tagNameClose = tagNameClose;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("<").append(tagName);
//
//        if (attributes != null) {
//            for (HtmlAttributeNode attribute : attributes) {
//                sb.append(" ").append(attribute);
//            }
//        }
//
//        if (content != null) {
//            sb.append(">").append(content).append("</").append(tagNameClose).append(">");
//        } else {
//            sb.append(" />");
//        }
//
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n').append("<").append(tagName);

        if (attributes != null) {
            for (HtmlAttributeNode attribute : attributes) {
                sb.append(" ").append(attribute);
            }
        }

        if (content != null) {
            sb.append(">  ").append(content).append('\n').append("</").append(tagNameClose).append(">  ");
        } else {
            sb.append(" />  ");
        }

        return sb.toString();
    }
}


