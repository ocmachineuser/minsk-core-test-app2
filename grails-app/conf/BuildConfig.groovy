grails.work.dir = "target"

grails.servlet.version = "3.0"

grails.project.target.level = 1.8
grails.project.source.level = 1.8

grails.project.fork = [
        run: false,
        war: [maxMemory: 2048, minMemory: 1024, debug: false, maxPerm: 768, forkReserve: false],
        console: [maxMemory: 2048, minMemory: 1024, debug: false, maxPerm: 768],
        'maven-deploy': [maxMemory: 2048, minMemory: 1024, debug: false, maxPerm: 768]
]

grails.project.groupId = "com.jcatalog.minsk-core-test-app2"

// inline plugins
// grails.plugin.location."hot-folder" = "./plugins/hot-folder"
// @insert_inline_plugins_after_this_line

grails.project.dependency.resolution = {
    inherits("global") {
        excludes "cglib-nodep", "slf4j-log4j12", "stax-api", 'xpp3_min'
    }

    log "warn"

    dependencies {
    }

    plugins {
        // enables `grails maven-install` and `grails maven-deploy` commands
        build(':release:3.0.1')

        // regular plugins
        // runtime('com.jcatalog.grailsplugins:jcatalog-ui-tags:7.23.GA.16')
        // @insert_dependencies_plugins_after_this_line
        runtime('com.jcatalog.grailsplugins:minsk-core-test-plugin1:1.0.GA-SNAPSHOT')

    }
}