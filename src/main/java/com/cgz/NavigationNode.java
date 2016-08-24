package com.cgz;

import java.net.URL;
import java.util.List;

/**
 * Created by czarek on 24.08.16.
 */
public class NavigationNode {

    private URL url;
    private String label;
    private List<NavigationNode> subnodes;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<NavigationNode> getSubnodes() {
        return subnodes;
    }

    public void setSubnodes(List<NavigationNode> subnodes) {
        this.subnodes = subnodes;
    }
}
