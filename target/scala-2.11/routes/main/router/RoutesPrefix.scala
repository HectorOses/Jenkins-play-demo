
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/example-app/conf/routes
// @DATE:Mon Sep 30 22:26:43 UTC 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
