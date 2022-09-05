package com.example.cakefactory;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CakeFactoryController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/contact.mustache", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/pricing.mustache", method = RequestMethod.GET)
    public String pricing() {
        return "pricing";
    }

    @RequestMapping(value = "/about.mustache", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

    @RequestMapping(value = "/portfolio-item.mustache", method = RequestMethod.GET)
    public String portfolioItem() {
        return "portfolio-item";
    }
    @RequestMapping(value = "/blog-home.mustache", method = RequestMethod.GET)
    public String blogHome() {
        return "blog-home";
    }

    @RequestMapping(value = "/blog-post.mustache", method = RequestMethod.GET)
    public String blogPost() {
        return "blog-post";
    }

    @RequestMapping(value = "/portfolio-overview.mustache", method = RequestMethod.GET)
    public String portfolioOverview() {
        return "portfolio-overview";
    }
}
