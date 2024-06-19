package com.backend_final.demo.models;

import java.util.List;

public class ApiHelp {
    private String route;
    private String method;
    private String description;
    private List<String> parameters;

    public ApiHelp(String route, String method, String description, List<String> parameters) {
        this.route = route;
        this.method = method;
        this.description = description;
        this.parameters = parameters;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }
}
