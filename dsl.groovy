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
        shell('docker build -t web-app1 . && docker run -itd --name web-app1 -p 8889:5000 web-app1')
    }
}
