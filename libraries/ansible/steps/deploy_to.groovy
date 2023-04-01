void call(app_env){

    stage("Deploy to: ${app_env.long_name}")
    println("performing a deploying via ansible")
    app_env.ip_addresses.each{
        ip ->
            println "deploying to ${ip}"
    }

}