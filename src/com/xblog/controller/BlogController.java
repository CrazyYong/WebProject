package com.xblog.controller;

import com.jfinal.core.Controller;

/**
 * Created by cmx on 2017/8/24.
 */
public class BlogController extends Controller{

    public void index(){
        render("index.jsp");
    }
}
