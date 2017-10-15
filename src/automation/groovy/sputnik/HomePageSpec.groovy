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
        when: "搜索关键字redis"
        Browser.drive {
            go "http://www.baidu.com"
            $("#kw").value("redis")
            $("#su").click()
        }
        then: "redis搜索结果"
        title == "redis_百度搜索"
    }
}
