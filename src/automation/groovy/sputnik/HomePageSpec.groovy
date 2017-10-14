package sputnik

import geb.Browser
import geb.spock.GebReportingSpec

class HomePageSpec extends GebReportingSpec {
    def "Trivial Geb test for homepage"() {
        when: "go to homepage"
        Browser.drive {

            go "http://www.biying.cn"
            report "login screen2"
            go "http://www.baidu.com"
            report "login screen1"
        }
        then: "First page should load"
        report "login screen3"
        report "login screen4"
        title == "百度一下，你就知道"
    }
}
