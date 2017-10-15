package sputnik

import geb.Browser
import geb.spock.GebReportingSpec

class HomePageSpec extends GebReportingSpec {
    def "打开主页"() {
        when: "go to homepage"
        Browser.drive {
            go "http://www.baidu.com"
            report "打开主页"
        }
        then: "First page should load"
        report "打开主页title"
        title == "百度一下，你就知道"
    }

    def "搜索"() {
        when: "搜索关键字 spock"
        Browser.drive {
            go "http://www.baidu.com"
            $("#kw").value("spock")
            $("#su").click()
        }
        then: "spock搜索结果"
        title == "spock_百度搜索"
    }
}
