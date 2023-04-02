@BeforeStep
void before(){
    println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep({ hookContext.step.equals("build") })
void after(){
    println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step"
}