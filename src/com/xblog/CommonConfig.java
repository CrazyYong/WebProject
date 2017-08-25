package com.xblog;

import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.xblog.controller.BlogController;

/**
 * Created by cmx on 2017/8/24.
 */
public class CommonConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
       me.setViewType(ViewType.JSP);
       me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/blog", BlogController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins me) {
    }

    public static DruidPlugin createDruidPlugin() {
        return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
