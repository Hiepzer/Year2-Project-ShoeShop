
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2-Project-ShoeShop/error/conf/routes
// @DATE:Fri Apr 05 17:49:05 IST 2019

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}