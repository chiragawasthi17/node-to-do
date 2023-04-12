job('job dsl')
{
    description('this is our first job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/cv.git", 'master')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t web-app1 .', 'docker run -itd --name web-app1 -p 8889:5000 web-app1')
    }
}