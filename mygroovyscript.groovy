def buildApp() {
    echo 'building the application'
}

def testApp() {
    echo 'testing the application'
}

def deployApp() {
    echo 'deployeing the application'
    echo 'deploying version ${params.VERSION}'
}

return this
