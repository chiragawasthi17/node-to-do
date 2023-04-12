job('job dsl new2')
{
    description('this is our first job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/cv.git", 'main')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t web-app2 . && docker run -itd --name web-app2 -p 8887:8000 web-app2')
    }
}
